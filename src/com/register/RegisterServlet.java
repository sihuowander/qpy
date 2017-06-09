package com.register;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.service.IRegisterService;
import com.util.SystemUtils;
import com.util.bean.UserInfo;

public class RegisterServlet extends HttpServlet{
	
	private IRegisterService registerService;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
//		User user = (User)req.getAttribute("user");//前台jsp直接传递注册信息
		
//		String registerCode = user.getRegisterCode();
//		String ip = "";
//		if (req.getHeader("x-forwarded-for") == null) {  
//			ip = req.getRemoteAddr();  
//	    }else{
//	    	ip = req.getHeader("x-forwarded-for");  
//	    }
		
		String ip = req.getHeader("x-forwarded-for");  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = req.getHeader("Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = req.getHeader("WL-Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = req.getRemoteAddr();  
	    }  
	    
	    String mac = SystemUtils.getMacAddress(ip);
		System.out.println(ip+mac);
		
		
		String registerCode = req.getParameter("registerCode");
		UserInfo user = new UserInfo();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String password2 = req.getParameter("password2");
		String idno = req.getParameter("idno");
		if("map".equals(registerCode)){
			Map result = registerService.registerForMap(user);
			String code = (String)result.get("code");
			if("001".equals(code)){
				//注册成功
			}else if("002".equals(code)){
				
			}else{
				
			}
		}else{
			try {
				registerService.registerForEx(user);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
