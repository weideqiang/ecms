package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 机构自助设备信息表
 * create by zhoujh
 */
public class SysOrgAutomachineModel {
    private String id;
    private String pid;  							//父级id
    private String machine_name;   					//设备名字
    private String machine_num;						//设备编号
    private String update_time;						//更新时间
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getMachine_name() {
		return machine_name;
	}
	public void setMachine_name(String machine_name) {
		this.machine_name = machine_name;
	}
	public String getMachine_num() {
		return machine_num;
	}
	public void setMachine_num(String machine_num) {
		this.machine_num = machine_num;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
}
