package com.register.biz;

import com.register.dao.IRegisterDao;
import com.util.bean.UserInfo;

public class RegisterBizImpl implements IRegisterBiz {
	private IRegisterDao registerDao;
	
	public boolean checkUserIsNull(UserInfo user) {
		UserInfo u = registerDao.queryUser(user);
		if(u!=null){
			return false;
		}
		return true;
	}

	public boolean register(UserInfo user) {
		int count = registerDao.insertUser(user);
		if(count>0){
			return true;
		}
		return false;
	}

	public boolean insert(UserInfo user) throws Exception {
		
		return registerDao.insert(user);
	}

}
