/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao;

import com.model.NewsContent;

/**
 * @description: 新闻内容Dao接口
 * @date: 2013-8-23 下午4:26:03
 * @author: lintz
 */
public interface NewsContentDao {
	/**
	 * @description: 新增新闻内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param newsContent 新闻内容
	 * @return true or false
	 */
	public boolean addNewsContent(NewsContent newsContent);
	/**
	 * @description: 新增新闻内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param newsContent 新闻内容
	 * @return true or false
	 */
	public boolean delNewsContent(NewsContent newsContent);
	/**
	 * @description: 新增新闻内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param newsContent 新闻内容
	 * @return true or false
	 */
	public boolean updateNewsContent(NewsContent newsContent);
}
