package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * ���ص�ǰ����
	 * @param format ���ڸ�ʽ���磺yyyyMMdd
	 * @return
	 */
	public static String getNowDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(Calendar.getInstance().getTime());
	}

	/**
	 * �����������
	 * @param format ���ڸ�ʽ���磺yyyyMMdd
	 * @param days	������ڣ�����Ϊǰ����
	 * @return
	 */
	public static String getCompDate(String format, int days) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar nowdt = Calendar.getInstance();
		nowdt.add(Calendar.DATE, days);
		return sdf.format(nowdt.getTime());
	}

	/**
	 * ��������·� 
	 * @param format ���ڸ�ʽ���磺yyyyMMdd
	 * @param mons ����·ݣ�����Ϊǰ����
	 * @return
	 */
	public static String getCompMon(String format, int mons) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar nowdt = Calendar.getInstance();
		nowdt.add(Calendar.MONTH, mons);
		return sdf.format(nowdt.getTime());
	}
	
	/**
	 * ����ĳ������·�
	 * @param date �������� ����ʽΪ��yyyyMMdd��
	 * @param format �������ڸ�ʽ
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
	 * ���ؾ��mons�·ݵ���ĩ
	 * @param format �������ڸ�ʽ
	 * @param mons
	 * @return
	 */
	public static String getCompMonEnd(String format, int mons) {
		String date = getCompMon("yyyyMM", mons + 1) + "01";
		return getCompDate(date, format, -1);
	}

	/**
	 * ���ؾ�����date���mons�·ݵ���ĩ
	 * @param date ��������
	 * @param format �������ڸ�ʽ
	 * @param mons
	 * @return
	 */
	public static String getCompMonEnd(String date, String format, int mons) {
		String d = getCompMon(date, "yyyyMM", mons + 1) + "01";
		return getCompDate(d, format, -1);
	}
	/**
	 * ����date���������
	 * @param date ��������
	 * @param format �������ڸ�ʽ
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
	 * ����ʱ���ʽ��ת��
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
	 * �ַ���ת����
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
//	 * ������������֮������� ���ڸ�ʽyyyyMMdd
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
	 * ������������֮������� ���ڸ�ʽyyyyMMdd
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
		System.out.println(getNowDate("yyyyMMdd"));//��ǰ����
		System.out.println(getCompDate("yyyyMMdd", 3));//3���
		System.out.println(getCompDate("yyyyMMdd", -1));//1��ǰ
		System.out.println(getCompMon("yyyyMMdd", 1));//1�º� ��getCompDate("yyyyMMdd", 1)��ͬ
		System.out.println(getCompMon("yyyyMM", -1));//1��ǰ
		System.out.println(getCompMon("20170401", "yyyyMMdd", 5));//20170401 5�º�
		System.out.println(getCompMonEnd("yyyyMMdd", -1));//��ĩ		

		System.out.println(getDays("20151225", "20160101"));
		System.out.println(getDays("20160101", "20160125"));

	}
}
