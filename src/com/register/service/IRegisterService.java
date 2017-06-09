package com.register.service;

import java.util.Map;

import com.util.bean.UserInfo;

public interface IRegisterService {
	/**
	 * 将各种情况封装至Map
	 * @param user
	 * @return
	 */
	public Map registerForMap(UserInfo user);
	/**
	 * 根据异常判断注册结果
	 * @param user
	 * @throws Exception
	 */
	public void registerForEx(UserInfo user) throws Exception;
	
	public boolean insert(UserInfo user) throws Exception;
	
	public boolean isExistUserBymac(String mac);
}
