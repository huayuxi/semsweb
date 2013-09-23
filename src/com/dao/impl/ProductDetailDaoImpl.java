/**
 * 
 */
package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.ProductDetailDao;
import com.model.ProductDetail;
import com.util.BasicHibernateDao;

/**
 * @description: 产品详情管理Dao实现类
 * @date: 2013-9-17 下午3:28:16
 * @author: lintz
 */
@SuppressWarnings("unchecked")
public class ProductDetailDaoImpl extends BasicHibernateDao implements ProductDetailDao{
	/**
	 * @description: 根据产品ID查询产品详情
	 * @date: 2013-8-28 上午9:47:38
	 * @author： lintz
	 * @param cpid00 产品ID
	 * @return 产品详情
	 */
	public ProductDetail queryProductDetail(Integer cpid00){
		Query  query =this.getSession().createQuery("from ProductDetail where cpid00=?");
		query.setLong(0, cpid00);
		List<ProductDetail> list=query.list();
		return list.size()==0?null:list.get(0);
	}
}
