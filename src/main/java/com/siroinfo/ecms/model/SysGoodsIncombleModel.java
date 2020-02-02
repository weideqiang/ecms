package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 附件表
 * create by zhoujh
 */
public class SysGoodsIncombleModel {
    private String id;
    private String goodsid;  							//物品类别id
    private String incomid;   							//不兼容物品类别id
    private String type;								//不兼容规则类型
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public String getIncomid() {
		return incomid;
	}
	public void setIncomid(String incomid) {
		this.incomid = incomid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
