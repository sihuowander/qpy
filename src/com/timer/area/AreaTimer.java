package com.timer.area;

import java.sql.Connection;

import com.util.ClassUtil;
import com.util.bean.Wweather;
import com.util.jdbc.ConnectionUtil;
import com.util.jdbc.JdbcUtil;

public class AreaTimer {
	public static void main(String[] args) {
		Wweather w=new Wweather();
		String[] strArray=w.weather().split(",");
		for(int i=0;i<strArray.length;i++){
			String[] strArr=strArray[i].split("\\|");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String[] strArray2=w.secondCity(strArr[0]).split(",");
			for(int j=0;j<strArray2.length;j++){
				String[] strArray3=w.weatherCityId(strArray2[j].split("\\|")[0]).split(",");
				for(int m=0;m<strArray3.length;m++){
					
					String name = strArray3[m].split("\\|")[1];
					String code = w.weatherCityId(strArray3[m].split("\\|")[0]).split("\\|")[1];
					System.out.println(code+":"+name);
					String url = "jdbc:mysql://localhost:3306/qpy?user=root&useUnicode=true&characterEncoding=UTF8";
					Connection conn = ConnectionUtil.getConnection(url);
					String sql = "insert into Area(id,code,name) values('"+ClassUtil.getUuid()+"','"+code+"','"+name+"')";
					
					JdbcUtil.insert(conn, sql);
				}
			}
			
		}
	}
}