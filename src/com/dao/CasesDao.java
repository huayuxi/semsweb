/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao;

import java.util.List;
import java.util.Map;


import com.model.Cases;

/**
 * @description: 案例管理Dao接口
 * @date: 2013-9-9 下午2:03:17
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public interface CasesDao {
	/**
	 * @description: 新增案例
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param cases 案例
	 * @return 案例ID
	 */
	public Integer addCases(Cases cases);
	
	/**
	 * @description: 删除案例
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param cases 案例
	 * @return true or false
	 */
	public boolean delCases(Cases cases);
	
	/**
	 * @description: 更新案例
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param cases 案例
	 * @return true or false
	 */
	public boolean updateCases(Cases cases);
	
	
	/**
	 * @description: 根据案例ID查询案例
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param alid00 案例ID
	 * @return 案例
	 */
	public Cases queryCases(int alid00);
	
	/**
	 * @description:查询全部案例
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部案例
	 */
    public List<Cases> queryCases(Map properties, int pageNo, int pageSize);
	
	/**
	 * @description:统计全部案例
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countCases(Map properties);
}
