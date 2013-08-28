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
	private Integer zyid00;
	
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
	
	public Integer getZyid00() {
		return zyid00;
	}
	
	public void setZyid00(Integer zyid00) {
		this.zyid00 = zyid00;
	}
	
}