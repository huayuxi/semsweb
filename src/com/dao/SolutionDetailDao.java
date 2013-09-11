/**
 * 
 */
package com.dao;

import com.model.SolutionDetail;

/**
 * @description: 解决方案详情Dao接口
 * @date: 2013-9-11 下午5:01:43
 * @author: lintz
 */
public interface SolutionDetailDao {
	/**
	 * @description: 根据解决方案ID查询解决方案详情
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param jjfaid 解决方案ID
	 * @return 解决方案详情
	 */
	public SolutionDetail querySolutionDetail(int jjfaid);
}
