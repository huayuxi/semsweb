/**
 * 
 */
package com.service;

import java.util.List;
import java.util.Map;

import com.model.Product;
import com.model.ProductContent;
import com.model.ProductRes;

/**
 * @description: 产品管理Service接口
 * @date: 2013-9-11 下午9:24:34
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public interface ProductService {
	/**
	 * @description: 新增产品
	 * @date: 2013-9-17 上午8:59:03
	 * @author： lintz
	 * @param product 产品
	 * @param productRes 产品资源
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean addProduct(Product product,ProductRes productRes,ProductContent productContent);
	/**
	 * @description: 删除产品
	 * @date: 2013-9-17 上午8:59:21
	 * @author： lintz
	 * @param product 产品
	 * @return true or false
	 */
	public boolean deleteProduct(Product product);
	/**
	 * @description: 更新产品
	 * @date: 2013-9-17 上午8:59:44
	 * @author： lintz
	 * @param product 产品
	 * @param productRes 产品资源
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean updateProduct(Product product,ProductRes productRes,ProductContent productContent);
	/**
	 * @description: 查询全部产品
	 * @date: 2013-9-17 上午9:00:02
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部产品
	 */
	public List<Product> queryProduct(Map properties, int pageNo, int pageSize);
	/**
	 * @description: 统计全部产品
	 * @date: 2013-9-17 上午9:00:16
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countProduct(Map properties);
}
