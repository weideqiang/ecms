package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 机构表
 * create by zhoujh
 */
public class SysOrgInfoModel {
    private String id;
    private String orgname;  							//机构名称
    private String orgnum;   							//机构号
    private String upid;								//上级id
    private String ordernum;							//排序字段 
    private String birthday;							//联系人
    private String phonenum;							//联系电话
    private String orgadress;							//机构地址
    private String remark;								//备注
    private String stat;								//记录状态
    private String by2;									//机构级别
    private String by3;									//机构类型
    private String by4;									//地区代码
    private String by5;									//备用
    private String by6;									//备用
    private String sfkwd;								//是否跨网点(1是0不是)
    private String bkwdyy;								//不跨网点原因
    private String jgsfcq;								//机构是否城区
    private String ssfh;								//所示分行
    private String orgadressnum;						//邮编
    private String kind;								//小微支行类型
    private String windownum;							//窗口数量
    private String standard;							//是否标准流程 
    private String cityno;								//城市编号
    private String districtno;							//城区编号
    private String resttime;							//休息日工作标识
    private String resttimenotice;						//休息日工作说明
    private String worktimenotice;						//工作日工作说明
    private String longitude;							//经度
    private String latitude;							//纬度
    private String jshzg;								//结售汇资格
    private String height;								//身高
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getOrgnum() {
		return orgnum;
	}
	public void setOrgnum(String orgnum) {
		this.orgnum = orgnum;
	}
	public String getUpid() {
		return upid;
	}
	public void setUpid(String upid) {
		this.upid = upid;
	}
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getOrgadress() {
		return orgadress;
	}
	public void setOrgadress(String orgadress) {
		this.orgadress = orgadress;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getBy2() {
		return by2;
	}
	public void setBy2(String by2) {
		this.by2 = by2;
	}
	public String getBy3() {
		return by3;
	}
	public void setBy3(String by3) {
		this.by3 = by3;
	}
	public String getBy4() {
		return by4;
	}
	public void setBy4(String by4) {
		this.by4 = by4;
	}
	public String getBy5() {
		return by5;
	}
	public void setBy5(String by5) {
		this.by5 = by5;
	}
	public String getBy6() {
		return by6;
	}
	public void setBy6(String by6) {
		this.by6 = by6;
	}
	public String getSfkwd() {
		return sfkwd;
	}
	public void setSfkwd(String sfkwd) {
		this.sfkwd = sfkwd;
	}
	public String getBkwdyy() {
		return bkwdyy;
	}
	public void setBkwdyy(String bkwdyy) {
		this.bkwdyy = bkwdyy;
	}
	public String getJgsfcq() {
		return jgsfcq;
	}
	public void setJgsfcq(String jgsfcq) {
		this.jgsfcq = jgsfcq;
	}
	public String getSsfh() {
		return ssfh;
	}
	public void setSsfh(String ssfh) {
		this.ssfh = ssfh;
	}
	public String getOrgadressnum() {
		return orgadressnum;
	}
	public void setOrgadressnum(String orgadressnum) {
		this.orgadressnum = orgadressnum;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getWindownum() {
		return windownum;
	}
	public void setWindownum(String windownum) {
		this.windownum = windownum;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getCityno() {
		return cityno;
	}
	public void setCityno(String cityno) {
		this.cityno = cityno;
	}
	public String getDistrictno() {
		return districtno;
	}
	public void setDistrictno(String districtno) {
		this.districtno = districtno;
	}
	public String getResttime() {
		return resttime;
	}
	public void setResttime(String resttime) {
		this.resttime = resttime;
	}
	public String getResttimenotice() {
		return resttimenotice;
	}
	public void setResttimenotice(String resttimenotice) {
		this.resttimenotice = resttimenotice;
	}
	public String getWorktimenotice() {
		return worktimenotice;
	}
	public void setWorktimenotice(String worktimenotice) {
		this.worktimenotice = worktimenotice;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getJshzg() {
		return jshzg;
	}
	public void setJshzg(String jshzg) {
		this.jshzg = jshzg;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
}
