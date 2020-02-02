package com.siroinfo.ecms.pub;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class JSonLib {

    private String host;
    private int port = 30001;
    private String encoding="GBK";
    private int timeout;

    private String G_JMXID = "ActiveMQId";

    public JSonLib(Properties config) {
        host = config.getProperty("host", "127.0.0.1");
        String sPort = config.getProperty("port", "30001");
        String sTimeOut = config.getProperty("timeout", "60000");
        try {
            port = Integer.parseInt(sPort);
            timeout = Integer.parseInt(sTimeOut);
        } catch(NumberFormatException e) {
        }
    }

    public void send(Map<Object, Object> context, String messageId) throws Exception {
        context.put(G_JMXID, messageId);
        Gson gson = new Gson();
        Type type = new TypeToken<Map<Object, Object>>() {}.getType();
        String jsonStr = gson.toJson(context, type);

        Socket socket = new Socket();
        DataOutputStream dos = null;
        try {
            InetSocketAddress socketAddr = new InetSocketAddress(host, port);
            socket.setSoTimeout(timeout);
            socket.connect(socketAddr, timeout);
            OutputStream os = socket.getOutputStream();
            dos = new DataOutputStream(os);
            byte[] data = jsonStr.getBytes(encoding);
            dos.writeInt(data.length);
            dos.write(data);
        } finally {
            if(dos != null) {
                dos.close();
            }
            if(socket != null) {
                socket.close();
            }
        }
    }

    public void recv(Map<Object, Object> context, String messageId) throws Exception {

    }

    public void exchange(Map<Object, Object> context,
                         String messageId, Map<Object, Object> ctx) throws Exception {
        context.put(G_JMXID, messageId);
        Gson gson = new Gson();
        Type type = new TypeToken<Map<Object, Object>>() {}.getType();
        String jsonStr = gson.toJson(context, type);

        Socket socket = new Socket();
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {
            InetSocketAddress socketAddr = new InetSocketAddress(host, port);
            socket.setSoTimeout(timeout);
            socket.connect(socketAddr, timeout);
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);
            byte[] data = jsonStr.getBytes(encoding);
            dos.writeInt(data.length);
            dos.write(data);

            int length = dis.readInt();
            data = new byte[length];
            dis.readFully(data);

            String retStr = new String(data, encoding);
//			System.out.println(retStr);

            JSONObject rootObject = new JSONObject(retStr);

            Map<Object, Object> map = convertJSONObjectToMap(rootObject);

            ctx.putAll(map);
        } finally {
            if(dis != null) {
                dis.close();
            }
            if(dos != null) {
                dos.close();
            }
            if(socket != null) {
                socket.close();
            }
        }
    }

    public Map<Object, Object> convertJSONObjectToMap(JSONObject jsonObject) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        Iterator<?> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = (String) keys.next();
            Object value = jsonObject.opt(key);
            if (value instanceof JSONObject) {
                map.put(key, convertJSONObjectToMap((JSONObject) value));
            } else if (value instanceof JSONArray) {
                map.put(key, convertJSONArrayToList((JSONArray) value));
            } else {
                map.put(key, value);
            }
        }
        return map;
    }

    private List<Object> convertJSONArrayToList(JSONArray jsonArray) {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < jsonArray.length(); i++) {
            Object valueObjet = jsonArray.opt(i);
            if (valueObjet instanceof JSONObject) {
                list.add(convertJSONObjectToMap((JSONObject) valueObjet));
            } else if (valueObjet instanceof JSONArray) {
                list.add(convertJSONArrayToList((JSONArray) valueObjet));
            } else {
                list.add(valueObjet);
            }
        }
        return list;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getTimeout() {
        return timeout;
    }

    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("host", "127.0.0.1");
        prop.setProperty("port", "20001");
        JSonLib lib = new JSonLib(prop);
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("name", "huangxd");
        map.put("age", 18);
        map.put("bool", new Boolean(true));
        map.put("long", new Long(35));
        map.put("short", new Short((short) 10));
        List<Object> list = new ArrayList<Object>();
        list.add("list-a");
        list.add(" ");
        list.add(25);
        Map<Object, Object> listmap = new HashMap<Object, Object>();
        listmap.put("school", "xidian");
        listmap.put("class", 963);
        list.add(listmap);
        map.put("detail", list);

        Map<Object, Object> ctx = new HashMap<Object, Object>();
        try {
            lib.exchange(map, "EFS20001", ctx);
            System.out.println(ctx);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
