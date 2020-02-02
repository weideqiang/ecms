package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 参数表
 * create by zhoujh
 */
public class SysParamInfoModel {
    private String id;
    private String keyo;  							//字典标识
    private String name;   							//字典名称
    private String val;								//属性键值
    private String remark;							//中文信息 
    private String type;							//类型
    private String sortnum;							//排序
    private String status;							//状态
    private String res1;							//扩展字段
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKeyo() {
		return keyo;
	}
	public void setKeyo(String keyo) {
		this.keyo = keyo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSortnum() {
		return sortnum;
	}
	public void setSortnum(String sortnum) {
		this.sortnum = sortnum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRes1() {
		return res1;
	}
	public void setRes1(String res1) {
		this.res1 = res1;
	}
}
