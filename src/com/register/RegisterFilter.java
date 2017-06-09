package com.register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.service.IRegisterService;
import com.util.SystemUtils;
import com.util.bean.UserInfo;

public class RegisterFilter extends HttpServlet{
	private IRegisterService  iRegisterService;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		String ip = request.getHeader("x-forwarded-for");  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("WL-Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getRemoteAddr();  
	    }  
		String mac = SystemUtils.getMacAddress(ip);
		
		boolean isExist = iRegisterService.isExistUserBymac(mac);
		UserInfo user = new UserInfo();
		user.setMac(mac);
		if(!isExist){
			try {
				iRegisterService.insert(user);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
