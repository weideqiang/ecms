package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 角色权限菜单表
 * create by zhoujh
 */
public class SysRolePowerModel {
    private String id;
    private String role_id;  							//角色id
    private String power_id;   							//权限id
    private String targettype;							//目标类型
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getPower_id() {
		return power_id;
	}
	public void setPower_id(String power_id) {
		this.power_id = power_id;
	}
	public String getTargettype() {
		return targettype;
	}
	public void setTargettype(String targettype) {
		this.targettype = targettype;
	}
}
