/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.model;

import com.util.DateUtil;

/**
 * @description:新闻
 * @date: 2013-8-23 下午12:53:32
 * @author:lintz
 */
public class News implements java.io.Serializable {
	
	// Fields
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5144195383495655820L;
	private Integer xwid00;
	private String xwlx00;
	private String lmlx00;
	private String xwbt00;
	private Integer xwzz00;
	private String fbsj00;
	private String gxsj00;
	private Integer llsl00;
	private Integer pxqz00;
	
	public Integer getXwid00() {
		return xwid00;
	}
	
	public void setXwid00(Integer xwid00) {
		this.xwid00 = xwid00;
	}
	
	public String getXwlx00() {
		return xwlx00;
	}
	
	public void setXwlx00(String xwlx00) {
		this.xwlx00 = xwlx00;
	}
	
	public String getLmlx00() {
		return lmlx00;
	}
	
	public void setLmlx00(String lmlx00) {
		this.lmlx00 = lmlx00;
	}
	
	public String getXwbt00() {
		return xwbt00;
	}
	
	public void setXwbt00(String xwbt00) {
		this.xwbt00 = xwbt00;
	}
	
	public Integer getXwzz00() {
		return xwzz00;
	}
	
	public void setXwzz00(Integer xwzz00) {
		this.xwzz00 = xwzz00;
	}
	
	public String getFbsj00() {
		return fbsj00;
	}
	
	public String getFbsj00Str() {
		return DateUtil.String8ToString10(fbsj00);
	}
	public void setFbsj00(String fbsj00) {
		this.fbsj00 = fbsj00;
	}
	
	public String getGxsj00() {
		return gxsj00;
	}
	
	public void setGxsj00(String gxsj00) {
		this.gxsj00 = gxsj00;
	}
	
	public Integer getLlsl00() {
		return llsl00;
	}
	
	public void setLlsl00(Integer llsl00) {
		this.llsl00 = llsl00;
	}
	
	public Integer getPxqz00() {
		return pxqz00;
	}
	
	public void setPxqz00(Integer pxqz00) {
		this.pxqz00 = pxqz00;
	}
	
}