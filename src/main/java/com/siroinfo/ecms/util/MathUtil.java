package com.siroinfo.ecms.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class MathUtil {
	private static long millisecondsOfOneDay = 1000 * 60 * 60 * 24;

	/**
	 * 
	 * <DL>
	 * <DT><B> 字符串数字相加 </B></DT>
	 * <p>
	 * <DD>可以将带千分符的两个字段相加</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param decimalLiteral1
	 *            被加数
	 * @param decimalLiteral2
	 *            加数
	 * @return String 和
	 */
	public static String addBigDecimal(String decimalLiteral1,
			String decimalLiteral2) {
		decimalLiteral1 = decimalLiteral1.replaceAll(",", "");
		decimalLiteral2 = decimalLiteral2.replaceAll(",", "");
		return getDecimal(decimalLiteral1).add(getDecimal(decimalLiteral2))
				.toString();
	}

	private static BigDecimal getDecimal(String literal) {
		if (literal == null || literal.length() == 0) {
			return new BigDecimal("0");// 改成"0"，为了兼容Java 1.4
		}
		if (literal.charAt(0) == '.') {
			return new BigDecimal("0" + literal);
		}
		return new BigDecimal(literal);
	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 字符串除法 </B></DT>
	 * <p>
	 * <DD>详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param decimalLiteral1
	 *            被除数
	 * @param decimalLiteral2
	 *            除数
	 * @param 小数点位数
	 * @return 商
	 */
	public static String divBigDecimal(String decimalLiteral1,
			String decimalLiteral2, int 小数点位数) {
		decimalLiteral1 = decimalLiteral1.replaceAll(",", "");
		decimalLiteral2 = decimalLiteral2.replaceAll(",", "");
		return getDecimal(decimalLiteral1).divide(getDecimal(decimalLiteral2),
				小数点位数, BigDecimal.ROUND_HALF_UP).toString();
	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 字符串除法 </B></DT>
	 * <p>
	 * <DD>详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param decimalLiteral1
	 *            被除数
	 * @param decimalLiteral2
	 *            除数
	 * @return 商(2位小数)
	 */
	public static String divBigDecimal(String decimalLiteral1,
			String decimalLiteral2) {
		return divBigDecimal(decimalLiteral1, decimalLiteral2, 2);
	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 字符串减法 </B></DT>
	 * <p>
	 * <DD>详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param decimalLiteral1
	 *            被减数
	 * @param decimalLiteral2
	 *            减数
	 * @return 差
	 */
	public static String subBigDecimal(String decimalLiteral1,
			String decimalLiteral2) {
		decimalLiteral1 = decimalLiteral1.replaceAll(",", "");
		decimalLiteral2 = decimalLiteral2.replaceAll(",", "");
		return getDecimal(decimalLiteral1)
				.subtract(getDecimal(decimalLiteral2)).toString();
	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 字符串的乘法 </B></DT>
	 * <p>
	 * <DD>详细介绍：字符串的乘法</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param decimalLiteral1
	 *            被乘数
	 * @param decimalLiteral2
	 *            乘数
	 * @return 积
	 */
	public static String mulBigDecimal(String decimalLiteral1,
			String decimalLiteral2) {
		decimalLiteral1 = decimalLiteral1.replaceAll(",", "");
		decimalLiteral2 = decimalLiteral2.replaceAll(",", "");
		return getDecimal(decimalLiteral1)
				.multiply(getDecimal(decimalLiteral2)).toString();
	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 字符串乘法，指定小数位数 </B></DT>
	 * <p>
	 * <DD>详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param decimalLiteral1
	 * @param decimalLiteral2
	 * @param 小数位数
	 * @return
	 */
	public static String mulBigDecimal(String decimalLiteral1,
			String decimalLiteral2, int 小数位数) {
		decimalLiteral1 = decimalLiteral1.replaceAll(",", "");
		decimalLiteral2 = decimalLiteral2.replaceAll(",", "");
		BigDecimal bd = getDecimal(decimalLiteral1).multiply(
				getDecimal(decimalLiteral2));
		bd = bd.setScale(小数位数, BigDecimal.ROUND_HALF_UP);
		return bd.toString();
	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 字符串的四舍五入 </B></DT>
	 * <p>
	 * <DD>详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param num
	 *            待四舍五入的字符串
	 * @param scale
	 *            保留小数位数
	 * @return 四舍五入后的字符串
	 * @throws Exception
	 */
	public static String round(String num, int scale) throws Exception {
		num = num.replaceAll(",", "");
		if (scale < 0) {
//			System.out.println("小数位数不能小于0");
			return "";
		}
		BigDecimal b = null;
		try {
			b = new BigDecimal(num);
		} catch (NumberFormatException e) {
//			System.out.println("待四舍五入的字符串含有非法字符");
			return "";
		}

		return b.setScale(scale, BigDecimal.ROUND_HALF_EVEN).toString();

	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 字符串的比较 </B></DT>
	 * <p>
	 * <DD>详细介绍:字符串的比较 .</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param decimalLiteral1
	 *            字符串一
	 * @param decimalLiteral2
	 *            字符串二
	 * @return 比较两个数字的大小，相等返回0，前者大于后者返回1，若小于返回-1
	 */
	public static int compare(String decimalLiteral1, String decimalLiteral2) {
		decimalLiteral1 = decimalLiteral1.replaceAll(",", "");
		decimalLiteral2 = decimalLiteral2.replaceAll(",", "");
		return getDecimal(decimalLiteral1).compareTo(
				getDecimal(decimalLiteral2));
	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 在当前日期上加上指定的天数 </B></DT>
	 * <p>
	 * <DD>
	 * 详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param dateString
	 *            八位日期字符串
	 * @param days
	 *            增加的天数，可以为负数
	 * @return 八位结果日期字符串
	 */
	public static String addDay(String dateString, int days) {
		return add(dateString, Calendar.DAY_OF_MONTH, days);
	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 在当前日期上加上指定的月数 </B></DT>
	 * <p>
	 * <DD>
	 * 详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param dateString
	 *            八位日期字符串
	 * @param months
	 *            增加的月数，可以是负数
	 * @return 八位结果日期字符串
	 */
	public static String addMonth(String dateString, int months) {
		return add(dateString, Calendar.MONTH, months);
	}

	/**
	 * 
	 * <DL>
	 * <DT><B> 在当前日期加上指定的年数 </B></DT>
	 * <p>
	 * <DD>
	 * 详细介绍</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param dateString
	 *            八位日期字符串
	 * @param years
	 *            增加的年数，可以是负数
	 * @return 八位结果日期字符串
	 */
	public static String addYear(String dateString, int years) {
		return add(dateString, Calendar.YEAR, years);
	}

	private static String add(String dateString, int field, int amount) {
		Date date;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		try {
			date = dateFormat.parse(dateString);
		} catch (ParseException e) {
			throw new IllegalArgumentException("0007 八位日期格式错误:" + dateString);
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(field, amount);
		return dateFormat.format(cal.getTime());
	}

	/**
	 * <DL>
	 * <DT><B> 计算两个日期之间的天数 </B></DT>
	 * <p>
	 * <DD>start 经过几天到达end</DD>
	 * </DL>
	 * <p>
	 * 
	 * @param start
	 *            起始日期
	 * @param end
	 *            截止日期
	 * @return 差异天数.以整天数计算，不考虑小于“天”的时间差异
	 */
	public static int daysBetween(Date start, Date end) {
		assert (start != null);
		assert (end != null);

		return (int) (end.getTime() / millisecondsOfOneDay - start.getTime()
				/ millisecondsOfOneDay);
	}

}