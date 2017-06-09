package com.register.biz;

import com.util.bean.UserInfo;

public interface IRegisterBiz {
	public boolean checkUserIsNull(UserInfo user);
	public boolean register(UserInfo user);
	public boolean insert(UserInfo user) throws Exception;
}
