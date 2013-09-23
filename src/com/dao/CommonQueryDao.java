package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.service.jdbc.connections.spi.ConnectionProvider;

import com.util.BasicHibernateDao;

/**
 * 
 * @description:
 * @date: 2012-10-23 下午02:32:35
 * @author: Lintz
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class CommonQueryDao extends BasicHibernateDao{
	
	/**
	 * 
	 * @param sql sql查询语句
	 * @return	List
	 * @throws SQLException SQL异常
	 * @description:公用查询方法
	 * @date: 2012-10-23 下午02:33:04
	 * @author： Lin Huiwu
	 */
	@SuppressWarnings("deprecation")
	public List doCommonQuery(String sql) throws SQLException {
		List list = new ArrayList();
		Session session = this.getSession();
		SessionFactory sf = session.getSessionFactory();
        ConnectionProvider cp = ((SessionFactoryImplementor) sf).getConnectionProvider();
		final Connection conn = cp.getConnection();
		PreparedStatement pre = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		try {
			pre = conn.prepareStatement(sql);
			rs = pre.executeQuery();
			rsmd = rs.getMetaData();
			while (rs.next()) {
				Map hashMap = new LinkedHashMap();
				for (int i = 1; i < rsmd.getColumnCount() + 1; i++) {
					String columnValue = String.valueOf(rs.getObject(i));
					String columnName = rsmd.getColumnName(i);
					if ("null".equals(columnValue)) {
						columnValue = "";
					}
					hashMap.put(columnName, columnValue);
				}
				list.add(hashMap);
			}
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pre != null) {
					pre.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				conn.close();
			}
		}
		return list;
	}

	/**
	 * 
	 * @param sql 查询语句
	 * @return int
	 * @description:统计符合查询条件的记录数
	 * @date: 2012-10-23 下午02:33:55
	 * @author： Lin Huiwu
	 */
	public int doCommonCount(String sql) {
		SQLQuery query = getSessionFactory().getCurrentSession().createSQLQuery(sql);
		return Integer.valueOf(query.uniqueResult().toString());
	}

}
