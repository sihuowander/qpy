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
			System.out.println("插入："+i+"条");
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
			System.out.println("修改："+i+"条");
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
			System.out.println("删除："+i+"条");
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
			int columnCount = rsmd.getColumnCount();//获取结果集的总列数
			while(rs.next()){
				Map row = new HashMap();
				for(int i=1;i<=columnCount;i++){
					Object value = rs.getObject(i);//下标以1开始
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
