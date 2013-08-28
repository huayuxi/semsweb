/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.action;

import com.model.SysUser;
import com.util.BaseAction;

/**
 * @description: 系统用户管理Action类
 * @date: 2013-8-28 下午4:18:10
 * @author: lintz
 */
public class SysUserAction extends BaseAction {
    private static final long serialVersionUID = 7031441941317307412L;
	private String dlzh00;
	private String dlmm00;
	private SysUser sysUser;
	
	public String Login() {
		return null;
	}
	
	public String updatePassword() {
		return null;
	}
	
	public String updateSysUser() {
		return null;
	}
	
	public String deleteSysUser() {
		return null;
	}
	
	public String querySysUser() {
		return null;
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
	
}
