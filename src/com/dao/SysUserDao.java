/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao;

import java.util.List;

import com.model.SysUser;

/**
 * @description: 系统用户管理Dao接口
 * @date: 2013-8-23 下午4:13:26
 * @author: lintz
 */
public interface SysUserDao {
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
	 * @description: 查询全部的系统用户
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @return 全部系统用户
	 */
	public List<SysUser> querySysUser();
}
