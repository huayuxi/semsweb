/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.util;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @description: Like查询SQL语句生成工具类
 * @date: 2013-8-28 上午10:17:42
 * @author: lintz
 */
@SuppressWarnings("rawtypes")
public class LikeQueryUtil {
	/**
	 * @param properties 条件
	 * @return Like查询SQL
	 * @description:创建Like查询语句
	 * @date: 2013-8-28 上午10:17:42
	 * @author： lintz
	 */
    public static String createLikeQuery(Map properties) {
		String sql = "";
		Set set = properties.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			String key = (String) entry.getKey();
			if (key.substring(0, 4).equals("key_")) {
				sql+=" and "+key.substring(4) + " like '%" + ((String[]) entry.getValue())[0] + "%'";
			}
		}
		return sql;
	}
}
