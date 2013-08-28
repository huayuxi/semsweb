/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao.impl;

import com.dao.NewsContentDao;
import com.model.NewsContent;
import com.util.BasicHibernateDao;

/**
 * @description: 新闻内容管理Dao实现类
 * @date: 2013-8-27 下午2:13:03
 * @author: lintz
 */
public class NewsContentDaoImpl extends BasicHibernateDao implements NewsContentDao{
	/**
	 * @description: 新增新闻内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param newsContent 新闻内容
	 * @return true or false
	 */
	public boolean addNewsContent(NewsContent newsContent){
		try {
	        this.getSession().save(newsContent);
        } catch (Exception e) {
	        return false;
        }
		return true;
	}
	/**
	 * @description: 新增新闻内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param newsContent 新闻内容
	 * @return true or false
	 */
	public boolean delNewsContent(NewsContent newsContent){
		try {
	        this.getSession().delete(newsContent);
        } catch (Exception e) {
	        return false;
        }
		return true;
	}
	/**
	 * @description: 新增新闻内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param newsContent 新闻内容
	 * @return true or false
	 */
	public boolean updateNewsContent(NewsContent newsContent){
		try {
	        this.getSession().update(newsContent);
        } catch (Exception e) {
	        return false;
        }
		return true;
	}
}
