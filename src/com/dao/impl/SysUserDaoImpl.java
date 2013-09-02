/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.SysUserDao;
import com.model.SysUser;
import com.util.BasicHibernateDao;

/**
 * @description: 系统用户管理Dao实现类
 * @date: 2013-9-2 上午11:46:32
 * @author: lintz
 */
@SuppressWarnings("unchecked")
public class SysUserDaoImpl extends BasicHibernateDao implements SysUserDao{
	/**
	 * @description: 新增系统用户
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @return true or false
	 */
	public boolean addSysUser(SysUser sysUser){
		try {
	        this.getSession().save(sysUser);
        } catch (Exception e) {
	        return false;
        }
		return true;
	}
	/**
	 * @description: 删除系统用户
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @return true or false
	 */
	public boolean delSysUser(SysUser sysUser){
		try {
			this.getSession().delete(sysUser);
        } catch (Exception e) {
	        return false;
        }
		
		return true;
	}
	/**
	 * @description: 更新系统用户
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysUser 系统用户
	 * @return true or false
	 */
	public boolean updateSysUser(SysUser sysUser){
		try {
			this.getSession().update(sysUser);
        } catch (Exception e) {
        	return false;
        }
		return true;
	}
	/**
	 * @description: 查询全部的系统用户
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @return 全部系统用户
	 */
	public List<SysUser> querySysUser(){
		return null;
	}
	/**
	 * @description: 根据登陆帐号查询系统用户
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param dlzh00 登陆帐号
	 * @return 系统用户
	 */
    public SysUser querySysUser(String dlzh00){
		Query query=this.getSession().createQuery("from SysUser where dlzh00=?");
		query.setString(0, dlzh00);
		List<SysUser> list=query.list();
		return list.size()==0?null:list.get(0);
	}
}
