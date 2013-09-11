/**
 * 
 */
package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.SolutionDetailDao;
import com.model.SolutionDetail;
import com.util.BasicHibernateDao;

/**
 * @description: 解决方案详情Dao实现
 * @date: 2013-9-11 下午5:10:35
 * @author: lintz
 */
@SuppressWarnings("unchecked")
public class SolutionDetailDaoImpl extends BasicHibernateDao implements SolutionDetailDao{
	/**
	 * @description: 根据解决方案ID查询解决方案详情
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param jjfaid 解决方案ID
	 * @return 解决方案详情
	 */
	public SolutionDetail querySolutionDetail(int jjfaid){
		Query query = this.getSession().createQuery("from SolutionDetail where jjfaid=?");
		query.setLong(0, jjfaid);
        
		List<SolutionDetail> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
}
