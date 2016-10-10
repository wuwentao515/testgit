package com.sinoway.cisp.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CommonInterceptor extends HandlerInterceptorAdapter {

	private static Log logger = LogFactory.getLog(CommonInterceptor.class);

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = true;
		// 判断session里是否有用户信息
		if (null != request.getSession(false)){
			if(null != request.getSession(false).getAttribute("user")){
    		}else{
    			if(!(request.getRequestURL().indexOf("welcome") >= 0)){
	    			logger.info(request.getRequestURL());
	            	response.sendRedirect("login.jsp");
	    			flag = false;
    			}else{
    				logger.info(request.getRequestURL());
    			}
    		}
    	}else{
    		response.sendRedirect("login.jsp");
			flag = false;
    	}
		return flag;
	}
}
