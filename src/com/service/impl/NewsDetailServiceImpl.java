/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.service.impl;

import com.dao.NewsDetailDao;
import com.model.NewsDetail;

/**
 * @description:
 * @date: 2013-8-28 上午10:10:27
 * @author: lintz
 */
public class NewsDetailServiceImpl {
	private NewsDetailDao newsDetailDao;
	
	/**
	 * @description: 根据新闻ID查询新闻详情
	 * @date: 2013-8-28 上午9:47:38
	 * @author： lintz
	 * @param xwid00 新闻ID
	 * @return 新闻详情
	 */
	public NewsDetail queryNewsDetail(Integer xwid00) {
		return newsDetailDao.queryNewsDetail(xwid00);
	}
	/*--------------------------get and set method------------------------------------*/
	public NewsDetailDao getNewsDetailDao() {
		return newsDetailDao;
	}
	
	public void setNewsDetailDao(NewsDetailDao newsDetailDao) {
		this.newsDetailDao = newsDetailDao;
	}
	
}
