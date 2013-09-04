/**
 * Copyright:Copyright(c)2013-2014
 * Company:厦门市智联信通物联网科技有限公司
 * @version 1.0
 */
package com.model;

import com.util.DateUtil;

/**
 * @description: 系统用户
 * @date: 2013-8-23 下午12:48:13
 * @author: lintz
 */
public class SysUser implements java.io.Serializable {
	
	private static final long serialVersionUID = -4964495653064440595L;
	// Fields
	
	private Integer yhid00;
	private String dlzh00;
	private String dlmm00;
	private String yhxm00;
	private String yhxb00;
	private String cjsj00;
	private String yhyx00;
	
	public Integer getYhid00() {
		return yhid00;
	}
	
	public void setYhid00(Integer yhid00) {
		this.yhid00 = yhid00;
	}
	
	public String getDlzh00() {
		return dlzh00;
	}
	
	public void setDlzh00(String dlzh00) {
		this.dlzh00 = dlzh00;
	}
	
	public String getDlmm00() {
		return dlmm00;
	}
	
	public void setDlmm00(String dlmm00) {
		this.dlmm00 = dlmm00;
	}
	
	public String getYhxm00() {
		return yhxm00;
	}
	
	public void setYhxm00(String yhxm00) {
		this.yhxm00 = yhxm00;
	}
	
	public String getYhxb00() {
		return yhxb00;
	}
	
	public void setYhxb00(String yhxb00) {
		this.yhxb00 = yhxb00;
	}
	
	public String getCjsj00() {
		return cjsj00;
	}
	
	public String getCjsj00Str() {
		return DateUtil.String8ToString10(cjsj00);
	}
	
	public void setCjsj00(String cjsj00) {
		this.cjsj00 = cjsj00;
	}
	
	public String getYhyx00() {
		return yhyx00;
	}
	
	public void setYhyx00(String yhyx00) {
		this.yhyx00 = yhyx00;
	}
	
}