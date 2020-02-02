package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 用户表
 * create by zhoujh
 */
public class SysUserInfoModel {
    private String id;
    private String userNo;  							//编号
    private String orgId;   							//部门ID
    private String userName;							//姓名
    private String stat;								//状态    
    private String birthday;							//生日
    private String gender;								//性别
    private String pwd;									//密码
    private String worktime;							//工作日期
    private String phone;								//固定电话
    private String addr;								//家庭地址
    private String namepy;								//名字拼音
    private String nation;								//民族
    private String idcard;								//证件号
    private String wage;								//年龄
    private String photo;								//头像
    private String remark;								//备注
    private String resume;								//个人说明
    private String roleId;								//角色
    private String deleFlag;							//用户被删除标志 1:删除 0：未删除
    private String email;								//邮箱
    private String mobile;								//手机
    private String curPost;								//主岗位    
    private String studyLevel;							//最高学历
    private String schoolName;							//毕业院校
    private String origo;								//籍贯
    private String maritalStat;							//婚姻状况
    private String isTeller;							//是否柜员
    private String podate;								//岗位开始日期
    private String flag;								//标志位
    private String political;							//政治面貌
    private String height;								//身高
    private String emergentlinker;						//紧急联系人
    private String emergentphone;						//紧急联系人电话
    private String skill;								//技能及特长
    private String health;								//健康状况
    private String postcode;							//邮编
    private String birthaddress;						//出生地
    private String residenaddress;						//户口所在地
    private String jrworktime;							//金融行业从业年限
    private String njrworktime;							//非金融行业从业年限
    private String tellergrade;							//已取得柜员等级
    private String posttime;							//进入该网点时间
    private String postid;								//进入该网点最早岗位
    private String cantellergrade;						//聘任柜员等级
    private String postturnFlag;						//是否轮岗
    private String nopostturn;							//未轮岗的原因
    private String rolekjId;							//会计组别
    private String yhgw;								//要害岗位
    private String deltime;								//离职或者转岗时间    
    private String blgts;								//不轮岗天数
    private String blgstime;							//不轮岗开始时间
    private String mmgqtime;							//密码过期时间
    private String inbanktime;							//进入银行的时间
    private String hxuserno;							//核心工号
    private String zwdl;								//是否需要指纹登录  
    private String zwjj;								//是否需要指纹交接
    private String zwtxdk;								//指纹通信端口
    private String lzzt;								//离职状态
    private String rolefhId;							//分行营管部组别id
    private String professional;						//专业
    private String hobby;								//爱好
    private String oaname;								//oa登录名
    private String otherPost;							//兼任岗位
    private String holderinfo;							//持证信息
    private String hnqualify;							//行内任职资格 ''1'':持有；''0''：不持有
    private String jjemail;								//紧急联系人email
    private String firstdegree;							//第一学历
    private String ygly;								//员工来源
    private String zrgw;								//原从事岗位(转入岗位)
    private String zrjg;								//原从事机构(转入机构)
    private String zcgw;								//转出岗位
    private String jobCategory;							//新加项用工性质  字典表配置：2003
    private String zc;									//职称
    private String orderCategory;						//序列类别
    private String orderLevel;							//序列等级
    private String yytxgznx;							//进入运营条线工作时间
    private String isReserve;							//是否是后备
    private String haveBankCard;						//行内持证信息
    private String haveSocietyCard;						//社会证书信息
    private String isqualified;							//技能是否达标
    private String inputChinese;						//汉字录入
    private String keypad;								//数字小键盘
    private String manualCounting;						//手工点钞
    private String machineCounting;						//机器点钞
    private String isyytx;								//进入条线类别
    private String tellerId;							//网点柜员组
    private String attPid;								//文件上传pid
    private String orgTwo;								//兼管机构
    private String idtype;								//证件类型
    
