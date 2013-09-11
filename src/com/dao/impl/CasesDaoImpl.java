/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

import com.dao.CasesDao;
import com.model.Cases;
import com.util.BasicHibernateDao;
import com.util.LikeQueryUtil;

/**
 * @description: 案例管理Dao实现类
 * @date: 2013-9-9 下午2:08:01
 * @author: lintz
 */
@SuppressWarnings({"unchecked","rawtypes"})
public class CasesDaoImpl extends BasicHibernateDao implements CasesDao{
	
	/**
	 * @description: 新增案例
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param cases 案例
	 * @return 案例ID
	 */
	public Integer addCases(Cases cases){
		int id=0;
		try {
			id = (Integer) this.getSession().save(cases);
		} catch (Exception e) {
			return id;
		}
		return id;
	}
	
	/**
	 * @description: 删除案例
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param cases 案例
	 * @return true or false
	 */
	public boolean delCases(Cases cases){
		try {
			this.getSession().delete(cases);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 更新案例
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param cases 案例
	 * @return true or false
	 */
	public boolean updateCases(Cases cases){
		try {
			this.getSession().update(cases);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * @description: 根据登陆帐号查询案例
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param alid00 案例ID
	 * @return 案例
	 */
	public Cases queryCases(int alid00){
		Query query = this.getSession().createQuery("from Cases where alid00=?");
		query.setLong(0, alid00);
        List<Cases> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
	
	/**
	 * @description:查询全部案例
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部案例
	 */
    public List<Cases> queryCases(Map properties, int pageNo, int pageSize){
    	String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select * from tab_cases where 1=1" + like;
		SQLQuery sqlQuery = this.getSession().createSQLQuery(sql);
		sqlQuery.addEntity(Cases.class);
		sqlQuery.setFirstResult((pageNo - 1) * pageSize);
		sqlQuery.setMaxResults(pageSize);
		return sqlQuery.list();
    }
	
	/**
	 * @description:统计全部案例
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countCases(Map properties){
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select count(*) from tab_cases where 1=1" + like;
		String countStr = this.getSession().createSQLQuery(sql).uniqueResult().toString();
		int count = Integer.valueOf(countStr).intValue();
		return count;
	}
}
