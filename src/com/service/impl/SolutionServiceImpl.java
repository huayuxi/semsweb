/**
 * 
 */
package com.service.impl;

import java.util.List;
import java.util.Map;

import com.dao.SolutionDao;
import com.model.Solution;
import com.service.SolutionService;

/**
 * @description: 解决方案Service实现
 * @date: 2013-9-11 下午5:24:09
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class SolutionServiceImpl implements SolutionService{
	private SolutionDao solutionDao;
	/**
	 * @description: 新增解决方案
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solution 解决方案
	 * @return true or false
	 */
	public boolean addSolution(Solution solution){
		return solutionDao.addSolution(solution);
	}
	
	/**
	 * @description: 删除解决方案
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solution 解决方案
	 * @return true or false
	 */
	public boolean delSolution(Solution solution){
		return solutionDao.delSolution(solution);
	}
	
	/**
	 * @description: 更新解决方案
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solution 解决方案
	 * @return true or false
	 */
	public boolean updateSolution(Solution solution){
		return solutionDao.updateSolution(solution);
	}
	
	/**
	 * @description: 根据解决方案ID查询解决方案
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param jjfaid 解决方案ID
	 * @return 解决方案
	 */
	public Solution querySolution(int jjfaid){
		return solutionDao.querySolution(jjfaid);
	}
	
	/**
	 * @description:查询全部解决方案
	 * @date: 2013-8-23 下午5:03:52
	 * @author： lintz
	 * @param properties 条件
	 * @param pageNo 页数
	 * @param pageSize 每页记录数
	 * @return 全部解决方案
	 */
	public List<Solution> querySolution(Map properties, int pageNo, int pageSize){
		return solutionDao.querySolution(properties, pageNo, pageSize);
	}
	
	/**
	 * @description:统计全部解决方案
	 * @date: 2013-8-28 上午10:21:09
	 * @author： lintz
	 * @param properties 条件
	 * @return 统计数
	 */
	public int countSolution(Map properties){
		return solutionDao.countSolution(properties);
	}
	/*---------------------------------------------set and get method-------------------------------------*/

	public SolutionDao getSolutionDao() {
		return solutionDao;
	}

	public void setSolutionDao(SolutionDao solutionDao) {
		this.solutionDao = solutionDao;
	}	
}
