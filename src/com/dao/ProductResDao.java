/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao;

import com.model.ProductRes;

/**
 * @description: 产品资源管理Dao接口
 * @date: 2013-9-10 下午4:04:00
 * @author: lintz
 */
public interface ProductResDao {
	/**
	 * @description: 新增产品资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productRes 产品资源
	 * @return true or false
	 */
	public boolean addProductRes(ProductRes productRes);
	
	/**
	 * @description: 删除产品资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productRes 产品资源
	 * @return true or false
	 */
	public boolean delProductRes(ProductRes productRes);
	
	/**
	 * @description: 更新产品资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productRes 产品资源
	 * @return true or false
	 */
	public boolean updateProductRes(ProductRes productRes);
	
	/**
	 * @description: 根据产品ID查询产品资源
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param cpid00 产品资源ID
	 * @return 产品资源
	 */
	public ProductRes queryProductRes(int cpid00);
}
