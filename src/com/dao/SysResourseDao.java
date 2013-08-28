/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao;

import java.util.List;

import com.model.SysCode;
import com.model.SysResourse;

/**
 * @description: 系统资源管理Dao接口
 * @date: 2013-8-23 下午5:12:38
 * @author: lintz
 */
public interface SysResourseDao {
	/**
	 * @description: 新增系统资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysResourse 系统资源
	 * @return true or false
	 */
	public boolean addSysResourse(SysResourse sysResourse);
	
	/**
	 * @description: 删除系统资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysResourse 系统资源
	 * @return true or false
	 */
	public boolean delSysResourse(SysResourse sysResourse);
	
	/**
	 * @description: 更新系统资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysResourse 系统资源
	 * @return true or false
	 */
	public boolean updateSysResourse(SysResourse sysResourse);
	
	/**
	 * @description:查询全部系统资源
	 * @date: 2013-8-23 下午5:02:06
	 * @author： lintz
	 * @return 全部系统资源
	 */
	public List<SysCode> querySysResourse();
}
