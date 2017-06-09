package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 返回当前日期
	 * @param format 日期格式，如：yyyyMMdd
	 * @return
	 */
	public static String getNowDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(Calendar.getInstance().getTime());
	}

	/**
	 * 返回相对日期
	 * @param format 日期格式，如：yyyyMMdd
	 * @param days	相隔日期，负数为前几天
	 * @return
	 */
	public static String getCompDate(String format, int days) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar nowdt = Calendar.getInstance();
		nowdt.add(Calendar.DATE, days);
		return sdf.format(nowdt.getTime());
	}

	/**
	 * 返回相对月份 
	 * @param format 日期格式，如：yyyyMMdd
	 * @param mons 相隔月份，负数为前几月
	 * @return
	 */
	public static String getCompMon(String format, int mons) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar nowdt = Calendar.getInstance();
		nowdt.add(Calendar.MONTH, mons);
		return sdf.format(nowdt.getTime());
	}
	
	/**
	 * 返回某日相对月份
	 * @param date 参照日期 （格式为：yyyyMMdd）
	 * @param format 返回日期格式
	 * @param mons
	 * @return
	 */
	public static String getCompMon(String date, String format, int mons) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		SimpleDateFormat sdfin = new SimpleDateFormat("yyyyMMdd");
		Calendar cd = Calendar.getInstance();
		try {
			cd.setTime(sdfin.parse(date));
		} catch (ParseException e) {
			return "";
		}
		cd.add(Calendar.MONTH, mons);
		return sdf.format(cd.getTime());
	}

	/**
	 * 返回距今mons月份的月末
	 * @param format 返回日期格式
	 * @param mons
	 * @return
	 */
	public static String getCompMonEnd(String format, int mons) {
		String date = getCompMon("yyyyMM", mons + 1) + "01";
		return getCompDate(date, format, -1);
	}

	/**
	 * 返回距日期date相隔mons月份的月末
	 * @param date 参照日期
	 * @param format 返回日期格式
	 * @param mons
	 * @return
	 */
	public static String getCompMonEnd(String date, String format, int mons) {
		String d = getCompMon(date, "yyyyMM", mons + 1) + "01";
		return getCompDate(d, format, -1);
	}
	/**
	 * 返回date的相对日期
	 * @param date 参照日期
	 * @param format 返回日期格式
	 * @param days
	 * @return
	 */
	public static String getCompDate(String date, String format, int days) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		SimpleDateFormat sdfin = new SimpleDateFormat("yyyyMMdd");
		Calendar cd = Calendar.getInstance();
		try {
			cd.setTime(sdfin.parse(date));
		} catch (ParseException e) {
			return "";
		}
		cd.add(Calendar.DATE, days);
		return sdf.format(cd.getTime());
	}

	/**
	 * 日期时间格式的转换
	 * @param inDate
	 * @param inFormat
	 * @param outFormat
	 * @return
	 */
	public static String cvtDateTime(String inDate, String inFormat, String outFormat) {
		SimpleDateFormat sdfin = new SimpleDateFormat(inFormat);
		SimpleDateFormat sdfout = new SimpleDateFormat(outFormat);
		Calendar cd = Calendar.getInstance();
		try {
			cd.setTime(sdfin.parse(inDate));
		} catch (ParseException e) {
			return "";
		}
		return sdfout.format(cd.getTime());
	}
	/**
	 * 字符串转日期
	 * @param inDate
	 * @param inFormat
	 * @return
	 */
	public static Date strToDate(String inDate, String inFormat) {
		SimpleDateFormat sdfin = new SimpleDateFormat(inFormat);
		Calendar cd = Calendar.getInstance();
		try {
			cd.setTime(sdfin.parse(inDate));
		} catch (ParseException e) {
			return new Date();
		}
		return cd.getTime();
	}
//	/**
//	 * 返回两个日期之间的天数 日期格式yyyyMMdd
//	 * @param bdate
//	 * @param edate
//	 * @return
//	 */
//	public static int daysAfter(String bdate, String edate) {
//		SimpleDateFormat sdfin = new SimpleDateFormat("yyyyMMdd");
//		Calendar cd = Calendar.getInstance();
//		try {
//			cd.setTime(sdfin.parse(bdate));
//			int bdays = cd.get(Calendar.DAY_OF_YEAR);
//			cd.setTime(sdfin.parse(edate));
//			int edays = cd.get(Calendar.DAY_OF_YEAR);
//			if (bdays == edays) {
//				return 1;
//			}
//
//			return edays - bdays;
//		} catch (ParseException e) {
//			return -1;
//		}
//	}

	/**
	 * 返回两个日期之间的天数 日期格式yyyyMMdd
	 * @param bdate
	 * @param edate
	 * @return
	 */
	public static int getDays(String bdate, String edate) {
		SimpleDateFormat sdfin = new SimpleDateFormat("yyyyMMdd");
		Calendar cd = Calendar.getInstance();
		try {
			cd.setTime(sdfin.parse(bdate));
			long bdays = cd.getTimeInMillis();
			cd.setTime(sdfin.parse(edate));
			long edays = cd.getTimeInMillis();
			if (bdays == edays) {
				return 0;
			}
			long days = (edays - bdays) / (1000 * 3600 * 24);
			return Integer.valueOf(String.valueOf(days));

		} catch (ParseException e) {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getNowDate("yyyyMMdd"));//当前日期
		System.out.println(getCompDate("yyyyMMdd", 3));//3天后
		System.out.println(getCompDate("yyyyMMdd", -1));//1天前
		System.out.println(getCompMon("yyyyMMdd", 1));//1月后 与getCompDate("yyyyMMdd", 1)相同
		System.out.println(getCompMon("yyyyMM", -1));//1月前
		System.out.println(getCompMon("20170401", "yyyyMMdd", 5));//20170401 5月后
		System.out.println(getCompMonEnd("yyyyMMdd", -1));//月末		

		System.out.println(getDays("20151225", "20160101"));
		System.out.println(getDays("20160101", "20160125"));

	}
}
