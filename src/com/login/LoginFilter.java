package com.login;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// ��requestǿת��htt...
		HttpServletRequest req = (HttpServletRequest) request;
		// ��ȡsession
		HttpSession ss = req.getSession();
		// ��session�л�ȡuser
		if (ss.getAttribute("user") == null) {
			System.err.println("�㻹û�е�¼");
			req.getSession().setAttribute("msg", "�����ȵ�¼");
			// �ض��򵽵�¼
			HttpServletResponse resp = (HttpServletResponse) response;
			resp.sendRedirect(req.getContextPath() + "/login.jsp");
		} else {
			// ����
			chain.doFilter(request, response);
		}

	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}
}
