package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 物品信息表
 * create by zhoujh
 */
public class SysGoodsInfoModel {
    private String id;
    private String name;  							//物品名称
    private String impo_goods_explain;   			//重要物品说明
    private String ssorg;							//所属机构
    private String dele_flag;						//删除标志位 
    private String type;							//物品类别
    private String tname;							//不包括机构的名称
    private String createdate;						//创建日期
    private String createuser;						//创建人
    private String fhr;								//复核人    
    private String zygoods;  						//主备物品id
    private String fzname;   						//分组名称
    private String fzstat;							//分组设置标识
    private String xfdate;							//下发日期 
    private String zclyr;							//最初领用人
    private String qyrq;							//启用日期
    private String sjr;								//上缴人
    private String sjrxm;							//上缴人姓名
    private String createuserxm;					//创建人姓名
    private String tyrq;  							//停用日期
    private String xhrq;   							//销毁日期
    private String zclyrxm;							//最初领用人姓名
    private String qyr;								//启用人 
    private String qyrxm;							//启用人姓名
    private String fcr;								//封存人
    private String fcrq;							//封存日期
    private String fcrxm;							//封存人姓名
    private String tyr;								//停用人
    private String tyrxm;  							//停用人姓名
    private String xhr;   							//销毁人
    private String xhrxm;							//销毁人姓名
    private String xfr;								//下发人 
    private String fzid;							//分组id
    private String sonname;							//子类名称
    private String sonid;							//子类id
    private String xfrtwo;							//印章下发人2
    private String zbid;							//不兼容表id
    private String sjrq;							//上缴日期
    
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
	public String getImpo_goods_explain() {
		return impo_goods_explain;
	}
	public void setImpo_goods_explain(String impo_goods_explain) {
		this.impo_goods_explain = impo_goods_explain;
	}
	public String getSsorg() {
		return ssorg;
	}
	public void setSsorg(String ssorg) {
		this.ssorg = ssorg;
	}
	public String getDele_flag() {
		return dele_flag;
	}
	public void setDele_flag(String dele_flag) {
		this.dele_flag = dele_flag;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getCreateuser() {
		return createuser;
	}
	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}
	public String getFhr() {
		return fhr;
	}
	public void setFhr(String fhr) {
		this.fhr = fhr;
	}
	public String getZygoods() {
		return zygoods;
	}
	public void setZygoods(String zygoods) {
		this.zygoods = zygoods;
	}
	public String getFzname() {
		return fzname;
	}
	public void setFzname(String fzname) {
		this.fzname = fzname;
	}
	public String getFzstat() {
		return fzstat;
	}
	public void setFzstat(String fzstat) {
		this.fzstat = fzstat;
	}
	public String getXfdate() {
		return xfdate;
	}
	public void setXfdate(String xfdate) {
		this.xfdate = xfdate;
	}
	public String getZclyr() {
		return zclyr;
	}
	public void setZclyr(String zclyr) {
		this.zclyr = zclyr;
	}
	public String getQyrq() {
		return qyrq;
	}
	public void setQyrq(String qyrq) {
		this.qyrq = qyrq;
	}
	public String getSjr() {
		return sjr;
	}
	public void setSjr(String sjr) {
		this.sjr = sjr;
	}
	public String getSjrxm() {
		return sjrxm;
	}
	public void setSjrxm(String sjrxm) {
		this.sjrxm = sjrxm;
	}
	public String getCreateuserxm() {
		return createuserxm;
	}
	public void setCreateuserxm(String createuserxm) {
		this.createuserxm = createuserxm;
	}
	public String getTyrq() {
		return tyrq;
	}
	public void setTyrq(String tyrq) {
		this.tyrq = tyrq;
	}
	public String getXhrq() {
		return xhrq;
	}
	public void setXhrq(String xhrq) {
		this.xhrq = xhrq;
	}
	public String getZclyrxm() {
		return zclyrxm;
	}
	public void setZclyrxm(String zclyrxm) {
		this.zclyrxm = zclyrxm;
	}
	public String getQyr() {
		return qyr;
	}
	public void setQyr(String qyr) {
		this.qyr = qyr;
	}
	public String getQyrxm() {
		return qyrxm;
	}
	public void setQyrxm(String qyrxm) {
		this.qyrxm = qyrxm;
	}
	public String getFcr() {
		return fcr;
	}
	public void setFcr(String fcr) {
		this.fcr = fcr;
	}
	public String getFcrq() {
		return fcrq;
	}
	public void setFcrq(String fcrq) {
		this.fcrq = fcrq;
	}
	public String getFcrxm() {
		return fcrxm;
	}
	public void setFcrxm(String fcrxm) {
		this.fcrxm = fcrxm;
	}
	public String getTyr() {
		return tyr;
	}
	public void setTyr(String tyr) {
		this.tyr = tyr;
	}
	public String getTyrxm() {
		return tyrxm;
	}
	public void setTyrxm(String tyrxm) {
		this.tyrxm = tyrxm;
	}
	public String getXhr() {
		return xhr;
	}
	public void setXhr(String xhr) {
		this.xhr = xhr;
	}
	public String getXhrxm() {
		return xhrxm;
	}
	public void setXhrxm(String xhrxm) {
		this.xhrxm = xhrxm;
	}
	public String getXfr() {
		return xfr;
	}
	public void setXfr(String xfr) {
		this.xfr = xfr;
	}
	public String getFzid() {
		return fzid;
	}
	public void setFzid(String fzid) {
		this.fzid = fzid;
	}
	public String getSonname() {
		return sonname;
	}
	public void setSonname(String sonname) {
		this.sonname = sonname;
	}
	public String getSonid() {
		return sonid;
	}
	public void setSonid(String sonid) {
		this.sonid = sonid;
	}
	public String getXfrtwo() {
		return xfrtwo;
	}
	public void setXfrtwo(String xfrtwo) {
		this.xfrtwo = xfrtwo;
	}
	public String getZbid() {
		return zbid;
	}
	public void setZbid(String zbid) {
		this.zbid = zbid;
	}
	public String getSjrq() {
		return sjrq;
	}
	public void setSjrq(String sjrq) {
		this.sjrq = sjrq;
	}
}
