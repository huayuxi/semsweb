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

import com.model.SysUser;
import com.service.SysUserService;
import com.util.BaseAction;

/**
 * @description: 系统用户管理Action类
 * @date: 2013-8-28 下午4:18:10
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class SysUserAction extends BaseAction {
	private static final long serialVersionUID = 7031441941317307412L;
	private String dlzh00;
	private String dlmm00;
	private SysUser sysUser;
	private SysUserService sysUserService;
	private String msg;
	private String oldPwd;
	private String newPwd;
	private List list;
	private int totalRecords;
	private int pageSize;
	private int pageNo;
	
	/**
	 * @description: 登陆验证
	 * @date: 2013-9-2 下午2:36:21
	 * @author： lintz
	 * @return
	 */
	public String login() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		if (dlzh00 != null && dlmm00 != null) {
			SysUser sysUserRs = sysUserService.login(dlzh00, dlmm00);
			if (sysUserRs != null) {
				msg = "success";
				session.setAttribute("sysUser", sysUserRs);
			} else {
				msg = "error_again";
			}
		} else {
			return ERROR;
		}
		return SUCCESS;
	}
	
	/**
	 * @description: 登陆验证
	 * @date: 2013-9-2 下午2:36:21
	 * @author： lintz
	 * @return
	 */
	public String loginOut() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		try {
			session.setAttribute("sysUser", null);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	/**
	 * @description:添加用户
	 * @date: 2013-9-2 下午2:45:57
	 * @author： lintz
	 * @return
	 */
	public String addSysUser() {
		if (sysUser != null) {
			if (sysUserService.querySysUser(sysUser.getDlzh00()) != null) {
				msg = "error_have";
			} else {
				if (sysUserService.addSysUser(sysUser)) {
					msg = "success";
				} else {
					msg = "error_error";
				}
			}
			
		} else {
			msg = "error_none";
		}
		return SUCCESS;
	}
	
	/**
	 * @description:修改密码
	 * @date: 2013-9-2 下午2:36:34
	 * @author： lintz
	 * @return
	 */
	public String updatePassword() {
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		
		SysUser sysUserSession = (SysUser) session.getAttribute("sysUser");
		if (oldPwd != null && newPwd != null) {
			SysUser sysUserRs = sysUserService.login(sysUserSession.getDlzh00(), oldPwd);
			if (sysUserRs != null) {
				if (sysUserService.updatePassword(sysUserRs, newPwd)) {
					msg = "success";
				} else {
					msg = "error_sys";
				}
			} else {
				msg = "error_pwd";
			}
			
		} else {
			msg = "error_none";
		}
		return SUCCESS;
	}
	
	/**
	 * @description: 更新用户信息
	 * @date: 2013-9-2 下午2:44:15
	 * @author： lintz
	 * @return
	 */
	public String updateSysUser() {
		if (sysUser != null) {
			if (sysUserService.updateSysUser(sysUser)) {
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
	 * @description: 前往更新界面
	 * @date: 2013-9-2 下午2:44:15
	 * @author： lintz
	 * @return
	 */
	public String goUpdateSysUser() {
		HttpServletRequest req = getRequest();
		String dlzh00 = (String) req.getAttribute("dlzh00");
		if(dlzh00!=null){
			sysUser = sysUserService.querySysUser(dlzh00);
			if (sysUser != null) {
				return SUCCESS;
			} else {
				msg="error_none";
			}
		}
		msg="error_novalue";
		return AGAIN;
	}
	
	/**
	 * @description: 删除用户
	 * @date: 2013-9-2 下午2:44:29
	 * @author： lintz
	 * @return
	 */
	public String deleteSysUser() {
		HttpServletRequest req = getRequest();
		int yhid00 =Integer.parseInt(req.getParameter("yhid00"));
		if (yhid00 != 0) {
			SysUser delObj = new SysUser();
			delObj.setYhid00(yhid00);
			if (sysUserService.delSysUser(delObj)) {
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
	 * @description: 查询用户
	 * @date: 2013-9-2 下午2:44:47
	 * @author： lintz
	 * @return
	 */
	public String querySysUser() {
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
		totalRecords = this.sysUserService.countSysUser(properties);
		if (totalRecords != 0) {
			list = sysUserService.querySysUser(properties, pageNo, pageSize);
		} else {
			list = new ArrayList();
		}
		return SUCCESS;
	}
	
	/*-----------------------------set and get method--------------------------------------*/
	
	public String getDlzh00() {
		return dlzh00;
	}
	
	public void setDlzh00(String dlzh00) {
		this.dlzh00 = dlzh00;
	}
	
	public String getDlmm00() {
		return dlmm00;
	}
	
	public void setDlmm00(String dlmm00) {
		this.dlmm00 = dlmm00;
	}
	
	public SysUser getSysUser() {
		return sysUser;
	}
	
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	
	public SysUserService getSysUserService() {
		return sysUserService;
	}
	
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getOldPwd() {
		return oldPwd;
	}
	
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
	
	public String getNewPwd() {
		return newPwd;
	}
	
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
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
	
}
