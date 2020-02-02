package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 用户操作权限表
 * create by zhoujh
 */
public class SysUserRoleInfoModel {
    private String id;									//id
    private String menuId;  							//菜单id
    private String objcode;   							//操作
    private String objname;   							//描述
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getObjcode() {
		return objcode;
	}
	public void setObjcode(String objcode) {
		this.objcode = objcode;
	}
	public String getObjname() {
		return objname;
	}
	public void setObjname(String objname) {
		this.objname = objname;
	}
}
