package com.util;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.service.CommonQueryService;

/**
 * 
 * @description:编码监听器
 * @date: 2012-10-23 下午03:13:38a
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class CodeListener implements ServletContextListener {
	
	private static CommonQueryService commonQueryService;

	/**
	 * 
	 * @return CommonQueryService
	 * @description:
	 * @date: 2012-10-23 下午03:11:39
	 * @author： lintz
	 */
	public static CommonQueryService getCommonQueryService() {
		return commonQueryService;
	}

	/**
	 * 
	 * @param commonQueryService CommonQueryService
	 * @return boolean
	 * @description:
	 * @date: 2012-10-23 下午03:11:55
	 * @author： lintz
	 */
	public static boolean setCommonQueryService(CommonQueryService commonQueryService) {
		CodeListener.commonQueryService = commonQueryService;
		return true;
	}
	
	private static final Logger LOGGER = Logger.getLogger(CodeListener.class);

	/**
	 * @param sce ServletContextEvent
	 * @date: 2012-10-23 下午03:12:49
	 * @author： lintz
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		LOGGER.info("开始清理代码表缓存...");
		CodeListUtil.destroy();
		LOGGER.info("代码表缓存清理完成。");

	}

	/**
	 * @param sce ServletContextEvent
	 * @date: 2012-10-23 下午03:12:49
	 * @author： lintz
	 */
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext ctx = sce.getServletContext();
		String realPath = ctx.getRealPath("/");
		initAa10Code(ctx,realPath);
	}
	
	/**
	 * 
	 * @param ctx ServletContext
	 * @param realPath 路径
	 * @description:初始化编码
	 * @date: 2012-10-24 下午02:45:58
	 * @author： lintz
	 */
	private void initAa10Code(final ServletContext ctx,String realPath) {
		LOGGER.info("开始初始化系统编码表数据...");
        List list = null;
		String sql = "SELECT * FROM sys_code";
		list = commonQueryService.doCommonQuery(sql);
		CodeListUtil.initCollListCodeListCache(list);
		CodeListUtil.initCodeList2Js(list,realPath);
		LOGGER.info("系统编码表数据初始化完成...");
	}
	
}
