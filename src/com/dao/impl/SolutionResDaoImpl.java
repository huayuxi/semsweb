/**
 * 
 */
package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.SolutionResDao;
import com.model.SolutionRes;
import com.util.BasicHibernateDao;

/**
 * @description: 解决方案资源管理Dao实现
 * @date: 2013-9-11 下午5:04:58
 * @author: lintz
 */
@SuppressWarnings("unchecked")
public class SolutionResDaoImpl extends BasicHibernateDao implements SolutionResDao{
	/**
	 * @description: 新增解决方案资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solutionRes 解决方案资源
	 * @return true or false
	 */
	public boolean addSolutionRes(SolutionRes solutionRes){
		try {
			this.getSession().save(solutionRes);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 删除解决方案资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solutionRes 解决方案资源
	 * @return true or false
	 */
	public boolean delSolutionRes(SolutionRes solutionRes){
		Query query = this.getSession().createQuery("from SolutionRes where jjfaid=?");
		query.setLong(0,solutionRes.getJjfaid());
        List<SolutionRes> list = query.list();
        solutionRes=list.size() == 0 ? null : list.get(0);
        if(solutionRes!=null){
			try {
				this.getSession().delete(solutionRes);
			} catch (Exception e) {
				return false;
			}
			return true;
        }
        return false;
	}
	
	/**
	 * @description: 更新解决方案资源
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solutionRes 解决方案资源
	 * @return true or false
	 */
	public boolean updateSolutionRes(SolutionRes solutionRes){
		try {
			this.getSession().update(solutionRes);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @description: 根据解决方案资源ID查询解决方案资源
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param jjfaid 解决方案资源ID
	 * @return 解决方案资源
	 */
	public SolutionRes querySolutionRes(int jjfaid){
		Query query = this.getSession().createQuery("from SolutionRes where jjfaid=?");
		query.setLong(0, jjfaid);
        List<SolutionRes> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
}
