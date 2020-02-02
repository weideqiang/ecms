package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 待创建物品表
 * create by zhoujh
 */
public class SysDscgoodsInfoModel {
    private String id;
    private String wtype;  							//物品类别
    private String wname;   						//物品名称
    private String wpbz;							//物品备注(申请说明)
    private String suserno;							//申请人工号 
    private String susername;						//申请人姓名
    private String sorgno;							//申请人机构号
    private String sorgname;						//申请人机构名称
    private String sqtime;							//申请时间
    private String stat;							//状态
    private String remark1;							//备注1
    private String sqsm;							//申请说明
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWtype() {
		return wtype;
	}
	public void setWtype(String wtype) {
		this.wtype = wtype;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getWpbz() {
		return wpbz;
	}
	public void setWpbz(String wpbz) {
		this.wpbz = wpbz;
	}
	public String getSuserno() {
		return suserno;
	}
	public void setSuserno(String suserno) {
		this.suserno = suserno;
	}
	public String getSusername() {
		return susername;
	}
	public void setSusername(String susername) {
		this.susername = susername;
	}
	public String getSorgno() {
		return sorgno;
	}
	public void setSorgno(String sorgno) {
		this.sorgno = sorgno;
	}
	public String getSorgname() {
		return sorgname;
	}
	public void setSorgname(String sorgname) {
		this.sorgname = sorgname;
	}
	public String getSqtime() {
		return sqtime;
	}
	public void setSqtime(String sqtime) {
		this.sqtime = sqtime;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getRemark1() {
		return remark1;
	}
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
	public String getSqsm() {
		return sqsm;
	}
	public void setSqsm(String sqsm) {
		this.sqsm = sqsm;
	}
}
