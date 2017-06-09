package com.register.service;

import java.util.Map;

import com.util.bean.UserInfo;

public interface IRegisterService {
	/**
	 * �����������װ��Map
	 * @param user
	 * @return
	 */
	public Map registerForMap(UserInfo user);
	/**
	 * �����쳣�ж�ע����
	 * @param user
	 * @throws Exception
	 */
	public void registerForEx(UserInfo user) throws Exception;
	
	public boolean insert(UserInfo user) throws Exception;
	
	public boolean isExistUserBymac(String mac);
}
