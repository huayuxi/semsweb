/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.action;

import java.util.List;

import com.model.Solution;
import com.model.SolutionRes;
import com.service.SolutionService;
import com.util.BaseAction;

/**
 * @description: 解决方案管理action
 * @date: 2013-9-10 下午2:30:23
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class SolutionAction extends BaseAction{

	private static final long serialVersionUID = -7725068953723892865L;
	private Solution solution;
	private SolutionRes solutionRes;
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
	public String addSolution(){return SUCCESS;}
	/**
	 * @description: 删除解决方案
	 * @date: 2013-9-11 下午12:00:49
	 * @author： lintz
	 * @return
	 */
	public String deleteSolution(){return SUCCESS;}
	/**
	 * @description: 更新解决方案
	 * @date: 2013-9-11 下午12:00:54
	 * @author： lintz
	 * @return
	 */
	public String updateSolution(){return SUCCESS;}
	/**
	 * @description: 查询解决方案
	 * @date: 2013-9-11 下午12:00:58
	 * @author： lintz
	 * @return
	 */
	public String querySolution(){return SUCCESS;}
	
	
	
	/*------------------------------------set and get menthod-------------------------------*/
	public Solution getSolution() {
		return solution;
	}
	public void setSolution(Solution solution) {
		this.solution = solution;
	}
	public SolutionRes getSolutionRes() {
		return solutionRes;
	}
	public void setSolutionRes(SolutionRes solutionRes) {
		this.solutionRes = solutionRes;
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
