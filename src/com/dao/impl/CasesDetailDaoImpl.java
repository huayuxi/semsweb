/**
 * 
 */
package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.CasesDetailDao;
import com.model.CasesDetail;
import com.util.BasicHibernateDao;

/**
 * @description: 案例详情Dao实现 
 * @date: 2013-9-11 下午3:35:09
 * @author: lintz
 */
@SuppressWarnings("unchecked")
public class CasesDetailDaoImpl extends BasicHibernateDao implements CasesDetailDao{
	/**
	 * @description: 根据案例ID查询案例详情
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param alid00 案例ID
	 * @return 案例详情
	 */
	public CasesDetail queryCasesDetail(int alid00){
		Query query = this.getSession().createQuery("from CasesDetail where alid00=?");
		query.setLong(0, alid00);
        
		List<CasesDetail> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
}
