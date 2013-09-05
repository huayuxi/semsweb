/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.service.impl;

import java.util.List;
import java.util.Map;

import com.dao.NewsContentDao;
import com.dao.NewsDao;
import com.dao.NewsDetailDao;
import com.model.News;
import com.model.NewsContent;
import com.model.NewsDetail;
import com.service.NewsService;

/**
 * @description:新闻管理Service实现类
 * @date: 2013-8-27 下午1:48:40
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class NewsServiceImpl implements NewsService {
	private NewsDao newsDao;
	private NewsContentDao newsContentDao;
	private NewsDetailDao newsDetailDao;
	
	/**
	 * @description: 新增新闻
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param news 新闻
	 * @param newsContent 新闻内容
	 * @return true or false
	 */
	public boolean addNews(News news, NewsContent newsContent) {
		Integer id = newsDao.addNews(news);
		newsContent.setXwnrid(id);
		return newsContentDao.addNewsContent(newsContent);
	}
	
	/**
	 * @description: 删除新闻
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param news 新闻
	 * @return true or false
	 */
	public boolean delNews(News news) {
		NewsContent newsContent = new NewsContent();
		newsContent.setXwnrid(news.getXwid00());
		try {
			newsDao.delNews(news);
			newsContentDao.delNewsContent(newsContent);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 更新新闻
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param news 新闻
	 * @param newsContent 新闻内容
	 * @return true or false
	 */
	public boolean updateNews(News news, NewsContent newsContent) {
		News newsRs=newsDao.queryNews(news.getXwid00());
		newsRs.setXwlx00(news.getXwlx00());
		newsRs.setPxqz00(news.getPxqz00());
		newsRs.setXwbt00(news.getXwbt00());
		newsContent.setXwnrid(news.getXwid00());
		return newsDao.updateNews(newsRs) && newsContentDao.updateNewsContent(newsContent);
	}
	
	/**
	 * @description:查询全部新闻
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部新闻
	 */
	public List<News> queryNews(Map properties, int pageNo, int pageSize) {
		return newsDao.queryNews(properties, pageNo, pageSize);
	}
	
	/**
	 * @description:统计全部新闻
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countNews(Map properties) {
		return newsDao.countNews(properties);
	}
	
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
	
	/*-----------------------------set and get method-----------------------------------------*/
	public NewsDao getNewsDao() {
		return newsDao;
	}
	
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}
	
	public NewsContentDao getNewsContentDao() {
		return newsContentDao;
	}
	
	public void setNewsContentDao(NewsContentDao newsContentDao) {
		this.newsContentDao = newsContentDao;
	}
	
	public NewsDetailDao getNewsDetailDao() {
		return newsDetailDao;
	}
	
	public void setNewsDetailDao(NewsDetailDao newsDetailDao) {
		this.newsDetailDao = newsDetailDao;
	}
	
}
