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

import com.model.Cases;
import com.model.CasesDetail;
import com.model.CasesRes;
import com.model.SysUser;
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
	private CasesDetail casesDetail;
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
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		SysUser sysUserSession = (SysUser) session.getAttribute("sysUser");
		if(cases!=null&&casesRes!=null){
			cases.setFbz000(sysUserSession.getYhid00());
			if (casesService.addCases(cases, casesRes)) {
				msg = "success";
			} else {
				msg = "error_error";
			}
		}		
		return SUCCESS;
	}
	
	/**
	 * @description: 更新案例
	 * @date: 2013-9-9 下午4:43:42
	 * @author： lintz
	 * @return
	 */
	public String updateCases() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		SysUser sysUserSession = (SysUser) session.getAttribute("sysUser");
		if(cases!=null&&casesRes!=null){
			cases.setFbz000(sysUserSession.getYhid00());
			if (casesService.updateCases(cases, casesRes)) {
				msg = "success";
			} else {
				msg = "error_error";
			}
		}		
		return SUCCESS;
	}
	
	/**
	 * @description: 删除案例
	 * @date: 2013-9-9 下午4:43:59
	 * @author： lintz
	 * @return
	 */
	public String deleteCases() {
		HttpServletRequest req = getRequest();
		int alid00 =Integer.parseInt(req.getParameter("alid00"));
		if (alid00 != 0) {
			Cases casesObj = new Cases();
			casesObj.setAlid00(alid00);
			if (casesService.delCases(casesObj)) {
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
	 * @description: 查询案例
	 * @date: 2013-9-9 下午4:44:13
	 * @author： lintz
	 * @return
	 */
	public String queryCases() {
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
		totalRecords = this.casesService.countCases(properties);
		if (totalRecords != 0) {
			list = casesService.queryCases(properties, pageNo, pageSize);
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
	public String queryCasesDetail() {
		HttpServletRequest req = ServletActionContext.getRequest();
		String alid = req.getParameter("alid00");
		int alid00=Integer.parseInt(alid);
		casesDetail = casesService.queryCasesDetail(alid00);
		if (casesDetail != null)
			return SUCCESS;
		return ERROR;
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
	
	public CasesDetail getCasesDetail() {
		return casesDetail;
	}

	public void setCasesDetail(CasesDetail casesDetail) {
		this.casesDetail = casesDetail;
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
