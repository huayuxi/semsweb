/**
 * 
 */
package com.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

import com.dao.ProductDao;
import com.model.Product;
import com.util.BasicHibernateDao;
import com.util.LikeQueryUtil;

/**
 * @description: 产品管理Dao实现类
 * @date: 2013-9-17 上午9:36:10
 * @author: lintz
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class ProductDaoImpl extends BasicHibernateDao implements ProductDao{
	/**
	 * @description: 新增产品
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param product 产品
	 * @return 产品ID
	 */
	public Integer addProduct(Product product){
		Integer id = 0;
		try {
			id = (Integer) this.getSession().save(product);
		} catch (Exception e) {
			return 0;
		}
		return id;
		
	}
	
	/**
	 * @description: 删除产品
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param product 产品
	 * @return true or false
	 */
	public boolean delProduct(Product product){
		try {
			this.getSession().delete(product);		
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 更新产品
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param product 产品
	 * @return true or false
	 */
	public boolean updateProduct(Product product){
		try {
			this.getSession().update(product);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * @description: 根据产品ID查询产品
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param cpid00 产品ID
	 * @return 产品
	 */
	public Product queryProduct(int cpid00){
		Query query = this.getSession().createQuery("from Product where cpid00=?");
		query.setLong(0, cpid00);
		List<Product> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
	
	/**
	 * @description:查询全部产品
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部产品
	 */
	public List<Product> queryProduct(Map properties, int pageNo, int pageSize){
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select * from tab_product where 1=1" + like;
		SQLQuery sqlQuery = this.getSession().createSQLQuery(sql);
		sqlQuery.addEntity(Product.class);
		sqlQuery.setFirstResult((pageNo - 1) * pageSize);
		sqlQuery.setMaxResults(pageSize);
		return sqlQuery.list();	
	}
	
	/**
	 * @description:统计全部产品
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countProduct(Map properties){
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select count(*) from tab_product where 1=1" + like;
		String countStr = this.getSession().createSQLQuery(sql).uniqueResult().toString();
		int count = Integer.valueOf(countStr).intValue();
		return count;
	}
}
