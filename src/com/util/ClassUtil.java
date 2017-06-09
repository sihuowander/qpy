package com.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.UUID;

public class ClassUtil {
	
	/**
	 * 根据完整类名返回一个Object实例
	 * @param classname
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Object getInstanceByClassName(String classname) {
		Object object = null;
		try {
			Class c = Class.forName(classname);
			object = c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return object;
	}
	
	/**
	 * 关闭常见资源
	 * @param obj
	 * @return
	 */
	public static boolean close(Object obj) {
		boolean rt = true;
		try {
			if (obj instanceof Connection)
				((Connection) obj).close();
			else if (obj instanceof PreparedStatement)
				((PreparedStatement) obj).close();
			else if (obj instanceof CallableStatement)
				((CallableStatement) obj).close();
			else if (obj instanceof ResultSet)
				((ResultSet) obj).close();
			else if (obj instanceof Socket)
				((Socket) obj).close();
			else if (obj instanceof FileInputStream)
				((FileInputStream) obj).close();
			else if (obj instanceof FileOutputStream)
				((FileOutputStream) obj).close();
			else if (obj instanceof BufferedReader)
				((BufferedReader) obj).close();
			else if (obj instanceof ServerSocket)
				((ServerSocket) obj).close();
			else if (obj instanceof InputStream)
				((InputStream) obj).close();
			else if (obj instanceof OutputStream)
				((OutputStream) obj).close();
			else
				rt = false;
		} catch (Exception e) {
			rt = false;
		}
		return rt;
	}
	/**
	 * 获取UUID 36位系统主键
	 * @return
	 */
	public static String getUuid(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(getUuid());
		System.out.println(getUuid().length());
	}
}
