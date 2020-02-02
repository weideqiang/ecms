package com.siroinfo.ecms.util;

public class StringUtil {
    public static String millisToStringShort(long millis) {
        StringBuilder strBuilder = new StringBuilder();
        long temp = millis;
        long hper = 60 * 60 * 1000;
        long mper = 60 * 1000;
        long sper = 1000;
        if (temp / hper > 0) {
            strBuilder.append(temp / hper).append("小时");
        }
        temp = temp % hper;
        if (temp / mper > 0) {
            strBuilder.append(temp / mper).append("分钟");
        }
        temp = temp % mper;
        if (temp / sper > 0) {
            strBuilder.append(temp / sper).append("秒");
        }
        if (strBuilder == null || strBuilder.length() == 0) {
            strBuilder.append("0");
        }
        return strBuilder.toString();
    }
    public static String fillChar(String sSource, char ch, int nLen, boolean bLeft)
    {
        int nSrcLen = sSource.length();
        if (nSrcLen < nLen) {
            StringBuffer buffer = new StringBuffer();
            int i;
            if (bLeft) {
                for (i = 0; i < nLen - nSrcLen; ++i) {
                    buffer.append(ch);
                }
                buffer.append(sSource);
            } else {
                buffer.append(sSource);
                for (i = 0; i < nLen - nSrcLen; ++i)
                    buffer.append(ch);
            }
            return buffer.toString();
        }
        return sSource;
    }
    public static String convertObjectToString(Object str)
    {
        if (str == null)
            return "";
        return str.toString();
    }
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

}
