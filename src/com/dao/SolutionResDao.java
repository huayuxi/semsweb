/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao;

import com.model.SolutionRes;

/**
 * @description: 解决方案资源管理Dao接口
 * @date: 2013-9-10 下午2:39:37
 * @author: lintz
 */
public interface SolutionResDao {
	/**
	 * @description: 新增解决方案资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solutionRes 解决方案资源
	 * @return true or false
	 */
	public boolean addSolutionRes(SolutionRes solutionRes);
	
	/**
	 * @description: 删除解决方案资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solutionRes 解决方案资源
	 * @return true or false
	 */
	public boolean delSolutionRes(SolutionRes solutionRes);
	
	/**
	 * @description: 更新解决方案资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solutionRes 解决方案资源
	 * @return true or false
	 */
	public boolean updateSolutionRes(SolutionRes solutionRes);
	
	/**
	 * @description: 根据解决方案资源ID查询解决方案资源
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param jjfaid 解决方案资源ID
	 * @return 解决方案资源
	 */
	public SolutionRes querySolutionRes(int jjfaid);
}
