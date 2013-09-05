/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.model.News;
import com.model.NewsContent;
import com.model.NewsDetail;
import com.model.SysUser;
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
	private List list;
	private int totalRecords;
	private int pageSize;
	private int pageNo;
	private String msg;
	
	/**
	 * @description:新增新闻
	 * @date: 2013-8-27 下午2:17:43
	 * @author： lintz
	 * @return
	 */
	public String addNews() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		SysUser sysUserSession = (SysUser) session.getAttribute("sysUser");
		if(news!=null&&newsContent!=null){
			news.setXwzz00(sysUserSession.getYhid00());
			if (newsService.addNews(news, newsContent)) {
				msg = "success";
			} else {
				msg = "error_error";
			}
		}		
		return SUCCESS;
	}
	
	/**
	 * @description:删除新闻
	 * @date: 2013-8-27 下午2:17:43
	 * @author： lintz
	 * @return
	 */
	public String deleteNews() {
		HttpServletRequest req = getRequest();
		int xwid00 =Integer.parseInt(req.getParameter("xwid00"));
		if (xwid00 != 0) {
			News newsObj = new News();
			newsObj.setXwid00(xwid00);
			if (newsService.delNews(newsObj)) {
				msg = "success";
			} else {
				msg = "error_sys";
			}
		} else {
			msg = "error_none";
		}
		return SUCCESS;
	}
	
	/**
	 * @description:更新新闻
	 * @date: 2013-8-27 下午2:17:43
	 * @author： lintz
	 * @return
	 */
	public String updateNews() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		
		SysUser sysUserSession = (SysUser) session.getAttribute("sysUser");
		if(news!=null&&newsContent!=null){
			news.setXwzz00(sysUserSession.getYhid00());
			if (newsService.updateNews(news, newsContent)) {
				msg = "success";
			} else {
				msg = "error_error";
			}
		}		
		return SUCCESS;
	}
	
	/**
	 * @description:查询全部新闻
	 * @date: 2013-8-27 下午2:17:43
	 * @author： lintz
	 * @return
	 */
	public String queryNews() {
		HttpServletRequest req = ServletActionContext.getRequest();
		String pageindex = req.getParameter("pageNo");
		String pagesize = req.getParameter("pageSize");
		Map properties = req.getParameterMap();
		if (pageindex != null && !pageindex.equals("")) {
			pageNo = Integer.valueOf(pageindex).intValue();
		} else {
			pageNo = 1;
		}
		if (pagesize != null && !pagesize.equals("")) {
			pageSize = Integer.valueOf(pagesize).intValue();
		} else {
			pageSize = 10;
		}
		totalRecords = this.newsService.countNews(properties);
		if (totalRecords != 0) {
			list = newsService.queryNews(properties, pageNo, pageSize);
		} else {
			list = new ArrayList();
		}
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
		String xwid = req.getParameter("xwid00");
		int xwid00=Integer.parseInt(xwid);
		newsDetail = newsService.queryNewsDetail(xwid00);
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
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
