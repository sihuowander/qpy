package com.util.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getConnection(){
		String url = "jdbc:mysql://localhost:3306/bjb?user=root&useUnicode=true&characterEncoding=UTF8";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
			conn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static Connection getConnection(String url,String username,String psw){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
			conn = DriverManager.getConnection(url,username,psw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static Connection getConnection(String url){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
			conn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		Connection conn = ConnectionUtil.getConnection();
		System.out.println(conn);
	}
}
