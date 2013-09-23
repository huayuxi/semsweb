/**
 * 
 */
package com.dao;

import com.model.ProductDetail;

/**
 * @description:产品详情Dao接口类 
 * @date: 2013-9-17 下午3:27:00
 * @author: lintz
 */
public interface ProductDetailDao {
	/**
	 * @description: 根据产品ID查询产品详情
	 * @date: 2013-8-28 上午9:47:38
	 * @author： lintz
	 * @param cpid00 产品ID
	 * @return 产品详情
	 */
	public ProductDetail queryProductDetail(Integer cpid00);
}
