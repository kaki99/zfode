package com.diamond.app.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CustomInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle");
		System.out.println("[preHandle][" + request + "]" + "[" + request.getMethod() + "]" + request.getRequestURI());
        System.out.println("[handler][" + handler.toString() + "]");
        
        HandlerMethod method = (HandlerMethod) handler;
        Class<? extends Object> cls = method.getBean().getClass();
        Method methodObj =method.getMethod();
        System.out.println("Bean : " + cls);
        System.out.println("method : " + methodObj);
        
        return true;

//        return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
		System.out.println("[ModelAndView][ model 이름 : " + modelAndView.getViewName() + "][ model 내용 :" + modelAndView.getModel() + "]" );
        
//		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion");
//		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
