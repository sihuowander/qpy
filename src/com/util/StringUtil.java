package com.util;

import java.io.UnsupportedEncodingException;

public class StringUtil {
	/**
	 * 用空字符串除去NULL和空格
	 * @param o
	 * @return
	 */
	public static String nullToString(Object o){
		return trimNull(o, "");
	}
	
	/**
	 * 用 ifNullReturn 除去NULL和空格
	 * @param obj
	 * @param ifNullReturn
	 * @return
	 */
	public static String trimNull(Object obj, String ifNullReturn) {
		if (null == obj)
			return ifNullReturn;
		else {
			if (obj instanceof String)
				return ((String) obj).trim();
			else
				return obj.toString();
		}
	}
	/**
	 * 按指定编码处理字符串
	 * @param instr
	 * @param charsetName
	 * @return
	 */
	public static String strToStr(String instr,String charsetName) {
		try {
			return new String(instr.getBytes("roman8"), charsetName);
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
	/**
	 * 按指定编码处理字节数组
	 * @param bs
	 * @param charsetName
	 * @return
	 */
	public static String strToStr(byte[] bs,String charsetName) {
		try {
			return new String(bs, charsetName);
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
	
	public static boolean equalsIdno(String _idno1, String _idno2) {
		if (_idno1 == null || _idno2 == null)
			return false;
		else {
			String idno1 = _idno1.toUpperCase().trim();
			String idno2 = _idno2.toUpperCase().trim();
			if (idno1.length() == idno2.length() && idno1.equals(idno2))
				return true;
			else if (idno1.length() == 15
					&& idno2.length() == 18
					&& idno1.equals(idno2.substring(0, 6)
							+ idno2.substring(8, 17)))
				return true;
			else if (idno1.length() == 18
					&& idno2.length() == 15
					&& idno2.equals(idno1.substring(0, 6)
							+ idno1.substring(8, 17)))
				return true;
			else
				return false;
		}
	}
}
