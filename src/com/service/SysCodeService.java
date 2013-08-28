/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.service;

import java.util.List;

import com.model.SysCode;

/**
 * @description: 系统编码管理Service接口
 * @date: 2013-8-23 下午4:16:37
 * @author: lintz
 */
public interface SysCodeService {
	/**
	 * @description: 新增系统编码
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysCode 系统编码
	 * @return true or false
	 */
	public boolean addSysCode(SysCode sysCode);
	
	/**
	 * @description: 删除系统编码
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysCode 系统编码
	 * @return true or false
	 */
	public boolean delSysCode(SysCode sysCode);
	
	/**
	 * @description: 更新系统编码
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param sysCode 系统编码
	 * @return true or false
	 */
	public boolean updateSysCode(SysCode sysCode);
	
	/**
	 * @description:查询全部系统编码
	 * @date: 2013-8-23 下午5:02:06
	 * @author： lintz
	 * @return
	 */
	public List<SysCode> querySysCode();
}
