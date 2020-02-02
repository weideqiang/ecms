package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 角色表
 * create by zhoujh
 */
public class SysRoleInfoModel {
    private String id;
    private String name;  							//名称
    private String remark;   						//描述
    private String pid;								//上级角色
    private String roleDeleFlag;					//角色删除标志 
    private String roleLevel;						//角色级别
    private String roleSeq;						//角色等级序列
    private String bankLevel;						//银行角色级别
    private String roleNo;							//角色号
    
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getRoleDeleFlag() {
		return roleDeleFlag;
	}
	public void setRoleDeleFlag(String roleDeleFlag) {
		this.roleDeleFlag = roleDeleFlag;
	}
	public String getRoleLevel() {
		return roleLevel;
	}
	public void setRoleLevel(String roleLevel) {
		this.roleLevel = roleLevel;
	}
	public String getRoleSeq() {
		return roleSeq;
	}
	public void setRoleSeq(String roleSeq) {
		this.roleSeq = roleSeq;
	}
	public String getBankLevel() {
		return bankLevel;
	}
	public void setBankLevel(String bankLevel) {
		this.bankLevel = bankLevel;
	}
	public String getRoleNo() {
		return roleNo;
	}
	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}
}
