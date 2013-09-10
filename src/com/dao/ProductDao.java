/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao;

import java.util.List;
import java.util.Map;

import com.model.Product;

/**
 * @description: 产品管理Dao接口
 * @date: 2013-9-10 下午2:43:41
 * @author: lintz
 */
@SuppressWarnings({ "rawtypes" })
public interface ProductDao {
	/**
	 * @description: 新增产品
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param Product 产品
	 * @return true or false
	 */
	public boolean addProduct(Product Product);
	
	/**
	 * @description: 删除产品
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param Product 产品
	 * @return true or false
	 */
	public boolean delProduct(Product Product);
	
	/**
	 * @description: 更新产品
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param Product 产品
	 * @return true or false
	 */
	public boolean updateProduct(Product Product);
	
	
	/**
	 * @description: 根据产品ID查询产品
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param cpid00 产品ID
	 * @return 产品
	 */
	public Product queryProduct(int cpid00);
	
	/**
	 * @description:查询全部产品
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部产品
	 */
	public List<Product> queryProduct(Map properties, int pageNo, int pageSize);
	
	/**
	 * @description:统计全部产品
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countProduct(Map properties);
}
