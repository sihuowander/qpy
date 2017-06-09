package com.login.service;

import com.util.bean.UserInfo;

public interface ILoginService {
	
	public UserInfo login(UserInfo user)throws Exception;
	public UserInfo login(String username,String password)throws Exception;
	

}
