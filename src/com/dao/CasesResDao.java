/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao;

import com.model.CasesRes;

/**
 * @description:案例资源Dao接口类
 * @date: 2013-9-9 下午4:08:37
 * @author: lintz
 */
public interface CasesResDao {
	/**
	 * @description: 新增案例资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param casesRes 案例资源
	 * @return true or false
	 */
	public boolean addCasesRes(CasesRes casesRes);
	
	/**
	 * @description: 删除案例资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param casesRes 案例资源
	 * @return true or false
	 */
	public boolean delCasesRes(CasesRes casesRes);
	
	/**
	 * @description: 更新案例资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param casesRes 案例资源
	 * @return true or false
	 */
	public boolean updateCasesRes(CasesRes casesRes);
	
	/**
	 * @description: 根据查询案例资源
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param alid00 案例ID
	 * @return 案例资源
	 */
	public CasesRes queryCasesRes(int alid00);
	
}
