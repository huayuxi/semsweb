/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.model.SysUser;

/**
 * @description:权限过滤器
 * @date: 2012-12-12 下午03:07:23
 * @author: Lintz
 */
public class AuthFilter implements Filter {
	private static final Logger LOGGER = Logger.getLogger(AuthFilter.class);
	protected FilterConfig filterConfig;

	/**
	 * @description:
	 * @date: 2012-12-12 下午03:07:23
	 * @author： Lintz
	 */
	public void destroy() {
		filterConfig = null;
	}

	/**
	 * @param arg0 请求
	 * @param arg1 响应
	 * @param arg2 通道
	 * @description:
	 * @date: 2012-11-6 下午03:53:09
	 * @author： Lintz
	 */
	public void loginPath(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) {
		String loginPath = "/pages/admin/login.jsp";
		RequestDispatcher loginDispatcher = arg0.getRequestDispatcher(loginPath);
		try {
			loginDispatcher.forward(arg0, arg1);
		} catch (ServletException e) {
			LOGGER.error(e, e);
		} catch (IOException e) {
			LOGGER.error(e, e);
		}
	}



	/**
	 * @param arg0 请求
	 * @param arg1 响应
	 * @param arg2 通道
	 * @description:
	 * @date: 2012-11-6 下午03:53:09
	 * @author： Lintz
	 */
	public void commonPath(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) {
		try {
			arg2.doFilter(arg0, arg1);
		} catch (IOException e) {
			LOGGER.error(e, e);
		} catch (ServletException e) {
			LOGGER.error(e, e);
		}
		return;
	}

	/**
	 * @param realUri 请求地址
	 * @return 是否过滤权限
	 * @description: 判断请求地址是否是过滤权限
	 * @date: 2012-12-13 下午12:40:21
	 * @author： Lintz
	 */
    public Boolean isAuth(String realUri) {
		List<String> authAll =new ArrayList<String>(); 
		authAll.add(0, "pages/admin/cases/.*");
		authAll.add(1, "pages/admin/news/.*");
		authAll.add(2, "pages/admin/product/.*");
		authAll.add(3, "pages/admin/solution/.*");
		authAll.add(4, "pages/admin/sysuser/.*");
		authAll.add(5, "pages/admin/job/.*");
		authAll.add(6, "system/.*");
		Boolean rs = false;
		for (int i = 0; i < authAll.size(); i++) {
			if (realUri.matches(authAll.get(i))) {
				LOGGER.info(realUri+"被监听");
				rs = true;
				break;
			}
		}
		return rs;
	}


	/**
	 * @param arg0 请求
	 * @param arg1 响应
	 * @param arg2 通道
	 * @description:
	 * @date: 2012-11-6 下午03:53:09
	 * @author： Lintz
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) {
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpSession session = req.getSession();
		String uri = req.getRequestURI();
		int length = req.getContextPath().length();
		String realUri = uri.substring(length+1, uri.length());
		if (isAuth(realUri)) {
			SysUser sysUser = null;
			sysUser = (SysUser) session.getAttribute("sysUser");
			if (sysUser == null) {
				loginPath(arg0, arg1, arg2);
			}else{
				commonPath(arg0, arg1, arg2);
				return;
			}
		} else {
			commonPath(arg0, arg1, arg2);
			return;
		}
	}

	/**
	 * @param fConfig 过滤器配置
	 * @description:
	 * @date: 2012-12-12 下午03:07:23
	 * @author： Lintz
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		filterConfig = fConfig;
	}

}
