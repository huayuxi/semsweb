/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.service.impl;

import java.util.List;
import java.util.Map;

import com.dao.SysUserDao;
import com.model.SysUser;
import com.service.SysUserService;
import com.util.SecurityUtil;

/**
 * @description: 系统用户管理Service实现类
 * @date: 2013-9-2 上午11:52:10
 * @author: lintz
 */
@SuppressWarnings({ "rawtypes" })
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
		sysUser.setDlmm00(SecurityUtil.getPassword(sysUser.getDlmm00()));
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
		SysUser queryRs = sysUserDao.querySysUser(sysUser.getDlzh00());
		queryRs.setYhxm00(sysUser.getYhxm00());
		queryRs.setYhxb00(sysUser.getYhxb00());
		queryRs.setYhyx00(sysUser.getYhyx00());
		return sysUserDao.updateSysUser(queryRs);
	}
	
	/**
	 * @description: 更新系统用户密码
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @param dlmm00 登录密码
	 * @return true or false
	 */
	public boolean updatePassword(SysUser sysUser, String dlmm00) {
		sysUser.setDlmm00(SecurityUtil.getPassword(dlmm00));
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
	public SysUser login(String dlzh00, String dlmm00) {
		SysUser sysUser = sysUserDao.querySysUser(dlzh00);
		if (sysUser != null) {
			if (sysUser.getDlmm00().equals(SecurityUtil.getPassword(dlmm00)))
				return sysUser;
		}
		return null;
	}
	
	/**
	 * @description: 根据帐号密码验证用户
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param dlzh00 登陆帐号
	 * @return true or false
	 */
	public SysUser querySysUser(String dlzh00) {
		return sysUserDao.querySysUser(dlzh00);
	}
	
	/**
	 * @description:查询全部用户
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部用户
	 */
	public List<SysUser> querySysUser(Map properties, int pageNo, int pageSize) {
		return sysUserDao.querySysUser(properties, pageNo, pageSize);
	}
	
	/**
	 * @description:统计全部用户
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countSysUser(Map properties) {
		return sysUserDao.countSysUser(properties);
	}
	
	/*----------------------------------------set and get method----------------------------*/
	public SysUserDao getSysUserDao() {
		return sysUserDao;
	}
	
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}
	
}
