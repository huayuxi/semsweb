package com.model;

/**
 * @description: 新闻内容
 * @date: 2013-8-23 下午4:03:38
 * @author: lintz
 */
public class NewsContent implements java.io.Serializable {
	
	private static final long serialVersionUID = -9067976611822792575L;
	private Integer xwnrid;
	private String xwnr00;
	
	public Integer getXwnrid() {
		return xwnrid;
	}
	
	public void setXwnrid(Integer xwnrid) {
		this.xwnrid = xwnrid;
	}
	
	public String getXwnr00() {
		return xwnr00;
	}
	
	public void setXwnr00(String xwnr00) {
		this.xwnr00 = xwnr00;
	}
	
}