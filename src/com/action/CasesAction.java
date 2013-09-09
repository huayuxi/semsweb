/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.action;

import java.util.List;

import com.model.Cases;
import com.model.CasesRes;
import com.service.CasesService;
import com.util.BaseAction;

/**
 * @description: 案例管理Action类
 * @date: 2013-9-9 下午4:30:28
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class CasesAction extends BaseAction {
	
	private static final long serialVersionUID = 3819397639498069493L;
	private Cases cases;
	private CasesRes casesRes;
	private CasesService casesService;
	private List list;
	private int totalRecords;
	private int pageSize;
	private int pageNo;
	private String msg;
	
	/**
	 * @description:新增案例
	 * @date: 2013-9-9 下午4:43:12
	 * @author： lintz
	 * @return
	 */
	public String addCases() {
		return SUCCESS;
	}
	
	/**
	 * @description: 更新案例
	 * @date: 2013-9-9 下午4:43:42
	 * @author： lintz
	 * @return
	 */
	public String updateCases() {
		return SUCCESS;
	}
	
	/**
	 * @description: 删除案例
	 * @date: 2013-9-9 下午4:43:59
	 * @author： lintz
	 * @return
	 */
	public String deleteCases() {
		return SUCCESS;
	}
	
	/**
	 * @description: 查询案例
	 * @date: 2013-9-9 下午4:44:13
	 * @author： lintz
	 * @return
	 */
	public String queryCases() {
		return SUCCESS;
	}
	
	/*------------------------------------set and get menthod-------------------------------*/
	public Cases getCases() {
		return cases;
	}
	
	public void setCases(Cases cases) {
		this.cases = cases;
	}
	
	public CasesRes getCasesRes() {
		return casesRes;
	}
	
	public void setCasesRes(CasesRes casesRes) {
		this.casesRes = casesRes;
	}
	
	public CasesService getCasesService() {
		return casesService;
	}
	
	public void setCasesService(CasesService casesService) {
		this.casesService = casesService;
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
