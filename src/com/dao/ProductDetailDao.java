/**
 * 
 */
package com.dao;

import java.util.List;
import java.util.Map;

import com.model.ProductDetail;

/**
 * @description:产品详情Dao接口类 
 * @date: 2013-9-17 下午3:27:00
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public interface ProductDetailDao {
	/**
	 * @description: 根据产品ID查询产品详情
	 * @date: 2013-8-28 上午9:47:38
	 * @author： lintz
	 * @param cpid00 产品ID
	 * @return 产品详情
	 */
	public ProductDetail queryProductDetail(Integer cpid00);
	/**
	 * @description:查询全部产品详情列表
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部产品详情列表
	 */
	public List<ProductDetail> queryProductDetail(Map properties, int pageNo, int pageSize);
	/**
	 * @description:统计全部产品详情列表
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countProductDetail(Map properties);
}
