/**
 * 
 */
package com.service.impl;

import java.util.List;
import java.util.Map;

import com.dao.ProductContentDao;
import com.dao.ProductDao;
import com.dao.ProductDetailDao;
import com.dao.ProductResDao;
import com.model.Product;
import com.model.ProductContent;
import com.model.ProductDetail;
import com.model.ProductRes;
import com.service.ProductService;

/**
 * @description: 产品管理Service实现类
 * @date: 2013-9-17 上午9:11:25
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;
	private ProductResDao productResDao;
	private ProductContentDao productContentDao;
	private ProductDetailDao productDetailDao;
	
	/**
	 * @description: 新增产品
	 * @date: 2013-9-17 上午8:59:03
	 * @author： lintz
	 * @param product 产品
	 * @param productRes 产品资源
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean addProduct(Product product, ProductRes productRes, ProductContent productContent) {
		int id = productDao.addProduct(product);
		if (id != 0) {
			productRes.setCpid00(id);
			productContent.setCpnrid(id);
			return productResDao.addProductRes(productRes) && productContentDao.addProductContent(productContent);
		} else {
			return false;
		}
	}
	
	/**
	 * @description: 删除产品
	 * @date: 2013-9-17 上午8:59:21
	 * @author： lintz
	 * @param product 产品
	 * @return true or false
	 */
	public boolean deleteProduct(Product product) {
		ProductRes productRes = new ProductRes();
		ProductContent productContent = new ProductContent();
		productContent.setCpnrid(product.getCpid00());
		productRes.setCpid00(product.getCpid00());
		return productDao.delProduct(product) && productResDao.delProductRes(productRes) && productContentDao.delProductContent(productContent);
	}
	
	/**
	 * @description: 更新产品
	 * @date: 2013-9-17 上午8:59:44
	 * @author： lintz
	 * @param product 产品
	 * @param productRes 产品资源
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean updateProduct(Product product, ProductRes productRes, ProductContent productContent) {
		return productDao.updateProduct(product) && productResDao.updateProductRes(productRes) && productContentDao.updateProductContent(productContent);
	}
	
	/**
	 * @description: 查询全部产品
	 * @date: 2013-9-17 上午9:00:02
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部产品
	 */
	public List<Product> queryProduct(Map properties, int pageNo, int pageSize) {
		return productDao.queryProduct(properties, pageNo, pageSize);
	}
	
	/**
	 * @description: 统计全部产品
	 * @date: 2013-9-17 上午9:00:16
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countProduct(Map properties) {
		return productDao.countProduct(properties);
	}
	
	/**
	 * @description: 根据产品ID查询产品详情
	 * @date: 2013-8-28 上午9:47:38
	 * @author： lintz
	 * @param cpid00 产品ID
	 * @return 产品详情
	 */
	public ProductDetail queryProductDetail(Integer cpid00) {
		return productDetailDao.queryProductDetail(cpid00);
	}
	/**
	 * @description:查询全部产品详情列表
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部产品详情列表
	 */
	public List<ProductDetail> queryProductDetail(Map properties, int pageNo, int pageSize){
		return productDetailDao.queryProductDetail(properties, pageNo, pageSize);
	}
	/**
	 * @description:统计全部产品详情列表
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countProductDetail(Map properties){
		return productDetailDao.countProductDetail(properties);
	}
	/*-----------------------------------------------set and get method----------------------------------*/
	public ProductDao getProductDao() {
		return productDao;
	}
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public ProductResDao getProductResDao() {
		return productResDao;
	}
	
	public void setProductResDao(ProductResDao productResDao) {
		this.productResDao = productResDao;
	}
	
	public ProductContentDao getProductContentDao() {
		return productContentDao;
	}
	
	public void setProductContentDao(ProductContentDao productContentDao) {
		this.productContentDao = productContentDao;
	}
	
	public ProductDetailDao getProductDetailDao() {
		return productDetailDao;
	}
	
	public void setProductDetailDao(ProductDetailDao productDetailDao) {
		this.productDetailDao = productDetailDao;
	}
	
}
