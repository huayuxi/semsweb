/**
 * 
 */
package com.dao.impl;

import com.dao.ProductContentDao;
import com.model.ProductContent;
import com.util.BasicHibernateDao;

/**
 * @description: 
 * @date: 2013-9-17 上午9:53:35
 * @author: lintz
 */
public class ProductContentDaoImpl extends BasicHibernateDao implements ProductContentDao{
	/**
	 * @description: 新增产品内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean addProductContent(ProductContent productContent){
		try {
			this.getSession().save(productContent);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	/**
	 * @description: 新增产品内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean delProductContent(ProductContent productContent){
		try {
			this.getSession().delete(productContent);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	/**
	 * @description: 新增产品内容
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productContent 产品内容
	 * @return true or false
	 */
	public boolean updateProductContent(ProductContent productContent){
		try {
			this.getSession().update(productContent);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
