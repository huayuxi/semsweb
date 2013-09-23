package com.service;

import java.util.List;

/**
 * 
 * @description: 
 * @date: 2012-10-23 下午03:14:08
 * @author: Lin Huiwu
 */
@SuppressWarnings({ "rawtypes" })
public interface CommonQueryService {

	/**
	 * 
	 * @param sql sql查询语句
	 * @return List
	 * @description: 
	 * @date: 2012-10-23 下午03:14:13
	 * @author： Lin Huiwu
	 */

	public List doCommonQuery(String sql);

	/**
	 * 
	 * @param sql sql查询语句
	 * @return int
	 * @description: 
	 * @date: 2012-10-23 下午03:14:26
	 * @author： Lin Huiwu
	 */
	public int doCommonCount(String sql);

}
