package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 物品类别表
 * create by zhoujh
 */
public class SysGoodssonInfoModel {
    private String id;
    private String sonname;  							//子类名称
    private String goodsid;   							//物品大类id
    private String qyzt;								//状态
    private String time;								//添加时间 
    private String ssorg;								//子类创建人所属机构
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSonname() {
		return sonname;
	}
	public void setSonname(String sonname) {
		this.sonname = sonname;
	}
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public String getQyzt() {
		return qyzt;
	}
	public void setQyzt(String qyzt) {
		this.qyzt = qyzt;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSsorg() {
		return ssorg;
	}
	public void setSsorg(String ssorg) {
		this.ssorg = ssorg;
	}
}
