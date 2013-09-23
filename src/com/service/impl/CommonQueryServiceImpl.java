package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.dao.CommonQueryDao;
import com.service.CommonQueryService;

/**
 * 
 * @description: 
 * @date: 2012-10-23 下午03:14:56
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class CommonQueryServiceImpl implements CommonQueryService {
	private static final Logger LOGGER = Logger.getLogger(CommonQueryServiceImpl.class);

	private CommonQueryDao commonQueryDao;
	
	/**
	 * 
	 * @Description 
	 * @return CommonQueryDao
	 */
	public CommonQueryDao getCommonQueryDao() {
		return commonQueryDao;
	}

	/**
	 * 
	 * @Description 
	 * @param commonQueryDao CommonQueryDao
	 */
	public void setCommonQueryDao(CommonQueryDao commonQueryDao) {
		this.commonQueryDao = commonQueryDao;
	}

	/**
	 * @param sql String
	 * @return List
	 */
    public List doCommonQuery(String sql) {
		try {
			return this.commonQueryDao.doCommonQuery(sql);
		} catch (Exception e) {
			LOGGER.error(e);
		}

		return new ArrayList();

	}

	/**
	 * @param sql String
	 * @return int
	 */
	public int doCommonCount(String sql) {
		return commonQueryDao.doCommonCount(sql);
	}

}
