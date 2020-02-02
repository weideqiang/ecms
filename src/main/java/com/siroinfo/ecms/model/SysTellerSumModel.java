package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 运营条线人员统计表
 * create by zhoujh
 */
public class SysTellerSumModel {
    private String id;
    private String branch;  					//分行/中心支行
    private String netpoint;   					//营运经理人数
    private String sum1;						//营运经理人数
    private String sum2;						//结算员人数 
    private String sum3;						//临柜员人数
    private String time;						//时间
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getNetpoint() {
		return netpoint;
	}
	public void setNetpoint(String netpoint) {
		this.netpoint = netpoint;
	}
	public String getSum1() {
		return sum1;
	}
	public void setSum1(String sum1) {
		this.sum1 = sum1;
	}
	public String getSum2() {
		return sum2;
	}
	public void setSum2(String sum2) {
		this.sum2 = sum2;
	}
	public String getSum3() {
		return sum3;
	}
	public void setSum3(String sum3) {
		this.sum3 = sum3;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
