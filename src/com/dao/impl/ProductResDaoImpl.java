/**
 * 
 */
package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.ProductResDao;
import com.model.ProductRes;
import com.util.BasicHibernateDao;

/**
 * @description: 产品资源管理Dao实现类
 * @date: 2013-9-17 上午9:48:20
 * @author: lintz
 */
@SuppressWarnings({"unchecked" })
public class ProductResDaoImpl extends BasicHibernateDao implements ProductResDao{
	/**
	 * @description: 新增产品资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productRes 产品资源
	 * @return true or false
	 */
	public boolean addProductRes(ProductRes productRes){
		try {
			this.getSession().save(productRes);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 删除产品资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productRes 产品资源
	 * @return true or false
	 */
	public boolean delProductRes(ProductRes productRes){
		Query query = this.getSession().createQuery("from ProductRes where cpid00=?");
		query.setLong(0, productRes.getCpid00());
        List<ProductRes> list = query.list();
        productRes=list.size() == 0 ? null : list.get(0);
		try {
			this.getSession().delete(productRes);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 更新产品资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param productRes 产品资源
	 * @return true or false
	 */
	public boolean updateProductRes(ProductRes productRes){
		try {
			this.getSession().update(productRes);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 根据产品ID查询产品资源
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param cpid00 产品资源ID
	 * @return 产品资源
	 */
	public ProductRes queryProductRes(int cpid00){
		Query query=this.getSession().createQuery("rom ProductRes where cpid00=?");
		query.setLong(0, cpid00);
		List<ProductRes> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
}
