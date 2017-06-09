package com.register.dao;

import com.util.bean.UserInfo;

public interface IRegisterDao {
	public UserInfo queryUser(UserInfo user);
	public int insertUser(UserInfo user);
	public boolean insert(UserInfo user) throws Exception;
}
