package com.model;

/**
 * @description: 解决方案资源
 * @date: 2013-9-9 下午12:02:53
 * @author: lintz
 */
public class SolutionRes implements java.io.Serializable {
	
	private static final long serialVersionUID = -1564221090788015309L;
	private Integer jjzyid;
	private Integer jjfaid;
	private String zylj00;
	
	public Integer getJjzyid() {
		return jjzyid;
	}
	
	public void setJjzyid(Integer jjzyid) {
		this.jjzyid = jjzyid;
	}
	
	public Integer getJjfaid() {
		return jjfaid;
	}
	
	public void setJjfaid(Integer jjfaid) {
		this.jjfaid = jjfaid;
	}
	
	public String getZylj00() {
		return zylj00;
	}
	
	public void setZylj00(String zylj00) {
		this.zylj00 = zylj00;
	}
	
}