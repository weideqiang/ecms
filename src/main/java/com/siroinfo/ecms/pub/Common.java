/**
 * @Title Communication.java
 * @Package trades.lib.comm
 * @Description TODO
 * @author kangjun
 * @time 2011-3-12 上午09:28:32
 * @version v1.0
 **/
package com.siroinfo.ecms.pub;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 
 * <DL><DT><B>
 * 标题
 * </B></DT><p><DD>
 * 交易公共方法
 * </DD></DL><p>
 * 
 * <DL><DT><B>使用范例</B></DT><p><DD>
 * 使用范例说明
 * </DD></DL><p>
 *
 * @version $Id$
 */
public class Common {
	
	/**
	 * 
	 * <DL>
	 * <DT><B> 比较证件类型是否一致</B></DT>
	 * <p>
	 * <DD>
	 * 详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 */

	    
	public static boolean compareTypeOfCertificate(String inputTypeOfCertificate,String backTypeOfCertificate ){
		String inputType = inputTypeOfCertificate;
		String backType = backTypeOfCertificate;
		boolean backFlag = false;
		String s = "";
		String str = "";
		if(inputType.equals("A")||inputType.equals("C")||inputType.equals("F")){
			s = "A";
		}else{
			s = inputType;
		}
		if(backType.equals("A")||backType.equals("C")||backType.equals("F")){
			str = "A";
		}else{
			str = backType;
		}
		if(s.equals(str)){
			backFlag = true;
		}else{
			backFlag = false;
		}
		return backFlag;
	}
	
	/**
	 * 
	 * <DL>
	 * <DT><B> 获取当前时间 </B></DT>
	 * <p>
	 * <DD>
	 * 详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 *
	 */
	public static String getTime() {
		Calendar c = new GregorianCalendar();
		String h;
		String m;
		String s;
		int hour = c.get(Calendar.HOUR_OF_DAY);
		if (hour < 10)
			h = "0" + hour;
		else
			h = String.valueOf(hour);
		int minute = c.get(Calendar.MINUTE);
		if (minute < 10)
			m = "0" + minute;
		else
			m = String.valueOf(minute);
		int second = c.get(Calendar.SECOND);
		if (second < 10)
			s = "0" + second;
		else
			s = String.valueOf(second);
		return h + m + s;
	}
	
	/**
	 * 
	 * <DL>
	 * <DT><B> 获取当前时间 </B></DT>
	 * <p>
	 * <DD>
	 * 详细介绍</DD>
	 * </DL>
	 * <p>
	 *
	 */
	public static String getTimeWithMS() {
		Calendar c = new GregorianCalendar();
		String h;
		String m;
		String s;
		String ms;
		int hour = c.get(Calendar.HOUR_OF_DAY);
		if (hour < 10)
			h = "0" + hour;
		else
			h = String.valueOf(hour);
		int minute = c.get(Calendar.MINUTE);
		if (minute < 10)
			m = "0" + minute;
		else
			m = String.valueOf(minute);
		int second = c.get(Calendar.SECOND);
		if (second < 10)
			s = "0" + second;
		else
			s = String.valueOf(second);
		int msecond = c.get(Calendar.MILLISECOND);
		if (msecond < 10){
			ms = "0" + msecond;
		}else if(msecond > 99){
			ms = String.valueOf(msecond).substring(0,2);
		}else{
			ms = String.valueOf(msecond);
		}
		return h + m + s + ms;
	}


	/**
	 * 从SOAP返回的字段中取出需要的字段
	 * @param map
	 * @param path
	 * @return
	 */
	public static Object parseField(Map<?,?> map,String path){
		String[] keyArray = path.split("/");
		return parseSoapField(map, keyArray, 1);
	}
	
	/**
	 * 从SOAP返回的字段中取出需要的字段
	 * @param map
	 * @param keyArray
	 * @param index
	 * @return
	 */
	private static Object parseSoapField(Map<?,?> map, String[] keyArray, int index){
		String key = keyArray[index];
		if(!map.containsKey(key)){
			return "";
		}
		if(index == keyArray.length - 1){
			Object object = map.get(key);
			if(object == null || object instanceof List<?>){
				return object;
			}
			return ((Map<?,?>)object).get("var");
		}else {
			return parseSoapField((Map<?, ?>) map.get(key), keyArray, index + 1);
		}
	}

	
	/**
	 * 将18位身份证转换成15位身份证,以便用来比较
	 * @param idCard	18位身份证号码
	 * @throws Exception
	 */
	
	public static String conver18to15(String idCard){
		String newidCard = "";
		StringBuffer sb = new StringBuffer(idCard);
		sb.deleteCharAt(17);
		sb.deleteCharAt(7);
		sb.deleteCharAt(6);
		newidCard = sb.toString();
		return newidCard;
	}
	

}