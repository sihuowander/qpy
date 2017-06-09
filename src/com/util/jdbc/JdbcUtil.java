package com.util.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcUtil {
	public static int insert(Connection conn,String sql){
		Statement stmt = null;
		int i = 0;
		try {
			stmt = conn.createStatement();
			i = stmt.executeUpdate(sql);
			System.out.println("���룺"+i+"��");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	public static int update(Connection conn,String sql){
		Statement stmt = null;
		int i = 0;
		try {
			stmt = conn.createStatement();
			i = stmt.executeUpdate(sql);
			System.out.println("�޸ģ�"+i+"��");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	public static int delete(Connection conn,String sql){
		Statement stmt = null;
		int i = 0;
		try {
			stmt = conn.createStatement();
			i = stmt.executeUpdate(sql);
			System.out.println("ɾ����"+i+"��");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	@SuppressWarnings("unchecked")
	public static List queryForListWithMap(Connection conn,String sql){
		List result = new ArrayList();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData() ; 
			int columnCount = rsmd.getColumnCount();//��ȡ�������������
			while(rs.next()){
				Map row = new HashMap();
				for(int i=1;i<=columnCount;i++){
					Object value = rs.getObject(i);//�±���1��ʼ
					String key = rsmd.getColumnName(i);
					row.put(key, value);
				}
				result.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
