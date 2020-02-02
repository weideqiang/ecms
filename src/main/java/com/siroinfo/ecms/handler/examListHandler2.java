package com.siroinfo.ecms.handler;

import com.siroinfo.ecms.util.OracleObject;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class examListHandler2 extends BaseTypeHandler {
    @Override
    public Object getNullableResult(ResultSet arg0, String arg1)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public Object getNullableResult(CallableStatement arg0, int arg1)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setNonNullParameter(java.sql.PreparedStatement parameterSetter, int i,
                                    Object o, JdbcType jdbcType) throws SQLException {
        Connection conn = null;
        try {
            if(null != o){
                List<OracleObject> list = (ArrayList<OracleObject>) o;
                conn = DriverManager.getConnection("jdbc:oracle:thin:@10.172.92.169:1521:infodb", "efs", "efs");
                //这里必须得用大写，而且必须要引入一个包，如果不引入这个包的话字符串无法正常转换，包是：orai18n.jar
                ARRAY array = getArray(conn, "EXAMTRQTOBJECT", "EXAM_TRQT_LIST", list);
                parameterSetter.setArray(i, array);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            if(null != conn){
                conn.close();
            }
        }

    }
    @SuppressWarnings("rawtypes")
    private ARRAY  getArray(Connection con,String OracleObj, String Oraclelist, List<OracleObject> listData) throws Exception {
        ARRAY array = null;
        ArrayDescriptor desc = ArrayDescriptor.createDescriptor(Oraclelist, con);
        STRUCT[] structs = new STRUCT[listData.size()];
        if (listData != null && listData.size() > 0){
            StructDescriptor structdesc = new StructDescriptor(OracleObj, con);
            for (int i = 0; i < listData.size(); i++){
                //Object[] result = {listData.get(i).getType(),listData.get(i).getBusitype(),listData.get(i).getLinage(),listData.get(i).getLvl()};
                OracleObject examObject = listData.get(i);
                structs[i] = new STRUCT(structdesc, con, examObject.toArray());
            }
            array = new ARRAY(desc, con, structs);
        }else{
            array = new ARRAY(desc, con, structs);
        }
        return array;
    }

}
