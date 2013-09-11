/**
 * 
 */
package com.service.impl;

import java.util.List;
import java.util.Map;

import com.dao.SolutionDao;
import com.dao.SolutionDetailDao;
import com.dao.SolutionResDao;
import com.model.Solution;
import com.model.SolutionDetail;
import com.model.SolutionRes;
import com.service.SolutionService;

/**
 * @description: 解决方案Service实现
 * @date: 2013-9-11 下午5:24:09
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class SolutionServiceImpl implements SolutionService{
	private SolutionDao solutionDao;
	private SolutionResDao solutionResDao;
	private SolutionDetailDao solutionDetailDao;
	/**
	 * @description: 新增解决方案
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solution 解决方案
	 * @param solutionRes 解决方案资源
	 * @return true or false
	 */
	public boolean addSolution(Solution solution,SolutionRes solutionRes){
		Integer jjfaid = solutionDao.addSolution(solution);
		solutionRes.setJjfaid(jjfaid);
		return solutionResDao.addSolutionRes(solutionRes);
	}
	
	/**
	 * @description: 删除解决方案
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solution 解决方案
	 * @return true or false
	 */
	public boolean delSolution(Solution solution){
		SolutionRes solutionRes =new SolutionRes();
		solutionRes.setJjfaid(solution.getJjfaid());
		return solutionDao.delSolution(solution)&&solutionResDao.delSolutionRes(solutionRes);
	}
	
	/**
	 * @description: 更新解决方案
	 * @date: 2013-8-23 下午4:59:47
	 * @author： lintz
	 * @param solution 解决方案
	 * @param solutionRes 解决方案资源
	 * @return true or false
	 */
	public boolean updateSolution(Solution solution,SolutionRes solutionRes){
		return solutionDao.updateSolution(solution)&&solutionResDao.updateSolutionRes(solutionRes);
	}
	
	/**
	 * @description: 根据解决方案ID查询解决方案
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param faid00 解决方案ID
	 * @return 解决方案
	 */
	public Solution querySolution(int faid00){
		return solutionDao.querySolution(faid00);
	}
	
	/**
	 * @description: 根据解决方案ID查询解决方案详情
	 * @date: 2013-8-23 下午5:00:51
	 * @author： lintz
	 * @param jjfaid 解决方案ID
	 * @return 解决方案详情
	 */
	public SolutionDetail querySolutionDetail(int jjfaid){
		return solutionDetailDao.querySolutionDetail(jjfaid);
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

	public SolutionResDao getSolutionResDao() {
		return solutionResDao;
	}

	public void setSolutionResDao(SolutionResDao solutionResDao) {
		this.solutionResDao = solutionResDao;
	}

	public SolutionDetailDao getSolutionDetailDao() {
		return solutionDetailDao;
	}

	public void setSolutionDetailDao(SolutionDetailDao solutionDetailDao) {
		this.solutionDetailDao = solutionDetailDao;
	}

	
}
