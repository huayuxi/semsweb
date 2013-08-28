/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class StringUtil {
	private static final Logger LOGGER = Logger.getLogger(StringUtil.class);

	/**
	 * 查找2个字符串之间的字符串 SubString方法
	 * 
	 * @param startString 要查找的开始字符串
	 * @param endString 要查找的结束字串
	 * @param str 要查找的字串
	 * @return 返回2个字串之间的字符串 没查找到返回 str
	 */
	public static String findTo2CharSubString(String startString, String endString, String str) {
		Boolean a = str.contains(startString);
		Boolean b = str.contains(endString);
		if (a && b) {
			int s = str.indexOf(startString) + startString.length();
			int e = str.indexOf(endString);
			String resStr = str.substring(s, e);
			return resStr;
		} else {
			LOGGER.debug("传进的开始和结束标志，不在字符串内，返回原字符串！");
			return str;
		}

	}

	/**
	 * 查找2个字符串之间的字符串 正则表达式方法
	 * 
	 * @param startString 要查找的开始字符串
	 * @param endString 要查找的结束字串
	 * @param str 要查找的字串
	 * @return 返回2个字串之间的字符串 没查找到返回 str
	 */
	public static String findTo2Char(String startString, String endString, String str) {
		Pattern pattern = Pattern.compile("(" + startString + ")(.*)(" + endString + ")");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			return matcher.group(2);
		}
		LOGGER.debug("没有找到内容,返回原来字符串！");
		return str;
	}

	/**
	 * 查找2个字符串之间的字符串
	 * 
	 * @param startString 要查找的开始字符串
	 * @param endString 要查找的结束字串
	 * @param oldstr 要查找替换的字串
	 * @param newStr 要替换的新内容
	 * @return 替换为新的字串 startString+newStr+endString 没查找到返回 oldstr
	 */

	public static String replaceTo2Char(String startString, String endString, String oldstr, String newStr) {
		Pattern pattern = Pattern.compile("(" + startString + ")(.*)(" + endString + ")");
		Matcher matcher = pattern.matcher(oldstr);
		while (matcher.find()) {
			String temp = matcher.group(2);
			oldstr = oldstr.replace(temp, newStr);
			return oldstr;
		}
		LOGGER.debug("没有找到要替换的内容,返回原来字符串！");
		return oldstr;
	}

	/**
	 * 从后像前截取字符字符串 从后往前截 第一个出现非 给定的字符为止
	 * 
	 * @param c c
	 * @param str str
	 * @return str
	 */
	public String endSubString(String c, String str) {
		String regexStr = c + "*$";
		return str.replaceAll(regexStr, str);
	}

}
