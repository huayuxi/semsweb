/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.CasesResDao;
import com.model.CasesRes;
import com.util.BasicHibernateDao;

/**
 * @description: 
 * @date: 2013-9-9 下午4:24:01
 * @author: lintz
 */
@SuppressWarnings("unchecked")
public class CasesResDaoImpl extends BasicHibernateDao implements CasesResDao{
	/**
	 * @description: 新增案例资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param casesRes 案例资源
	 * @return true or false
	 */
	public boolean addCasesRes(CasesRes casesRes){
		try {
			this.getSession().save(casesRes);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 删除案例资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param casesRes 案例资源
	 * @return true or false
	 */
	public boolean delCasesRes(CasesRes casesRes){
		try {
			this.getSession().delete(casesRes);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 更新案例资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param casesRes 案例资源
	 * @return true or false
	 */
	public boolean updateCasesRes(CasesRes casesRes){
		try {
			this.getSession().update(casesRes);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 根据查询案例资源
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param alid00 案例ID
	 * @return 案例资源
	 */
	public CasesRes queryCasesRes(int alid00){
		Query query = this.getSession().createQuery("from CasesRes where alid00=?");
		query.setLong(0, alid00);
        List<CasesRes> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
		
}
