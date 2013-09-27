/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

import com.dao.NewsDao;
import com.model.News;
import com.util.BasicHibernateDao;
import com.util.DateUtil;
import com.util.LikeQueryUtil;

/**
 * @description: 新闻管理Dao实现类
 * @date: 2013-8-27 下午2:08:39
 * @author: lintz
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class NewsDaoImpl extends BasicHibernateDao implements NewsDao {
	/**
	 * @description: 新增新闻
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param news 新闻
	 * @return true or false
	 */
	public Integer addNews(News news) {
		Integer id = 0;
		news.setXwid00(0);// 设置新闻ID
		news.setLlsl00(0);// 设置浏览数量
		Date nowDate = new Date();
		news.setFbsj00(DateUtil.dateToString14(nowDate));
		news.setGxsj00(DateUtil.dateToString14(nowDate));
		try {
			id = (Integer) this.getSession().save(news);
		} catch (Exception e) {
			return 0;
		}
		return id;
	}
	
	/**
	 * @description: 删除新闻
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param news 新闻
	 * @return true or false
	 */
	public boolean delNews(News news) {
		try {
			this.getSession().delete(news);
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
	 * @return true or false
	 */
	public boolean updateNews(News news) {
		news.setGxsj00(DateUtil.dateToString14(new Date()));
		try {
			this.getSession().update(news);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	/**
	 * @description:根据新闻ID查询新闻
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param xwid00 新闻ID
	 * @return 新闻
	 */
	public News queryNews(int xwid00){
		Query query = this.getSession().createQuery("from News where xwid00=?");
		query.setLong(0, xwid00);
		List<News> list = query.list();
		return list.size() == 0 ? null : list.get(0);
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
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select * from tab_news where 1=1" + like+ " order by pxqz00 DESC";
		SQLQuery sqlQuery = this.getSession().createSQLQuery(sql);
		sqlQuery.addEntity(News.class);
		sqlQuery.setFirstResult((pageNo - 1) * pageSize);
		sqlQuery.setMaxResults(pageSize);
		return sqlQuery.list();
	}
	
	/**
	 * @description:统计全部新闻
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countNews(Map properties) {
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select count(*) from tab_news where 1=1" + like;
		String countStr = this.getSession().createSQLQuery(sql).uniqueResult().toString();
		int count = Integer.valueOf(countStr).intValue();
		return count;
	}
}
