package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.service.ILoginService;

public class LoginServlet extends HttpServlet  {
	
	private ILoginService loginService;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		HttpSession ss = req.getSession();
		if (ss.getAttribute("user") == null) {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			
		}
	}

}
