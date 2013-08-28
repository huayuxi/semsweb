/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.NewsDetailDao;
import com.model.NewsDetail;
import com.util.BasicHibernateDao;

/**
 * @description: 新闻详情Dao实现类
 * @date: 2013-8-28 上午9:49:03
 * @author: lintz
 */
@SuppressWarnings("unchecked")
public class NewsDetailDaoImpl extends BasicHibernateDao implements NewsDetailDao{
	/**
	 * @description: 根据新闻ID查询新闻详情
	 * @date: 2013-8-28 上午9:47:38
	 * @author： lintz
	 * @param xwid00 新闻ID
	 * @return 新闻详情
	 */
    public NewsDetail queryNewsDetail(Integer xwid00){
		Query  query =this.getSession().createQuery("from NewsDetail where xwid00=?");
		query.setLong(0, xwid00);
		List<NewsDetail> list=query.list();
		return list.size()==0?null:list.get(0);
	}
}
