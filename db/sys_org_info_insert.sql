INSERT INTO ecms.sys_org_info(
id,
orgname,
orgnum,
upid,
ordernum,
linkman,
phonenum,
orgadress,
remark,
stat,
by2,
by3,
by4,
by5,
by6,
sfkwd,
bkwdyy,
jgsfcq,
ssfh,
orgadressnum,
kind,
windownum,
standard,
cityno,
districtno,
resttime,
resttimenotice,
worktimenotice,
longitude,
latitude,
jshzg
)
SELECT 
branchno, 
branchname,  -- 网点名称
zoneno,      -- 分行编号
zlvlcode,   -- 机构层级代码
branchtype,   -- 网点类型
NAME,  --  联系人
tel,  -- 电话
address, -- 地址
note1,     --  备注1
clearflag,-- 清算标识
branchlevel,-- 网点级别
zcbrdes, -- 机构简称
zipcode,-- 邮编
startteller1, -- 开工柜员1
startteller2, -- 开工柜员2
selfauditflag, -- 独立核算标志
zbrct, -- 机构负责人名称
region, -- 地区
zcbrdes, -- 机构简称
zipcode, -- 邮编
STATUS, -- 网点状态
note1, -- 备注1
note2, -- 本地授权 远程授权
brcity, -- 城市
region, -- 地区
clearflag, -- 清算标识
tel2, -- 电话2
tel3, -- 电话3
zreppath, -- 报表层级路径
zclrpath, -- 报表层级路径
note3 -- 身份证核查模式
FROM  sirotestdb.ecms_branch_info t WHERE t.branchno !='' 