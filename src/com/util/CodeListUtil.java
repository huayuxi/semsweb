/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.util;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.opensymphony.oscache.general.GeneralCacheAdministrator;
/**
 * @description: 
 * @date: 2013-9-18 上午10:18:32
 * @author: lintz
 */
@SuppressWarnings({"unchecked","rawtypes"}) 
public class CodeListUtil {
	private static GeneralCacheAdministrator cacheAdmin = new GeneralCacheAdministrator();
	
	private static final Logger LOGGER = Logger.getLogger(CodeListUtil.class);

	/**
	 * 构造方法
	 */
	public CodeListUtil() {
	}

	/**
	 * 
	 * @param key 键
	 * @param value 值
	 * @description: 添加被缓存的对象
	 * @date: 2012-10-24 下午02:47:35
	 * @author： lintz
	 */
	public static void put(String key, Object value) {
		cacheAdmin.putInCache(key, value);
	}

	/**
	 * 
	 * @param key 键
	 * @description: 删除被缓存的对象;
	 * @date: 2012-10-24 下午02:47:54
	 * @author： lintz
	 */
	public static void remove(String key) {
		cacheAdmin.flushEntry(key);
	}

	/**
	 * 
	 * @param date 日期
	 * @description: 删除所有被缓存的对象;
	 * @date: 2012-10-24 下午02:48:07
	 * @author： lintz
	 */
	public static void removeAll(Date date) {
		cacheAdmin.flushAll(date);
	}

	/**
	 * 
	 * 
	 * @description: 清除缓存
	 * @date: 2012-10-24 下午02:48:17
	 * @author： lintz
	 */
	public static void removeAll() {
		cacheAdmin.flushAll();
	}

	/**
	 * 
	 * 
	 * @description: 销毁缓存
	 * @date: 2012-10-24 下午02:48:35
	 * @author： lintz
	 */
	public static void destroy() {
		cacheAdmin.destroy();
	}

	/**
	 * 
	 * @param key 键
	 * @return Object
	 * @description: 获取被缓存的对象;
	 * @date: 2012-10-24 下午02:48:55
	 * @author： lintz
	 */
	public static Object get(String key){
		try {
			Object ob = cacheAdmin.getFromCache(key);
			return (ob == null) ? new Object() : ob;
		} catch (Exception e) {
			LOGGER.error(e);
			return new Object();
		}
	}

	/**
	 * 
	 * @param list List
	 * @description: 初始化缓存的编码列表
	 * @date: 2012-10-24 下午02:52:06
	 * @author： lintz
	 */
	public static void initCollListCodeListCache(List list) {
		String keyValue = "";
		String bmlb00 = "";
		String bmmc00 = "";
		String bmz000 = "";
		TreeMap treeMap = new TreeMap();
		for (int i = 0; i < list.size(); i++) {
			HashMap hashMap = null;
			hashMap = (HashMap) list.get(i);
			bmlb00 = (String) hashMap.get("bmlb00");
			bmmc00 = (String) hashMap.get("bmmc00");
			bmz000 = (String) hashMap.get("bmz000");
			if (bmlb00.equals(keyValue)) {
				treeMap.put(bmz000, bmmc00);
			} else {
				if (treeMap != null && !treeMap.isEmpty() && treeMap.size() > 0) {
					put(keyValue, treeMap);
				}
				keyValue = bmlb00;
				treeMap = new TreeMap();
				treeMap.put(bmz000, bmmc00);
			}
		}
		put(keyValue, treeMap);
	}
	
	/**
	 * 
	 * @param list List
	 * @param realPath 路径
	 * @description: 设置编码表到js
	 * @date: 2012-10-24 下午02:53:28
	 * @author： lintz
	 */
	public static void initCodeList2Js(List list,String realPath){
		String bmlb00 = "";
		String bmmc00 = "";
		String bmz000 = "";
		StringBuffer s = new StringBuffer("var array = new Array(");
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				s.append("\"[");
				HashMap hashMap = null;
				hashMap = (HashMap) list.get(i);
				bmlb00 = (String) hashMap.get("bmlb00");
				bmmc00 = (String) hashMap.get("bmmc00");
				bmz000 = (String) hashMap.get("bmz000");
				s.append(bmlb00.toLowerCase() + "," + bmmc00 + "," + bmz000);
				s.append("]\",");
			}
			s = s.deleteCharAt(s.length() - 1);
		}
		
		s.append(");");
		writeCodeFile(s.toString(),realPath);
	}
	
	/**
	 * 
	 * @param content content
	 * @param realPath realPath
	 * @description: 
	 * @date: 2012-10-24 下午02:55:05
	 * @author： lintz
	 */
	public static void writeCodeFile(String content, String realPath) {

		String file = realPath + "/js/common/codedata.js";
		try {
			FileOutputStream fos = new FileOutputStream(file);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
			writer.write(content);
			writer.close();
		} catch (Exception e) {
			LOGGER.error(e);
		}

	}
}
