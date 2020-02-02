package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 岗位调整记录表
 * create by zhoujh
 */
public class SysPowerInfoModel {
    private String id;							//id
    private String userno;  					//员工号
    private String username;   					//员工姓名
    private String startorgnum;					//原机构号 
    private String endorgnum;					//现机构号
    private String startpostid;  				//原岗位id
    private String startdate;   				//原岗位开始时间
    private String enddate;						//原岗位结束时
    private String flag;						//标志位
    private String czdate;  					//操作时间
    private String reason;   					//原因
    private String endpostid;					//现岗位id
    private String bz;							//备注
    private String posttime;  					//进入初始该网点的日期
    private String initpostid;   				//进入原网点最初的岗位id
    private String zxyy;						//注销原因
    private String zxsm;						//注销说明
    private String extenddate;  				//拟结束时间(延长时间)
    private String plan_flag;   				//计划标志位
    private String outreason;					//计划外原因 
    private String sroleid;  					//原角色
    private String eroleid;  					//现角色
    private String ryqx;						//人员去向
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStartorgnum() {
		return startorgnum;
	}
	public void setStartorgnum(String startorgnum) {
		this.startorgnum = startorgnum;
	}
	public String getEndorgnum() {
		return endorgnum;
	}
	public void setEndorgnum(String endorgnum) {
		this.endorgnum = endorgnum;
	}
	public String getStartpostid() {
		return startpostid;
	}
	public void setStartpostid(String startpostid) {
		this.startpostid = startpostid;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCzdate() {
		return czdate;
	}
	public void setCzdate(String czdate) {
		this.czdate = czdate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getEndpostid() {
		return endpostid;
	}
	public void setEndpostid(String endpostid) {
		this.endpostid = endpostid;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public String getPosttime() {
		return posttime;
	}
	public void setPosttime(String posttime) {
		this.posttime = posttime;
	}
	public String getInitpostid() {
		return initpostid;
	}
	public void setInitpostid(String initpostid) {
		this.initpostid = initpostid;
	}
	public String getZxyy() {
		return zxyy;
	}
	public void setZxyy(String zxyy) {
		this.zxyy = zxyy;
	}
	public String getZxsm() {
		return zxsm;
	}
	public void setZxsm(String zxsm) {
		this.zxsm = zxsm;
	}
	public String getExtenddate() {
		return extenddate;
	}
	public void setExtenddate(String extenddate) {
		this.extenddate = extenddate;
	}
	public String getPlan_flag() {
		return plan_flag;
	}
	public void setPlan_flag(String plan_flag) {
		this.plan_flag = plan_flag;
	}
	public String getOutreason() {
		return outreason;
	}
	public void setOutreason(String outreason) {
		this.outreason = outreason;
	}
	public String getSroleid() {
		return sroleid;
	}
	public void setSroleid(String sroleid) {
		this.sroleid = sroleid;
	}
	public String getEroleid() {
		return eroleid;
	}
	public void setEroleid(String eroleid) {
		this.eroleid = eroleid;
	}
	public String getRyqx() {
		return ryqx;
	}
	public void setRyqx(String ryqx) {
		this.ryqx = ryqx;
	}
}
