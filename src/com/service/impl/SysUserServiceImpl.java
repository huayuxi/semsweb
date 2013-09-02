/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.service.impl;

import java.util.List;

import com.dao.SysUserDao;
import com.model.SysUser;
import com.service.SysUserService;
import com.util.SecurityUtil;

/**
 * @description: 系统用户管理Service实现类
 * @date: 2013-9-2 上午11:52:10
 * @author: lintz
 */
public class SysUserServiceImpl implements SysUserService {
	private SysUserDao sysUserDao;
	
	/**
	 * @description: 新增系统用户
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @return true or false
	 */
	public boolean addSysUser(SysUser sysUser) {
		return sysUserDao.addSysUser(sysUser);
	}
	
	/**
	 * @description: 删除系统用户
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @return true or false
	 */
	public boolean delSysUser(SysUser sysUser) {
		return sysUserDao.delSysUser(sysUser);
	}
	
	/**
	 * @description: 更新系统用户
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @return true or false
	 */
	public boolean updateSysUser(SysUser sysUser) {
		return sysUserDao.updateSysUser(sysUser);
	}
	
	/**
	 * @description: 查询全部的系统用户
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @return 全部系统用户
	 */
	public List<SysUser> querySysUser() {
		return sysUserDao.querySysUser();
	}
	
	/**
	 * @description: 根据帐号密码验证用户
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param dlzh00 登陆帐号
	 * @param dlmm00 登陆密码
	 * @return true or false
	 */
	public boolean login(String dlzh00, String dlmm00) {
		SysUser sysUser=sysUserDao.querySysUser(dlzh00);
		if(sysUser!=null){
			if(sysUser.getDlmm00()==SecurityUtil.getPassword(dlmm00))
				return true;
		}
		return false;
	}
	
	/*----------------------------------------set and get method----------------------------*/
	public SysUserDao getSysUserDao() {
		return sysUserDao;
	}
	
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}
	
}