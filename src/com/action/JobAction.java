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

import com.model.Job;
import com.model.SysUser;
import com.service.JobService;
import com.util.BaseAction;

/**
 * @description: 招聘管理Action类
 * @date: 2013-9-5 下午3:26:36
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class JobAction extends BaseAction {
	
	private static final long serialVersionUID = 3432443793559432135L;
	private Job job;
	private JobService jobService;
	private List list;
	private int totalRecords;
	private int pageSize;
	private int pageNo;
	private String msg;
	
	/**
	 * @description: 新增招聘
	 * @date: 2013-9-5 下午3:34:34
	 * @author： lintz
	 * @return
	 */
	public String addJob() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		SysUser sysUserSession = (SysUser) session.getAttribute("sysUser");
		if(job!=null){
			job.setFbz000(sysUserSession.getYhid00());
			if (jobService.addJob(job)) {
				msg = "success";
			} else {
				msg = "error_error";
			}
		}		
		return SUCCESS;
	}
	
	/**
	 * @description: 更新招聘
	 * @date: 2013-9-5 下午3:34:57
	 * @author： lintz
	 * @return
	 */
	public String updateJob() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		
		SysUser sysUserSession = (SysUser) session.getAttribute("sysUser");
		if(job!=null){
			job.setFbz000(sysUserSession.getYhid00());
			if (jobService.updateJob(job)) {
				msg = "success";
			} else {
				msg = "error_error";
			}
		}		
		return SUCCESS;
	}
	
	/**
	 * @description: 删除招聘
	 * @date: 2013-9-5 下午3:35:11
	 * @author： lintz
	 * @return
	 */
	public String deleteJob() {
		HttpServletRequest req = getRequest();
		int zpid00 =Integer.parseInt(req.getParameter("zpid00"));
		if (zpid00 != 0) {
			Job jobObj = new Job();
			jobObj.setZpid00(zpid00);
			if (jobService.delJob(jobObj)) {
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
	 * @description: 查询招聘
	 * @date: 2013-9-5 下午3:35:30
	 * @author： lintz
	 * @return
	 */
	public String queryJob() {
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
		totalRecords = this.jobService.countJob(properties);
		if (totalRecords != 0) {
			list = jobService.queryJob(properties, pageNo, pageSize);
		} else {
			list = new ArrayList();
		}
		return SUCCESS;
	}
	/**
	 * @description: 查询招聘详情
	 * @date: 2013-9-5 下午3:35:47
	 * @author： lintz
	 * @return
	 */
	public String queryJobDetail() {
		return SUCCESS;
	}
	
	/*----------------------------------set and get method--------------------------------*/
	public Job getJob() {
		return job;
	}
	
	public void setJob(Job job) {
		this.job = job;
	}
	
	public JobService getJobService() {
		return jobService;
	}
	
	public void setJobService(JobService jobService) {
		this.jobService = jobService;
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