    //密码信息
    private String password;							//密码
    private String pwdStatus;							//密码状态
    private int errnum;									//错误次数
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getWorktime() {
		return worktime;
	}
	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getNamepy() {
		return namepy;
	}
	public void setNamepy(String namepy) {
		this.namepy = namepy;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getWage() {
		return wage;
	}
	public void setWage(String wage) {
		this.wage = wage;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getDeleFlag() {
		return deleFlag;
	}
	public void setDeleFlag(String deleFlag) {
		this.deleFlag = deleFlag;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCurPost() {
		return curPost;
	}
	public void setCurPost(String curPost) {
		this.curPost = curPost;
	}
	public String getStudyLevel() {
		return studyLevel;
	}
	public void setStudyLevel(String studyLevel) {
		this.studyLevel = studyLevel;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getOrigo() {
		return origo;
	}
	public void setOrigo(String origo) {
		this.origo = origo;
	}
	public String getMaritalStat() {
		return maritalStat;
	}
	public void setMaritalStat(String maritalStat) {
		this.maritalStat = maritalStat;
	}
	public String getIsTeller() {
		return isTeller;
	}
	public void setIsTeller(String isTeller) {
		this.isTeller = isTeller;
	}
	public String getPodate() {
		return podate;
	}
	public void setPodate(String podate) {
		this.podate = podate;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getPolitical() {
		return political;
	}
	public void setPolitical(String political) {
		this.political = political;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getEmergentlinker() {
		return emergentlinker;
	}
	public void setEmergentlinker(String emergentlinker) {
		this.emergentlinker = emergentlinker;
	}
	public String getEmergentphone() {
		return emergentphone;
	}
	public void setEmergentphone(String emergentphone) {
		this.emergentphone = emergentphone;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getBirthaddress() {
		return birthaddress;
	}
	public void setBirthaddress(String birthaddress) {
		this.birthaddress = birthaddress;
	}
	public String getResidenaddress() {
		return residenaddress;
	}
	public void setResidenaddress(String residenaddress) {
		this.residenaddress = residenaddress;
	}
	public String getJrworktime() {
		return jrworktime;
	}
	public void setJrworktime(String jrworktime) {
		this.jrworktime = jrworktime;
	}
	public String getNjrworktime() {
		return njrworktime;
	}
	public void setNjrworktime(String njrworktime) {
		this.njrworktime = njrworktime;
	}
	public String getTellergrade() {
		return tellergrade;
	}
	public void setTellergrade(String tellergrade) {
		this.tellergrade = tellergrade;
	}
	public String getPosttime() {
		return posttime;
	}
	public void setPosttime(String posttime) {
		this.posttime = posttime;
	}
	public String getPostid() {
		return postid;
	}
	public void setPostid(String postid) {
		this.postid = postid;
	}
	public String getCantellergrade() {
		return cantellergrade;
	}
	public void setCantellergrade(String cantellergrade) {
		this.cantellergrade = cantellergrade;
	}
	public String getPostturnFlag() {
		return postturnFlag;
	}
	public void setPostturnFlag(String postturnFlag) {
		this.postturnFlag = postturnFlag;
	}
	public String getNopostturn() {
		return nopostturn;
	}
	public void setNopostturn(String nopostturn) {
		this.nopostturn = nopostturn;
	}
	public String getRolekjId() {
		return rolekjId;
	}
	public void setRolekjId(String rolekjId) {
		this.rolekjId = rolekjId;
	}
	public String getYhgw() {
		return yhgw;
	}
	public void setYhgw(String yhgw) {
		this.yhgw = yhgw;
	}
	public String getDeltime() {
		return deltime;
	}
	public void setDeltime(String deltime) {
		this.deltime = deltime;
	}
	public String getBlgts() {
		return blgts;
	}
	public void setBlgts(String blgts) {
		this.blgts = blgts;
	}
	public String getBlgstime() {
		return blgstime;
	}
	public void setBlgstime(String blgstime) {
		this.blgstime = blgstime;
	}
	public String getMmgqtime() {
		return mmgqtime;
	}
	public void setMmgqtime(String mmgqtime) {
		this.mmgqtime = mmgqtime;
	}
	public String getInbanktime() {
		return inbanktime;
	}
	public void setInbanktime(String inbanktime) {
		this.inbanktime = inbanktime;
	}
	public String getHxuserno() {
		return hxuserno;
	}
	public void setHxuserno(String hxuserno) {
		this.hxuserno = hxuserno;
	}
	public String getZwdl() {
		return zwdl;
	}
	public void setZwdl(String zwdl) {
		this.zwdl = zwdl;
	}
	public String getZwjj() {
		return zwjj;
	}
	public void setZwjj(String zwjj) {
		this.zwjj = zwjj;
	}
	public String getZwtxdk() {
		return zwtxdk;
	}
	public void setZwtxdk(String zwtxdk) {
		this.zwtxdk = zwtxdk;
	}
	public String getLzzt() {
		return lzzt;
	}
	public void setLzzt(String lzzt) {
		this.lzzt = lzzt;
	}
	public String getRolefhId() {
		return rolefhId;
	}
	public void setRolefhId(String rolefhId) {
		this.rolefhId = rolefhId;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getOaname() {
		return oaname;
	}
	public void setOaname(String oaname) {
		this.oaname = oaname;
	}
	public String getOtherPost() {
		return otherPost;
	}
	public void setOtherPost(String otherPost) {
		this.otherPost = otherPost;
	}
	public String getHolderinfo() {
		return holderinfo;
	}
	public void setHolderinfo(String holderinfo) {
		this.holderinfo = holderinfo;
	}
	public String getHnqualify() {
		return hnqualify;
	}
	public void setHnqualify(String hnqualify) {
		this.hnqualify = hnqualify;
	}
	public String getJjemail() {
		return jjemail;
	}
	public void setJjemail(String jjemail) {
		this.jjemail = jjemail;
	}
	public String getFirstdegree() {
		return firstdegree;
	}
	public void setFirstdegree(String firstdegree) {
		this.firstdegree = firstdegree;
	}
	public String getYgly() {
		return ygly;
	}
	public void setYgly(String ygly) {
		this.ygly = ygly;
	}
	public String getZrgw() {
		return zrgw;
	}
	public void setZrgw(String zrgw) {
		this.zrgw = zrgw;
	}
	public String getZrjg() {
		return zrjg;
	}
	public void setZrjg(String zrjg) {
		this.zrjg = zrjg;
	}
	public String getZcgw() {
		return zcgw;
	}
	public void setZcgw(String zcgw) {
		this.zcgw = zcgw;
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}
	public String getZc() {
		return zc;
	}
	public void setZc(String zc) {
		this.zc = zc;
	}
	public String getOrderCategory() {
		return orderCategory;
	}
	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}
	public String getOrderLevel() {
		return orderLevel;
	}
	public void setOrderLevel(String orderLevel) {
		this.orderLevel = orderLevel;
	}
	public String getYytxgznx() {
		return yytxgznx;
	}
	public void setYytxgznx(String yytxgznx) {
		this.yytxgznx = yytxgznx;
	}
	public String getIsReserve() {
		return isReserve;
	}
	public void setIsReserve(String isReserve) {
		this.isReserve = isReserve;
	}
	public String getHaveBankCard() {
		return haveBankCard;
	}
	public void setHaveBankCard(String haveBankCard) {
		this.haveBankCard = haveBankCard;
	}
	public String getHaveSocietyCard() {
		return haveSocietyCard;
	}
	public void setHaveSocietyCard(String haveSocietyCard) {
		this.haveSocietyCard = haveSocietyCard;
	}
	public String getIsqualified() {
		return isqualified;
	}
	public void setIsqualified(String isqualified) {
		this.isqualified = isqualified;
	}
	public String getInputChinese() {
		return inputChinese;
	}
	public void setInputChinese(String inputChinese) {
		this.inputChinese = inputChinese;
	}
	public String getKeypad() {
		return keypad;
	}
	public void setKeypad(String keypad) {
		this.keypad = keypad;
	}
	public String getManualCounting() {
		return manualCounting;
	}
	public void setManualCounting(String manualCounting) {
		this.manualCounting = manualCounting;
	}
	public String getMachineCounting() {
		return machineCounting;
	}
	public void setMachineCounting(String machineCounting) {
		this.machineCounting = machineCounting;
	}
	public String getIsyytx() {
		return isyytx;
	}
	public void setIsyytx(String isyytx) {
		this.isyytx = isyytx;
	}
	public String getTellerId() {
		return tellerId;
	}
	public void setTellerId(String tellerId) {
		this.tellerId = tellerId;
	}
	public String getAttPid() {
		return attPid;
	}
	public void setAttPid(String attPid) {
		this.attPid = attPid;
	}
	public String getOrgTwo() {
		return orgTwo;
	}
	public void setOrgTwo(String orgTwo) {
		this.orgTwo = orgTwo;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPwdStatus() {
		return pwdStatus;
	}
	public void setPwdStatus(String pwdStatus) {
		this.pwdStatus = pwdStatus;
	}
	public int getErrnum() {
		return errnum;
	}
	public void setErrnum(int errnum) {
		this.errnum = errnum;
	}
	
}
