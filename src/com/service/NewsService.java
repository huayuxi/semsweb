/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.service;

import java.util.List;
import java.util.Map;

import com.model.News;
import com.model.NewsContent;
import com.model.NewsDetail;

/**
 * @description: 新闻管理Service接口
 * @date: 2013-8-23 下午4:24:44
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public interface NewsService {
	/**
	 * @description: 新增新闻
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param news 新闻
	 * @return true or false
	 */
	public boolean addNews(News news, NewsContent newsContent);
	
	/**
	 * @description: 删除新闻
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param news 新闻
	 * @return true or false
	 */
	public boolean delNews(News news);
	
	/**
	 * @description: 更新新闻
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param news 新闻
	 * @param newsContent 新闻内容
	 * @return true or false
	 */
	public boolean updateNews(News news,NewsContent newsContent);
	
	
	/**
	 * @description:查询全部新闻
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部新闻
	 */
    public List<News> queryNews(Map properties, int pageNo, int pageSize);
	
	/**
	 * @description:统计全部新闻
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countNews(Map properties);
	
	/**
	 * @description: 根据新闻ID查询新闻详情
	 * @date: 2013-8-28 上午9:47:38
	 * @author： lintz
	 * @param xwid00 新闻ID
	 * @return 新闻详情
	 */
	public NewsDetail queryNewsDetail(Integer xwid00);
}
