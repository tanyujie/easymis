package com.easymis.commons.web.filter;

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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SSOFilter implements Filter{

	public static Logger logger = LoggerFactory.getLogger(SSOFilter.class);
    
	private String SSO_SERVER_URL;
	private String SSO_SERVER_VERIFY_URL;
	
	
	public void init(FilterConfig filterConfig) throws ServletException {
		SSO_SERVER_URL = filterConfig.getInitParameter("SSO_SERVER_URL");
		SSO_SERVER_VERIFY_URL = filterConfig.getInitParameter("SSO_SERVER_VERIFY_URL");
		if(SSO_SERVER_URL == null) logger.error("SSO_SERVER_URL is null.");
		if(SSO_SERVER_VERIFY_URL == null) logger.error("SSO_SERVER_VERIFY_URL is null.");
	}
	

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		 HttpServletRequest request = (HttpServletRequest) req;
		 HttpServletResponse response = (HttpServletResponse) res;
		 //请求中带有token，去sso-server验证token是否有效
		 String path="/login.action";
		 if(path.equals(request.getServletPath())){
			 chain.doFilter(req, res);
				return;
		 }
		 HttpSession session = request.getSession();
		 if(session.getAttribute("UserInfo") != null) {
			 chain.doFilter(req, res);
			    return;
		 }else{
			 response.sendRedirect(SSO_SERVER_URL.toString());
		 }
		}
	
	
	public void destroy() {
	}


}
