package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 附件表
 * create by zhoujh
 */
public class SysGoodsGroupModel {
    private String goodsid;							//物品id
    private String fzid;  							//分组id
    private String fzname;   						//分组名
    private String stat;							//数据状态
    private String czuser;							//操作人 
    private String czdate;							//操作时间
    
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public String getFzid() {
		return fzid;
	}
	public void setFzid(String fzid) {
		this.fzid = fzid;
	}
	public String getFzname() {
		return fzname;
	}
	public void setFzname(String fzname) {
		this.fzname = fzname;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getCzuser() {
		return czuser;
	}
	public void setCzuser(String czuser) {
		this.czuser = czuser;
	}
	public String getCzdate() {
		return czdate;
	}
	public void setCzdate(String czdate) {
		this.czdate = czdate;
	}
}
