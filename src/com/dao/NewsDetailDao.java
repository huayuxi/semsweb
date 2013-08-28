/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao;

import com.model.NewsDetail;

/**
 * @description: 新闻详情Dao接口类
 * @date: 2013-8-28 上午9:45:56
 * @author: lintz
 */
public interface NewsDetailDao {
	/**
	 * @description: 根据新闻ID查询新闻详情
	 * @date: 2013-8-28 上午9:47:38
	 * @author： lintz
	 * @param xwid00 新闻ID
	 * @return 新闻详情
	 */
	public NewsDetail queryNewsDetail(Integer xwid00);
}
