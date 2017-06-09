package com.util.bean;

import java.util.Date;

import com.util.DateUtil;
import com.util.StringUtil;

public class UserInfo {
	private String username;
	private String password;
	private String address;//现居住地
	private String idno;//身份证
	private Date birthday;
	private int age;
	private String mac;
	
	private String registerCode;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
//		this.birthday = getBirthDayByIdno(idno);
//		this.age = getAgeByBirthDay(idno);
	}
	public Date getBirthday() {
		return birthday;
	}

	public int getAge() {
		return age;
	}

	private Date getBirthDayByIdno(){
		String idno = StringUtil.nullToString(this.idno);
		if(!"".equals(idno)&&idno.length()>14){
			 String date = idno.substring(6, 8);
			 return DateUtil.strToDate(date, "yyyyMMdd");
		}else{
			return new Date();
		}
	}
//	private int getAgeByIdno(){
//		String idno = StringUtil.nullToString(this.idno);
//		if(!"".equals(idno)&&idno.length()>14){
//			 String date = idno.substring(6, 8);
//			 
//		}else{
//			return 0;
//		}
//	}
	public String getRegisterCode() {
		return registerCode;
	}
	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	
	
	
	
}
