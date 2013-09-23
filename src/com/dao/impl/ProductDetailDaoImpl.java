/**
 * 
 */
package com.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

import com.dao.ProductDetailDao;
import com.model.ProductDetail;
import com.util.BasicHibernateDao;
import com.util.LikeQueryUtil;

/**
 * @description: 产品详情管理Dao实现类
 * @date: 2013-9-17 下午3:28:16
 * @author: lintz
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
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
	/**
	 * @description:查询全部产品详情列表
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部产品详情列表
	 */
	public List<ProductDetail> queryProductDetail(Map properties, int pageNo, int pageSize) {
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select * from view_product_detail where 1=1" + like;
		SQLQuery sqlQuery = this.getSession().createSQLQuery(sql);
		sqlQuery.addEntity(ProductDetail.class);
		sqlQuery.setFirstResult((pageNo - 1) * pageSize);
		sqlQuery.setMaxResults(pageSize);
		return sqlQuery.list();
	}
	
	/**
	 * @description:统计全部产品详情列表
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countProductDetail(Map properties) {
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select count(*) from view_product_detail where 1=1" + like;
		String countStr = this.getSession().createSQLQuery(sql).uniqueResult().toString();
		int count = Integer.valueOf(countStr).intValue();
		return count;
	}
}
