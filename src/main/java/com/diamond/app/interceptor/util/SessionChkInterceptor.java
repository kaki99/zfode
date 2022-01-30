package com.diamond.app.interceptor.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionChkInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("session chekck interceptor preHandle");
		HttpSession session = request.getSession();
		if (session.getAttribute("loginUser") == null) {
			System.out.println("session is null");
			String uri = request.getRequestURI();
			String query = request.getQueryString();
			String path = uri;
			if (request.getMethod().equalsIgnoreCase("get")) {
				path = uri + "?" + query;
			}
			session.setAttribute("dest", path);
			response.sendRedirect("/loginForm.do");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("session chekck interceptor postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("session chekck interceptor afterCompletion");
	}

}
