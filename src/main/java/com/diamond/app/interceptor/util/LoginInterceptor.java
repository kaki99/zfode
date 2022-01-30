package com.diamond.app.interceptor.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("login interceptor preHandle");
		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("login interceptor postHandle");
		System.out.println("[login interceptor ModelAndView][ model 이름 : " + modelAndView.getViewName() + "][ model 내용 :" + modelAndView.getModel() + "]" );
		
		ModelMap model = modelAndView.getModelMap();
		Object obj = model.get("loginUserModel");
		if (obj != null) {
			System.out.println("obj: " + obj);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", obj);

			Object destObj = session.getAttribute("dest");
			System.out.println("destObj: " + destObj);
//			response.sendRedirect(destObj != null ? (String) destObj : request.getContextPath() + "/main.do");
			response.sendRedirect(destObj != null ? (String) destObj : "/main.do");
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("login interceptor afterCompletion");
	}

}
