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
	private Integer zyid00;
	
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
	
	public Integer getZyid00() {
		return zyid00;
	}
	
	public void setZyid00(Integer zyid00) {
		this.zyid00 = zyid00;
	}
	
}