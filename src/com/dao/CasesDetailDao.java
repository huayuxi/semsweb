/**
 * 
 */
package com.dao;

import com.model.CasesDetail;

/**
 * @description: 案例详情Dao接口
 * @date: 2013-9-11 下午3:33:41
 * @author: lintz
 */
public interface CasesDetailDao {
	/**
	 * @description: 根据案例ID查询案例详情
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param alid00 案例ID
	 * @return 案例详情
	 */
	public CasesDetail queryCasesDetail(int alid00);
}
