/**
 * 
 */
package com.dao;

import com.model.ProductContent;

/**
 * @description: 产品内容管理Dao接口
 * @date: 2013-9-17 上午9:33:55
 * @author: lintz
 */
public interface ProductContentDao {
	/**
	 * @description: 新增产品内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean addProductContent(ProductContent productContent);
	/**
	 * @description: 新增产品内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean delProductContent(ProductContent productContent);
	/**
	 * @description: 新增产品内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean updateProductContent(ProductContent productContent);
}
