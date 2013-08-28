/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.util;

import java.security.MessageDigest;

/**
 * @description:加密工具类
 * @date: 2012-11-26 上午09:40:55
 * @author: Lintz
 */
public class SecurityUtil {
	private final static String[] HEX = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
	private final static int SIXTEEN = 16;
	private final static int TWOFIVESIX = 256;

	/**
	 * @param inputPassword 明文
	 * @return 密文
	 * @description:
	 * @date: 2012-11-2 下午12:51:05
	 * @author： Lintz
	 */
	public static String getPassword(String inputPassword) {
		return encodeByMD5(inputPassword);
	}

	/**
	 * @param password 元密码
	 * @param inputPassword 待验证密码
	 * @return 相等返回true反之返回false
	 * @description: 验证密码是否相等
	 * @date: 2012-11-2 下午01:01:22
	 * @author： Lintz
	 */
	public static boolean validatePassword(String password, String inputPassword) {
		if (password.equals(encodeByMD5(inputPassword)))
			return true;
		return false;
	}

	/**
	 * @param inputPassword 明文
	 * @return 密文
	 * @description:
	 * @date: 2012-11-2 下午12:52:36
	 * @author： Lintz
	 */
	private static String encodeByMD5(String inputPassword) {
		if (inputPassword != null) {
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				byte[] results = md.digest(inputPassword.getBytes());
				String resultString = byteArrayToHexString(results);
				return resultString.toUpperCase();
			} catch (Exception e) {
				return null;
			}
		}
		return null;
	}

	/**
	 * @param b 字节数组
	 * @return 字符串
	 * @description: 字节数组转换成字符串
	 * @date: 2012-11-2 下午12:56:43
	 * @author： Lintz
	 */
	private static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	/**
	 * @param b 字节数组
	 * @return 字符串
	 * @description: 外加算法
	 * @date: 2012-11-2 下午12:56:54
	 * @author： Lintz
	 */
	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = TWOFIVESIX + n;
		int d1 = n / SIXTEEN;
		int d2 = n % SIXTEEN;
		return HEX[d1] + HEX[d2];
	}
}
