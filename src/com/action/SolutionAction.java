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

import com.model.Solution;
import com.model.SysUser;
import com.service.SolutionService;
import com.util.BaseAction;

/**
 * @description: 解决方案管理action
 * @date: 2013-9-10 下午2:30:23
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class SolutionAction extends BaseAction {

	private static final long serialVersionUID = -7725068953723892865L;
	private Solution solution;
	private SolutionService solutionService;
	private List list;
	private int totalRecords;
	private int pageSize;
	private int pageNo;
	private String msg;

	/**
	 * @description: 新增解决方案
	 * @date: 2013-9-11 下午12:00:45
	 * @author： lintz
	 * @return
	 */
	public String addSolution() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		SysUser sysUserSession = (SysUser) session.getAttribute("sysUser");
		if (solution != null) {
			solution.setFbz000(sysUserSession.getYhid00());
			if (solutionService.addSolution(solution)){
				msg = "success";
			} else {
				msg = "error_error";
			}
		}
		return SUCCESS;
	}

	/**
	 * @description: 删除解决方案
	 * @date: 2013-9-11 下午12:00:49
	 * @author： lintz
	 * @return
	 */
	public String deleteSolution() {
		return SUCCESS;
	}

	/**
	 * @description: 更新解决方案
	 * @date: 2013-9-11 下午12:00:54
	 * @author： lintz
	 * @return
	 */
	public String updateSolution() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		SysUser sysUserSession = (SysUser) session.getAttribute("sysUser");
		if (solution != null) {
			solution.setFbz000(sysUserSession.getYhid00());
			if (solutionService.updateSolution(solution)) {
				msg = "success";
			} else {
				msg = "error_error";
			}
		}
		return SUCCESS;
	}

	/**
	 * @description: 查询解决方案
	 * @date: 2013-9-11 下午12:00:58
	 * @author： lintz
	 * @return
	 */
	public String querySolution() {
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
		totalRecords = this.solutionService.countSolution(properties);
		if (totalRecords != 0) {
			list = solutionService.querySolution(properties, pageNo, pageSize);
		} else {
			list = new ArrayList();
		}
		return SUCCESS;
	}
	/**
	 * @description: 查询案例详情
	 * @date: 2013-8-28 上午11:13:13
	 * @author： lintz
	 * @return
	 */
	public String querySolutionDetail() {
		HttpServletRequest req = ServletActionContext.getRequest();
		String jjfaid = req.getParameter("jjfaid");
		solution = solutionService.querySolution(Integer.parseInt(jjfaid));
		if (solution != null)
			return SUCCESS;
		return ERROR;
	}
	/*------------------------------------set and get menthod-------------------------------*/
	public Solution getSolution() {
		return solution;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}

	public SolutionService getSolutionService() {
		return solutionService;
	}

	public void setSolutionService(SolutionService solutionService) {
		this.solutionService = solutionService;
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
