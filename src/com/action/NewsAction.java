/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.model.News;
import com.model.NewsContent;
import com.model.NewsDetail;
import com.service.NewsDetailService;
import com.service.NewsService;
import com.util.BaseAction;

/**
 * @description:新闻管理Action类
 * @date: 2013-8-27 上午11:39:05
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class NewsAction extends BaseAction {
	
	private static final long serialVersionUID = 8865800908626605495L;
	private News news;
	private NewsContent newsContent;
	private NewsDetail newsDetail;
	private NewsService newsService;
	private NewsDetailService newsDetailService;
	private List list;
	private int totalRecords;
	private int pageSize;
	private int pageNo;
	
	/**
	 * @description:新增新闻
	 * @date: 2013-8-27 下午2:17:43
	 * @author： lintz
	 * @return
	 */
	public String addNews() {
		newsService.addNews(news, newsContent);
		return SUCCESS;
	}
	
	/**
	 * @description:删除新闻
	 * @date: 2013-8-27 下午2:17:43
	 * @author： lintz
	 * @return
	 */
	public String deleteNews() {
		newsService.delNews(news);
		return SUCCESS;
	}
	
	/**
	 * @description:更新新闻
	 * @date: 2013-8-27 下午2:17:43
	 * @author： lintz
	 * @return
	 */
	public String updateNews() {
		newsService.updateNews(news, newsContent);
		return SUCCESS;
	}
	
	/**
	 * @description:查询全部新闻
	 * @date: 2013-8-27 下午2:17:43
	 * @author： lintz
	 * @return
	 */
	public String queryNews() {
		return SUCCESS;
	}
	
	/**
	 * @description: 查询新闻新闻详情
	 * @date: 2013-8-28 上午11:13:13
	 * @author： lintz
	 * @return
	 */
	public String queryNewsDetail() {
		HttpServletRequest req = ServletActionContext.getRequest();
		String xwid00 = req.getParameter("xwid00");
		newsDetail = newsDetailService.queryNewsDetail(Integer.getInteger(xwid00));
		if (newsDetail != null)
			return SUCCESS;
		return ERROR;
	}
	
	/*---------------------set and get method----------------------------------*/
	public News getNews() {
		return news;
	}
	
	public void setNews(News news) {
		this.news = news;
	}
	
	public NewsContent getNewsContent() {
		return newsContent;
	}
	
	public void setNewsContent(NewsContent newsContent) {
		this.newsContent = newsContent;
	}
	
	public NewsDetail getNewsDetail() {
		return newsDetail;
	}
	
	public void setNewsDetail(NewsDetail newsDetail) {
		this.newsDetail = newsDetail;
	}
	
	public NewsService getNewsService() {
		return newsService;
	}
	
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	public NewsDetailService getNewsDetailService() {
		return newsDetailService;
	}
	
	public void setNewsDetailService(NewsDetailService newsDetailService) {
		this.newsDetailService = newsDetailService;
	}
	
	public List getList() {
		return list;
	}
	
	public void setList(List list) {
		this.list = list;
	}
	
	public int getTotalRecords() {
		return totalRecords;
	}
	
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
}
