package com.register.service;

import java.util.HashMap;
import java.util.Map;

import com.register.biz.IRegisterBiz;
import com.util.bean.UserInfo;

public class RegisterServiceImpl implements IRegisterService {
	
	private IRegisterBiz registerBiz;

	public void registerForEx(UserInfo user) throws Exception {
		
		
	}

	public Map registerForMap(UserInfo user) {
		Map result = new HashMap();
		String code = "001";
		String mess = "ע��ɹ�";
		boolean isNull = registerBiz.checkUserIsNull(user);
		if(!isNull){//Ӧ����ǰ̨����
			result.put("code", "002");
			result.put("mess", "���û���ע�ᣬ�����ظ�ע��");
			return result;
		}
		boolean isSucc = registerBiz.register(user);
		if(!isSucc){
			result.put("code", "003");
			result.put("mess", "ע��ʧ�ܣ����ݿ����ʧ��");
			return result;
		}
		result.put("code", code);
		result.put("mess", mess);
		return result;
	}

	public boolean insert(UserInfo user) throws Exception {
		
		return registerBiz.insert(user);
	}

	public boolean isExistUserBymac(String mac) {
		return false;
	}
	
}
