/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @description:时间工具类 
 * @date: 2013-8-27 下午4:04:26
 * @author: lintz
 */
public class DateUtil {
	/**
	 * 
	 * @param format 指定字符串格式
	 * @param date   日期
	 * @return String
	 * @description: 根据指定的格式化串来格式化日期
	 * @date: 2013-8-27 下午4:04:26
	 * @author： lintz
	 */
	public static String dateToString(String format, Date date) {
		if (format == null) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	/**
	 * @param date 日期
	 * @return String
	 * @description: 将如期格式化为8位的字符串形式，如：20110415
	 * @date: 2013-8-27 下午4:04:26
	 * @author： lintz
	 */
	public static String dateToString8(Date date) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}
	
	/**
	 * @param date 日期
	 * @return String
	 * @description: 将如期格式化为14位的字符串形式，如：20110415101112
	 * @date: 2013-8-27 下午4:04:26
	 * @author：lintz
	 */
	public static String dateToString14(Date date) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(date);
	}
	
	/**
	 * @param date yyyyMMdd格式的字符串日期
	 * @return Date
	 * @description: 将一个yyyyMMdd格式的字符串转行为日期
	 * @date: 2013-8-27 下午4:04:26
	 * @author： lintz
	 */
	public static Date string8ToDate(String date) {
		if (date == null) {
			return null;
		}
		if (date.length() == 14) {
			return string14ToDate(date);
		}
		Calendar cal = Calendar.getInstance();
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(4, 6));
		int day = Integer.parseInt(date.substring(6));
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}
	
	/**
	 * 
	 * @param date 字符串日期(yyyyMMddHHmmss格式)
	 * @return Date
	 * @description: 将一个yyyyMMddHHmmss格式的字符串转行为日期
	 * @date: 2013-8-27 下午4:04:26
	 * @author： lintz
	 */
	public static Date string14ToDate(String date) {
		if (date == null) {
			return null;
		}
		if (date.length() == 8) {
			return string8ToDate(date);
		}
		Calendar cal = Calendar.getInstance();
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(4, 6));
		int day = Integer.parseInt(date.substring(6, 8));
		int house = Integer.parseInt(date.substring(8, 10));
		int minute = Integer.parseInt(date.substring(10, 12));
		int second = Integer.parseInt(date.substring(12));
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, house);
		cal.set(Calendar.MINUTE, minute);
		cal.set(Calendar.SECOND, second);
		return cal.getTime();
	}
}
