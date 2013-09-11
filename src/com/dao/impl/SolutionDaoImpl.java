/**
 * 
 */
package com.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

import com.dao.SolutionDao;
import com.model.Solution;
import com.util.BasicHibernateDao;
import com.util.LikeQueryUtil;

/**
 * @description: 解决方案Dao实现
 * @date: 2013-9-11 下午4:34:15
 * @author: lintz
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class SolutionDaoImpl extends BasicHibernateDao implements SolutionDao{
	/**
	 * @description: 新增解决方案
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solution
	 *            解决方案
	 * @return 解决方案
	 */
	public Integer addSolution(Solution solution) {
		int id = 0;
		try {
			id = (Integer) this.getSession().save(solution);
		} catch (Exception e) {
			return id;
		}
		return id;
	}

	/**
	 * @description: 删除解决方案
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solution
	 *            解决方案
	 * @return true or false
	 */
	public boolean delSolution(Solution solution) {
		try {
			this.getSession().delete(solution);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * @description: 更新解决方案
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solution
	 *            解决方案
	 * @return true or false
	 */
	public boolean updateSolution(Solution solution) {
		try {
			this.getSession().update(solution);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * @description: 根据解决方案ID查询解决方案
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param faid00
	 *            解决方案ID
	 * @return 解决方案
	 */
	public Solution querySolution(int faid00) {
		Query query = this.getSession().createQuery(
				"from Solution where faid00=?");
		query.setLong(0, faid00);
		List<Solution> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}

	/**
	 * @description:查询全部解决方案
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties
	 *            条件
	 * @param pageNo
	 *            页数
	 * @param pageSize
	 *            每页记录数
	 * @return 全部解决方案
	 */
	public List<Solution> querySolution(Map properties, int pageNo, int pageSize) {
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select * from tab_solution where 1=1" + like;
		SQLQuery sqlQuery = this.getSession().createSQLQuery(sql);
		sqlQuery.addEntity(Solution.class);
		sqlQuery.setFirstResult((pageNo - 1) * pageSize);
		sqlQuery.setMaxResults(pageSize);
		return sqlQuery.list();
	}

	/**
	 * @description:统计全部解决方案
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties
	 *            条件
	 * @return 统计数
	 */
	public int countSolution(Map properties) {
		String like = LikeQueryUtil.createLikeQuery(properties);
		String sql = "select count(*) from tab_solution where 1=1" + like;
		String countStr = this.getSession().createSQLQuery(sql).uniqueResult()
				.toString();
		int count = Integer.valueOf(countStr).intValue();
		return count;
	}
}
