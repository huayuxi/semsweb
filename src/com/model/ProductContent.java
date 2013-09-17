package com.model;

/**
 * TabProductContent entity. @author MyEclipse Persistence Tools
 */

public class ProductContent implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8139909161321004921L;
	private Integer cpnrid;
	private String cpnr00;

	public Integer getCpnrid() {
		return cpnrid;
	}

	public void setCpnrid(Integer cpnrid) {
		this.cpnrid = cpnrid;
	}

	public String getCpnr00() {
		return cpnr00;
	}

	public void setCpnr00(String cpnr00) {
		this.cpnr00 = cpnr00;
	}

}