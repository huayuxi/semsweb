package com.model;

/**
 * @description:产品
 * @date: 2013-8-23 下午5:28:32
 * @author: lintz
 */
public class Product implements java.io.Serializable {
	
	private static final long serialVersionUID = -3757694378168347490L;
	private Integer cpid00;
	private String cpmc00;
	private String cplx00;
	
	public Integer getCpid00() {
		return cpid00;
	}
	
	public void setCpid00(Integer cpid00) {
		this.cpid00 = cpid00;
	}
	
	public String getCpmc00() {
		return cpmc00;
	}
	
	public void setCpmc00(String cpmc00) {
		this.cpmc00 = cpmc00;
	}
	
	public String getCplx00() {
		return cplx00;
	}
	
	public void setCplx00(String cplx00) {
		this.cplx00 = cplx00;
	}
	
}