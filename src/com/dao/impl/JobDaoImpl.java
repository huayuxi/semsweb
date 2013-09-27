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

import com.dao.JobDao;
import com.model.Job;
import com.util.BasicHibernateDao;
import com.util.DateUtil;
import com.util.LikeQueryUtil;

/**
 * @description: 招聘管理Dao实现类
 * @date: 2013-9-5 下午3:11:34
 * @author: lintz
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class JobDaoImpl extends BasicHibernateDao implements JobDao{
	/**
	 * @description: 新增招聘
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param job 招聘
	 * @return true or false
	 */
	public boolean addJob(Job job){
		job.setFbsj00(DateUtil.dateToString14(new Date()));
		try {
			this.getSession().save(job);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 删除招聘
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param Job 招聘
	 * @return true or false
	 */
	public boolean delJob(Job job){
		try {
			this.getSession().delete(job);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 更新招聘
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param Job 招聘
	 * @return true or false
	 */
	public boolean updateJob(Job job){
		try {
			this.getSession().update(job);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * @description: 根据登陆帐号查询招聘
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param zpid00 招聘ID
	 * @return 招聘
	 */
	public Job queryJob(int zpid00){
		Query query = this.getSession().createQuery("from Job where zpid00=?");
		query.setLong(0, zpid00);
		List<Job> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
	
	/**
	 * @description:查询全部招聘
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部招聘
	 */
	public List<Job> queryJob(Map properties, int pageNo, int pageSize){
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select * from tab_job where 1=1" + like+ " order by pxqz00 DESC";
		SQLQuery sqlQuery = this.getSession().createSQLQuery(sql);
		sqlQuery.addEntity(Job.class);
		sqlQuery.setFirstResult((pageNo - 1) * pageSize);
		sqlQuery.setMaxResults(pageSize);
		return sqlQuery.list();
	}
	
	/**
	 * @description:统计全部招聘
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countJob(Map properties){
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select count(*) from tab_job where 1=1" + like;
		String countStr = this.getSession().createSQLQuery(sql).uniqueResult().toString();
		int count = Integer.valueOf(countStr).intValue();
		return count;
	}
}
