package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 岗位信息表
 * create by zhoujh
 */
public class SysPostInfoModel {
    private String id;
    private String name;  							//岗位名称
    private String in_work_period;   				//网点内轮岗期限
    private String across_work_period;				//跨网点期限
    private String dele_flag;						//删除标志位 
    private String ismain;							//是否为主岗位
    private String flag;							//是否参与轮岗
    private String isvacation;						//是否可用强制休假代替轮岗
    private String vacation;						//最少强制休假天数
    private String cqback;							//允许回原岗位期限(城区)
    private String post_level;						//岗位等级
    private String remind_work_period;				//轮岗提醒起始天数
    private String fcqback;							//允许回原岗位期限(非城区)
    private String is_yytx;							//岗位是否营运条线
    private String tips;							//岗位种类 (支行级别)
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIn_work_period() {
		return in_work_period;
	}
	public void setIn_work_period(String in_work_period) {
		this.in_work_period = in_work_period;
	}
	public String getAcross_work_period() {
		return across_work_period;
	}
	public void setAcross_work_period(String across_work_period) {
		this.across_work_period = across_work_period;
	}
	public String getDele_flag() {
		return dele_flag;
	}
	public void setDele_flag(String dele_flag) {
		this.dele_flag = dele_flag;
	}
	public String getIsmain() {
		return ismain;
	}
	public void setIsmain(String ismain) {
		this.ismain = ismain;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getIsvacation() {
		return isvacation;
	}
	public void setIsvacation(String isvacation) {
		this.isvacation = isvacation;
	}
	public String getVacation() {
		return vacation;
	}
	public void setVacation(String vacation) {
		this.vacation = vacation;
	}
	public String getCqback() {
		return cqback;
	}
	public void setCqback(String cqback) {
		this.cqback = cqback;
	}
	public String getPost_level() {
		return post_level;
	}
	public void setPost_level(String post_level) {
		this.post_level = post_level;
	}
	public String getRemind_work_period() {
		return remind_work_period;
	}
	public void setRemind_work_period(String remind_work_period) {
		this.remind_work_period = remind_work_period;
	}
	public String getFcqback() {
		return fcqback;
	}
	public void setFcqback(String fcqback) {
		this.fcqback = fcqback;
	}
	public String getIs_yytx() {
		return is_yytx;
	}
	public void setIs_yytx(String is_yytx) {
		this.is_yytx = is_yytx;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
}
