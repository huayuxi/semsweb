/**
 * 
 */
package com.dao;

import java.util.List;
import java.util.Map;

import com.model.CasesDetail;

/**
 * @description: 案例详情Dao接口
 * @date: 2013-9-11 下午3:33:41
 * @author: lintz
 */
@SuppressWarnings({"rawtypes"})
public interface CasesDetailDao {
	/**
	 * @description: 根据案例ID查询案例详情
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param alid00 案例ID
	 * @return 案例详情
	 */
	public CasesDetail queryCasesDetail(int alid00);
	/**
	 * @description:查询全部案例详情
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部案例详情
	 */
    public List<CasesDetail> queryCasesDetail(Map properties, int pageNo, int pageSize);
	
	/**
	 * @description:统计全部案例详情
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countCasesDetail(Map properties);
}
