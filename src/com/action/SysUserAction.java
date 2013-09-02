/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.action;

import com.model.SysUser;
import com.service.SysUserService;
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
	private SysUserService sysUserService;
	private String msg;
	
	/**
	 * @description: 登陆验证
	 * @date: 2013-9-2 下午2:36:21
	 * @author： lintz
	 * @return
	 */
	public String login() {
		if (dlzh00 != null && dlmm00 != null) {
			if (sysUserService.login(dlzh00, dlmm00)) {
				return SUCCESS;
			}else{
				msg="error_again";
				return AGAIN;
			}
		}
		msg="error_none";
		return AGAIN;
	}
	
	/**
	 * @description:添加用户
	 * @date: 2013-9-2 下午2:45:57
	 * @author： lintz
	 * @return
	 */
	public String addSysUser() {
		if (sysUser != null) {
			return sysUserService.addSysUser(sysUser) ? SUCCESS : AGAIN;
		}
		return AGAIN;
	}
	
	/**
	 * @description:修改密码
	 * @date: 2013-9-2 下午2:36:34
	 * @author： lintz
	 * @return
	 */
	public String updatePassword() {
		
		return null;
	}
	
	/**
	 * @description: 更新用户信息
	 * @date: 2013-9-2 下午2:44:15
	 * @author： lintz
	 * @return
	 */
	public String updateSysUser() {
		return null;
	}
	
	/**
	 * @description: 删除用户
	 * @date: 2013-9-2 下午2:44:29
	 * @author： lintz
	 * @return
	 */
	public String deleteSysUser() {
		return null;
	}
	
	/**
	 * @description: 查询用户
	 * @date: 2013-9-2 下午2:44:47
	 * @author： lintz
	 * @return
	 */
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
	
}
