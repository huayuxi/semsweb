/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @description: Action基础类
 * @date: 2012-11-14 下午02:44:07
 * @author: Lintz
 */
@SuppressWarnings("serial")
public class BaseAction extends ActionSupport implements ServletResponseAware,ServletRequestAware{
		private HttpServletRequest request;
		private HttpServletResponse response;
		public static final String NOIN ="noin";	
		public static final String AGAIN ="again"; 
		/**
		 * @return the request
		 */
		public HttpServletRequest getRequest() {
			return request;
		}

		/**
		 * @param request the request to set
		 */
		public void setRequest(HttpServletRequest request) {
			this.request = request;
		}

		/**
		 * @return the response
		 */
		public HttpServletResponse getResponse() {
			return response;
		}

		/**
		 * @param response the response to set
		 */
		public void setResponse(HttpServletResponse response) {
			this.response = response;
		}
		/**
		 * @param request the request to set
		 */
		public void setServletRequest(HttpServletRequest request) {

			this.request = request;
		}
		/**
		 * @param response the response to set
		 */
		public void setServletResponse(HttpServletResponse response) {
			this.response = response;
		}
	}
