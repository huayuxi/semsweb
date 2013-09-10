package com.model;

/**
 * @description: 产品资源表
 * @date: 2013-8-26 上午9:51:15
 * @author: lintz
 */
public class ProductRes implements java.io.Serializable {
	
	private static final long serialVersionUID = -5558068632338302522L;
	private Integer cpzyid;
	private Integer cpid00;
	private String zylj00;
	
	public Integer getCpzyid() {
		return cpzyid;
	}
	
	public void setCpzyid(Integer cpzyid) {
		this.cpzyid = cpzyid;
	}
	
	public Integer getCpid00() {
		return cpid00;
	}
	
	public void setCpid00(Integer cpid00) {
		this.cpid00 = cpid00;
	}
	
	public String getZylj00() {
		return zylj00;
	}
	
	public void setZylj00(String zylj00) {
		this.zylj00 = zylj00;
	}
	
}