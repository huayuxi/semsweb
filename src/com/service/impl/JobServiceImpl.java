/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.service.impl;

import java.util.List;
import java.util.Map;

import com.dao.JobDao;
import com.model.Job;
import com.service.JobService;

/**
 * @description: 招聘管理Service实现类
 * @date: 2013-9-5 下午3:19:30
 * @author: lintz
 */
@SuppressWarnings({ "rawtypes" })
public class JobServiceImpl implements JobService{
	private JobDao jobDao;
	
	/**
	 * @description: 新增招聘
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param job 招聘
	 * @return true or false
	 */
	public boolean addJob(Job job){
		return jobDao.addJob(job);
	}
	
	/**
	 * @description: 删除招聘
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param Job 招聘
	 * @return true or false
	 */
	public boolean delJob(Job job){
		return jobDao.delJob(job);
	}
	
	/**
	 * @description: 更新招聘
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param Job 招聘
	 * @return true or false
	 */
	public boolean updateJob(Job job){
		return jobDao.updateJob(job);
	}
	
	
	/**
	 * @description: 根据登陆帐号查询招聘
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param zpid00 招聘ID
	 * @return 招聘
	 */
	public Job queryJob(int zpid00){
		return jobDao.queryJob(zpid00);
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
		return jobDao.queryJob(properties, pageNo, pageSize);
	}
	
	/**
	 * @description:统计全部招聘
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countJob(Map properties){
		return jobDao.countJob(properties);
	}
	
	/*---------------------------------------set and get method--------------------------------------*/
	public JobDao getJobDao() {
		return jobDao;
	}

	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
}
