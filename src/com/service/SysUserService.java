/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.service;

import java.util.List;
import java.util.Map;

import com.model.SysUser;

/**
 * @description: 系统用户管理Service接口
 * @date: 2013-8-23 下午4:13:26
 * @author: lintz
 */
@SuppressWarnings({ "rawtypes" })
public interface SysUserService {
	/**
	 * @description: 新增系统用户
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @return true or false
	 */
	public boolean addSysUser(SysUser sysUser);
	
	/**
	 * @description: 删除系统用户
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @return true or false
	 */
	public boolean delSysUser(SysUser sysUser);
	
	/**
	 * @description: 更新系统用户
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @return true or false
	 */
	public boolean updateSysUser(SysUser sysUser);
	
	/**
	 * @description: 更新系统用户密码
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @param dlmm00 登录密码
	 * @return true or false
	 */
	public boolean updatePassword(SysUser sysUser, String dlmm00);
	
	/**
	 * @description: 查询全部的系统用户
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @return 全部系统用户
	 */
	public List<SysUser> querySysUser();
	
	/**
	 * @description: 根据帐号密码验证用户
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param dlzh00 登陆帐号
	 * @param dlmm00 登陆密码
	 * @return true or false
	 */
	public SysUser login(String dlzh00, String dlmm00);
	
	/**
	 * @description: 根据帐号密码验证用户
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param dlzh00 登陆帐号
	 * @return true or false
	 */
	public SysUser querySysUser(String dlzh00);
	
	/**
	 * @description:查询全部用户
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部用户
	 */
	public List<SysUser> querySysUser(Map properties, int pageNo, int pageSize);
	
	/**
	 * @description:统计全部用户
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countSysUser(Map properties);
}
