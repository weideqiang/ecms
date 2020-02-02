package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 轮岗规则设置表
 * create by zhoujh
 */
public class SysPostRuleModel {
    private String postid;								//岗位id
    private String cantid;  							//不能轮换成该岗位id
    private String flag;   								//标志位
    
	public String getPostid() {
		return postid;
	}
	public void setPostid(String postid) {
		this.postid = postid;
	}
	public String getCantid() {
		return cantid;
	}
	public void setCantid(String cantid) {
		this.cantid = cantid;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
}
