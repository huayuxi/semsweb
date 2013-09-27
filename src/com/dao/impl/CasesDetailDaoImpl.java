/**
 * 
 */
package com.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

import com.dao.CasesDetailDao;
import com.model.CasesDetail;
import com.util.BasicHibernateDao;
import com.util.LikeQueryUtil;

/**
 * @description: 案例详情Dao实现 
 * @date: 2013-9-11 下午3:35:09
 * @author: lintz
 */
@SuppressWarnings({"unchecked","rawtypes"})
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
	/**
	 * @description:查询全部案例详情
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部案例详情
	 */
    public List<CasesDetail> queryCasesDetail(Map properties, int pageNo, int pageSize){
    	String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select * from view_cases_detail where 1=1" + like;
		SQLQuery sqlQuery = this.getSession().createSQLQuery(sql);
		sqlQuery.addEntity(CasesDetail.class);
		sqlQuery.setFirstResult((pageNo - 1) * pageSize);
		sqlQuery.setMaxResults(pageSize);
		return sqlQuery.list();
    }
	
	/**
	 * @description:统计全部案例详情
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countCasesDetail(Map properties){
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select count(*) from view_cases_detail where 1=1" + like;
		String countStr = this.getSession().createSQLQuery(sql).uniqueResult().toString();
		int count = Integer.valueOf(countStr).intValue();
		return count;
	}
}
