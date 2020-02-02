/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.7.18-cynos-log : Database - ecms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ecms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ecms`;

/*Table structure for table `EFS_BRN_BASEINFO` */

CREATE TABLE `EFS_BRN_BASEINFO` (
  `ZONENO` varchar(16) DEFAULT NULL COMMENT '分行号',
  `BRNO` varchar(16) DEFAULT NULL COMMENT '机构号',
  `BRSNAME` varchar(60) DEFAULT NULL COMMENT '机构名称(简称)',
  `BRLNAME` varchar(128) DEFAULT NULL COMMENT '机构名称(全称)',
  `BRENNAME` varchar(128) DEFAULT NULL COMMENT '机构英文名称',
  `BRTYPE` varchar(2) DEFAULT NULL COMMENT '机构类型',
  `BRLEVEL` varchar(2) DEFAULT NULL COMMENT '机构级别',
  `LOGINTYPE` varchar(1) DEFAULT NULL COMMENT '认证方式',
  `CITYNO` varchar(16) DEFAULT NULL COMMENT '城市代码',
  `CITYNAME` varchar(60) DEFAULT NULL COMMENT '城市名称',
  `USERNAME` varchar(30) DEFAULT NULL COMMENT '联系人',
  `TEL` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `ADDRESS` varchar(128) DEFAULT NULL COMMENT '联系地址',
  `ZIPCODE` varchar(6) DEFAULT NULL COMMENT '邮政编码',
  `EMAIL` varchar(128) DEFAULT NULL COMMENT '电子邮件地址',
  `BRNOTE` varchar(512) DEFAULT NULL COMMENT '机构描述',
  `FXTYPE` varchar(1) DEFAULT NULL COMMENT '结售汇资格',
  `AUTOBALANCE` varchar(1) DEFAULT NULL COMMENT '自动平盘',
  `ADDFLAG` varchar(1) DEFAULT NULL COMMENT '子表标志',
  `STATUS` varchar(2) DEFAULT NULL COMMENT '状态',
  `ECNO` varchar(2) DEFAULT NULL COMMENT '设备控制号',
  `CITYEXCHGNO` varchar(20) DEFAULT NULL COMMENT '同城交换号',
  `PAYNO` varchar(14) DEFAULT NULL COMMENT '支付行号',
  `NOTE1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `NOTE2` varchar(20) DEFAULT NULL COMMENT '备注2',
  `NOTE3` varchar(30) DEFAULT NULL COMMENT '备注3',
  `NOTE4` varchar(40) DEFAULT NULL COMMENT '备注4',
  `NOTE5` varchar(50) DEFAULT NULL COMMENT '备注5',
  `NOTE6` varchar(60) DEFAULT NULL COMMENT '备注6'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构基础信息表';

/*Data for the table `EFS_BRN_BASEINFO` */

/*Table structure for table `EFS_BRN_RELAINFO` */

CREATE TABLE `EFS_BRN_RELAINFO` (
  `ZONENO` varchar(16) DEFAULT NULL COMMENT '分行号',
  `BRNO` varchar(16) DEFAULT NULL COMMENT '机构号',
  `BRNAME` varchar(128) DEFAULT NULL COMMENT '机构名称',
  `UPBRNO` varchar(16) DEFAULT NULL COMMENT '上级机构号',
  `UPBRNAME` varchar(128) DEFAULT NULL COMMENT '上级机构名称',
  `RELTYPE` varchar(2) DEFAULT NULL COMMENT '层级类别',
  `STATUS` varchar(1) DEFAULT NULL COMMENT '状态',
  `NOTE1` varchar(10) DEFAULT NULL COMMENT '备注1 ',
  `NOTE2` varchar(20) DEFAULT NULL COMMENT '备注2 ',
  `NOTE3` varchar(30) DEFAULT NULL COMMENT '备注3 ',
  `NOTE4` varchar(40) DEFAULT NULL COMMENT '备注4 ',
  `NOTE5` varchar(50) DEFAULT NULL COMMENT '备注5 ',
  `NOTE6` varchar(60) DEFAULT NULL COMMENT '备注6 '
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构层级关系';

/*Data for the table `EFS_BRN_RELAINFO` */

/*Table structure for table `EFS_DEV_REGINFO` */

CREATE TABLE `EFS_DEV_REGINFO` (
  `DEVID` varchar(32) DEFAULT NULL COMMENT '设备编号 ',
  `DEVTYPE` varchar(2) DEFAULT NULL COMMENT '设备类型 ',
  `BINDFLAG` varchar(1) DEFAULT NULL COMMENT '绑定标志 ',
  `BINDUSER` varchar(128) DEFAULT NULL COMMENT '绑定用户 ',
  `OSNAME` varchar(256) DEFAULT NULL COMMENT '系统信息（OS） ',
  `IPINFO` varchar(32) DEFAULT NULL COMMENT '网络地址（IP） ',
  `MACINFO` varchar(32) DEFAULT NULL COMMENT '设备地址（MAC）',
  `CPUINFO` varchar(256) DEFAULT NULL COMMENT '处理器信息（CPU）',
  `MEMINFO` varchar(256) DEFAULT NULL COMMENT '内存信息（MEM）',
  `DISKINFO` varchar(256) DEFAULT NULL COMMENT '磁盘信息（DISK） ',
  `SRVDATE1` varchar(8) DEFAULT NULL COMMENT '服务日期（起始） ',
  `SRVDATE2` varchar(8) DEFAULT NULL COMMENT '服务日期（截止） ',
  `SRVTIME1` varchar(6) DEFAULT NULL COMMENT '服务时间（起始） ',
  `SRVTIME2` varchar(6) DEFAULT NULL COMMENT '服务时间（截止） ',
  `ZONENO` varchar(16) DEFAULT NULL COMMENT '所属分行 ',
  `BRNO` varchar(16) DEFAULT NULL COMMENT '所属网点 ',
  `STATUS` varchar(1) DEFAULT NULL COMMENT '状态 ',
  `NOTE` varchar(128) DEFAULT NULL COMMENT '备注 ',
  `NOTE1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `NOTE2` varchar(20) DEFAULT NULL COMMENT '备注2',
  `NOTE3` varchar(30) DEFAULT NULL COMMENT '备注3',
  `NOTE4` varchar(40) DEFAULT NULL COMMENT '备注4',
  `NOTE5` varchar(50) DEFAULT NULL COMMENT '备注5',
  `NOTE6` varchar(60) DEFAULT NULL COMMENT '备注6'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备信息注册表';

/*Data for the table `EFS_DEV_REGINFO` */

/*Table structure for table `EFS_USR_BASEINFO` */

CREATE TABLE `EFS_USR_BASEINFO` (
  `USERNO` varchar(16) DEFAULT NULL COMMENT '用户号',
  `CNNAME` varchar(60) DEFAULT NULL COMMENT '用户中文名称',
  `ENNAME` varchar(60) DEFAULT NULL COMMENT '用户英文名称',
  `IDTYPE` varchar(3) DEFAULT NULL COMMENT '证件类型',
  `IDCARD` varchar(20) DEFAULT NULL COMMENT '证件号码',
  `POSITION` varchar(1) DEFAULT NULL COMMENT '岗位(人力资源岗位)',
  `SEX` varchar(1) DEFAULT NULL COMMENT '性别',
  `USERCLASS` varchar(1) DEFAULT NULL COMMENT '用户类别',
  `EMAIL` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `PHONE` varchar(32) DEFAULT NULL COMMENT '电话',
  `MOBILE` varchar(32) DEFAULT NULL COMMENT '手机',
  `FAX` varchar(32) DEFAULT NULL COMMENT '传真',
  `ADDRESS` varchar(60) DEFAULT NULL COMMENT '地址',
  `LOGINTYPE` varchar(1) DEFAULT NULL COMMENT '认证方式',
  `ORGID` varchar(16) DEFAULT NULL COMMENT '所属主机构',
  `ADMORG` varchar(16) DEFAULT NULL COMMENT '用户行政',
  `USERTYPE` varchar(1) DEFAULT NULL COMMENT '用户类型',
  `USERRANK` varchar(10) DEFAULT NULL COMMENT '用户级别',
  `USERNOTE` varchar(128) DEFAULT NULL COMMENT '用户描述',
  `USERSOU` varchar(1) DEFAULT NULL COMMENT '用户来源',
  `STATUS` varchar(1) DEFAULT NULL COMMENT '用户状态',
  `ROMARK` varchar(1) DEFAULT NULL COMMENT '轧账标志',
  `NOTE1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `NOTE2` varchar(20) DEFAULT NULL COMMENT '备注2',
  `NOTE3` varchar(30) DEFAULT NULL COMMENT '备注3',
  `NOTE4` varchar(40) DEFAULT NULL COMMENT '备注4',
  `NOTE5` varchar(50) DEFAULT NULL COMMENT '备注5',
  `NOTE6` varchar(60) DEFAULT NULL COMMENT '备注6'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户基本信息表';

/*Data for the table `EFS_USR_BASEINFO` */

/*Table structure for table `EFS_USR_ROLEINFO` */

CREATE TABLE `EFS_USR_ROLEINFO` (
  `ZONENO` varchar(16) DEFAULT NULL COMMENT '分行号',
  `BRNO` varchar(16) DEFAULT NULL COMMENT '机构号',
  `USERNO` varchar(16) DEFAULT NULL COMMENT '用户号',
  `SYSNO` varchar(16) DEFAULT NULL COMMENT '系统编号',
  `ROLELVL` varchar(1) DEFAULT NULL COMMENT '角色层级',
  `ROLETYPE` varchar(1) DEFAULT NULL COMMENT '角色类型',
  `ROLENO` varchar(8) DEFAULT NULL COMMENT '角色代码',
  `ROLENAME` varchar(60) DEFAULT NULL COMMENT '角色名称',
  `STATUS` varchar(1) DEFAULT NULL COMMENT '状态',
  `NOTE1` varchar(10) DEFAULT NULL COMMENT '备注1',
  `NOTE2` varchar(20) DEFAULT NULL COMMENT '备注2',
  `NOTE3` varchar(30) DEFAULT NULL COMMENT '备注3',
  `NOTE4` varchar(40) DEFAULT NULL COMMENT '备注4',
  `NOTE5` varchar(50) DEFAULT NULL COMMENT '备注5',
  `NOTE6` varchar(60) DEFAULT NULL COMMENT '备注6'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色信息表';

/*Data for the table `EFS_USR_ROLEINFO` */

/*Table structure for table `EFS_USR_ROLETYPE` */

CREATE TABLE `EFS_USR_ROLETYPE` (
  `ZONENO` varchar(16) DEFAULT NULL COMMENT '分行号',
  `SYSNO` varchar(16) DEFAULT NULL COMMENT '系统编号',
  `ROLETYPE` varchar(1) DEFAULT NULL COMMENT '角色类型',
  `ROLENO` varchar(16) DEFAULT NULL COMMENT '角色编号',
  `ROLENAME` varchar(128) DEFAULT NULL COMMENT '角色名称',
  `TRANFLAG` varchar(1) DEFAULT NULL COMMENT '转移标志',
  `ROLELVL` varchar(1) DEFAULT NULL COMMENT '角色层级',
  `ROLENOTE` varchar(512) DEFAULT NULL COMMENT '角色说明',
  `STATUS` varchar(1) DEFAULT NULL COMMENT '状态',
  `NOTE1` varchar(10) DEFAULT NULL COMMENT '备注1 ',
  `NOTE2` varchar(20) DEFAULT NULL COMMENT '备注2 ',
  `NOTE3` varchar(30) DEFAULT NULL COMMENT '备注3 ',
  `NOTE4` varchar(40) DEFAULT NULL COMMENT '备注4 ',
  `NOTE5` varchar(50) DEFAULT NULL COMMENT '备注5 ',
  `NOTE6` varchar(60) DEFAULT NULL COMMENT '备注6 '
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色信息定义表';

/*Data for the table `EFS_USR_ROLETYPE` */

/*Table structure for table `EFS_VOUCH_BASEINFO` */

CREATE TABLE `EFS_VOUCH_BASEINFO` (
  `VOUHTYPE` varchar(3) DEFAULT NULL COMMENT '凭证类型',
  `VOUCHNAME` varchar(128) DEFAULT NULL COMMENT '凭证名称',
  `SUBVOUHTYPE` varchar(16) DEFAULT NULL COMMENT '凭证类型（子类型）',
  `SUBVOUCHNAME` varchar(128) DEFAULT NULL COMMENT '凭证名称（子类型）',
  `SUBJECT` varchar(32) DEFAULT NULL COMMENT '表外科目',
  `VOUCHLENGTH` varchar(2) DEFAULT NULL COMMENT '凭证长度',
  `ENGLISHLENGTH` varchar(2) DEFAULT NULL COMMENT '英文前缀长度',
  `ACCTCONNFLAG` varchar(1) DEFAULT NULL COMMENT '是否关联账号',
  `ACCNO` varchar(32) DEFAULT NULL COMMENT '关联账号',
  `BANKINFOFLAG` varchar(1) DEFAULT NULL COMMENT '是否有银行信息号',
  `BANKINFO` varchar(32) DEFAULT NULL COMMENT '银行信息号',
  `FEE` varchar(19) DEFAULT NULL COMMENT '凭证出售单价',
  `E4CTYP` varchar(10) DEFAULT NULL COMMENT '核心卡类型',
  `E5CGEN` varchar(2) DEFAULT NULL COMMENT '制卡规则',
  `STATE` varchar(1) DEFAULT NULL COMMENT '状态',
  `MINNUM` varchar(10) DEFAULT NULL COMMENT '最小调拨数量',
  `NOTE1` varchar(10) DEFAULT NULL COMMENT '备注1 ',
  `NOTE2` varchar(20) DEFAULT NULL COMMENT '备注2 ',
  `NOTE3` varchar(30) DEFAULT NULL COMMENT '备注3 ',
  `NOTE4` varchar(40) DEFAULT NULL COMMENT '备注4 ',
  `NOTE5` varchar(50) DEFAULT NULL COMMENT '备注5 ',
  `NOTE6` varchar(60) DEFAULT NULL COMMENT '备注6 '
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='凭证基础参数表';

/*Data for the table `EFS_VOUCH_BASEINFO` */

/*Table structure for table `SYS_ATTACHMENTS` */

CREATE TABLE `SYS_ATTACHMENTS` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `PID` varchar(40) DEFAULT NULL COMMENT '父主键',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '记录用户',
  `FILENAME` varchar(200) DEFAULT NULL COMMENT '文件名',
  `FILEPATH` varchar(200) DEFAULT NULL COMMENT '文件路径',
  `FILETYPE` varchar(40) DEFAULT NULL COMMENT '文件类型',
  `PIDTYPE` varchar(40) DEFAULT NULL COMMENT '父设置类型',
  `CREATEDATE` varchar(20) DEFAULT NULL COMMENT '记录创建时间',
  `STATUS` varchar(2) DEFAULT NULL COMMENT '状态',
  `YXPTID` varchar(80) DEFAULT NULL COMMENT '影像平台文件ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='附件表';

/*Data for the table `SYS_ATTACHMENTS` */

/*Table structure for table `SYS_DSCGOODS_INFO` */

CREATE TABLE `SYS_DSCGOODS_INFO` (
  `ID` varchar(50) NOT NULL COMMENT 'ID',
  `WTYPE` varchar(50) DEFAULT NULL COMMENT '物品类别',
  `WNAME` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `WPBZ` varchar(1200) DEFAULT NULL COMMENT '物品备注(申请说明)',
  `SUSERNO` varchar(20) DEFAULT NULL COMMENT '申请人工号',
  `SUSERNAME` varchar(20) DEFAULT NULL COMMENT '申请人姓名',
  `SORGNO` varchar(20) DEFAULT NULL COMMENT '申请人机构号',
  `SORGNAME` varchar(50) DEFAULT NULL COMMENT '申请人机构名称',
  `SQTIME` varchar(40) DEFAULT NULL COMMENT '申请时间',
  `STAT` varchar(5) DEFAULT NULL COMMENT '状态',
  `REMARK1` varchar(400) DEFAULT NULL COMMENT '备注1 ',
  `SQSM` varchar(400) DEFAULT NULL COMMENT '申请说明',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='待创建物品表';

/*Data for the table `SYS_DSCGOODS_INFO` */

/*Table structure for table `SYS_GOODSSON_INFO` */

CREATE TABLE `SYS_GOODSSON_INFO` (
  `ID` varchar(100) NOT NULL COMMENT 'ID ',
  `SONNAME` varchar(200) DEFAULT NULL COMMENT '子类名称 ',
  `GOODSID` varchar(200) DEFAULT NULL COMMENT '物品大类id ',
  `QYZT` char(1) DEFAULT NULL COMMENT '状态 ',
  `TIME` varchar(100) DEFAULT NULL COMMENT '添加时间 ',
  `SSORG` varchar(100) DEFAULT NULL COMMENT '子类创建人所属机构 ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品类别表';

/*Data for the table `SYS_GOODSSON_INFO` */

/*Table structure for table `SYS_GOODS_GROUP` */

CREATE TABLE `SYS_GOODS_GROUP` (
  `GOODSID` varchar(40) NOT NULL COMMENT '物品ID',
  `FZID` varchar(40) DEFAULT NULL COMMENT '分组ID',
  `FZNAME` varchar(200) DEFAULT NULL COMMENT '分组名',
  `STAT` varchar(2) DEFAULT NULL COMMENT '数据状态',
  `CZUSER` varchar(100) DEFAULT NULL COMMENT '操作人',
  `CZDATE` varchar(20) DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`GOODSID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品组表';

/*Data for the table `SYS_GOODS_GROUP` */

/*Table structure for table `SYS_GOODS_INCOMBLE` */

CREATE TABLE `SYS_GOODS_INCOMBLE` (
  `GOODSID` varchar(40) DEFAULT NULL COMMENT '物品类别id',
  `INCOMID` varchar(40) DEFAULT NULL COMMENT '不兼容物品类别id',
  `TYPE` varchar(2) DEFAULT NULL COMMENT '不兼容规则类型',
  `ID` varchar(100) NOT NULL COMMENT 'ID ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='不兼容物品表';

/*Data for the table `SYS_GOODS_INCOMBLE` */

/*Table structure for table `SYS_GOODS_INFO` */

CREATE TABLE `SYS_GOODS_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `NAME` varchar(100) DEFAULT NULL COMMENT '物品名称',
  `IMPO_GOODS_EXPLAIN` varchar(1200) DEFAULT NULL COMMENT '重要物品说明',
  `SSORG` varchar(40) DEFAULT NULL COMMENT ' 所属机构 ',
  `DELE_FLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `TYPE` varchar(50) DEFAULT NULL COMMENT '物品类别',
  `TNAME` varchar(100) DEFAULT NULL COMMENT '不包括机构的名称',
  `CREATEDATE` varchar(20) DEFAULT NULL COMMENT '创建日期',
  `CREATEUSER` varchar(100) DEFAULT NULL COMMENT '创建人',
  `FHR` varchar(100) DEFAULT NULL COMMENT '复核人',
  `ZYGOODS` varchar(40) DEFAULT NULL COMMENT '主备物品ID',
  `FZNAME` varchar(200) DEFAULT NULL COMMENT '分组名称',
  `FZSTAT` varchar(2) DEFAULT NULL COMMENT '分组设置标识',
  `XFDATE` varchar(20) DEFAULT NULL COMMENT '下发日期',
  `ZCLYR` varchar(100) DEFAULT NULL COMMENT '最初领用人',
  `QYRQ` varchar(20) DEFAULT NULL COMMENT '启用日期',
  `SJR` varchar(100) DEFAULT NULL COMMENT '上缴人',
  `SJRXM` varchar(100) DEFAULT NULL COMMENT '上缴人姓名',
  `CREATEUSERXM` varchar(100) DEFAULT NULL COMMENT '创建人姓名',
  `TYRQ` varchar(20) DEFAULT NULL COMMENT '停用日期',
  `XHRQ` varchar(20) DEFAULT NULL COMMENT '销毁日期',
  `ZCLYRXM` varchar(100) DEFAULT NULL COMMENT '最初领用人姓名',
  `QYR` varchar(100) DEFAULT NULL COMMENT '启用人',
  `QYRXM` varchar(100) DEFAULT NULL COMMENT '启用人姓名',
  `FCR` varchar(100) DEFAULT NULL COMMENT '封存人',
  `FCRQ` varchar(100) DEFAULT NULL COMMENT '封存日期',
  `FCRXM` varchar(100) DEFAULT NULL COMMENT '封存人姓名',
  `TYR` varchar(100) DEFAULT NULL COMMENT '停用人',
  `TYRXM` varchar(100) DEFAULT NULL COMMENT '停用人姓名',
  `XHR` varchar(100) DEFAULT NULL COMMENT '销毁人',
  `XHRXM` varchar(100) DEFAULT NULL COMMENT '销毁人姓名',
  `XFR` varchar(100) DEFAULT NULL COMMENT '下发人',
  `FZID` varchar(40) DEFAULT NULL COMMENT '分组ID',
  `SONNAME` varchar(100) DEFAULT NULL COMMENT '子类名称',
  `SONID` varchar(100) DEFAULT NULL COMMENT '子类ID',
  `XFRTWO` varchar(100) DEFAULT NULL COMMENT '印章下发人2 ',
  `ZBID` varchar(100) DEFAULT NULL COMMENT '不兼容表id',
  `SJRQ` varchar(20) DEFAULT NULL COMMENT '上缴日期',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品信息表';

/*Data for the table `SYS_GOODS_INFO` */

/*Table structure for table `SYS_MAIN_NOTICE` */

CREATE TABLE `SYS_MAIN_NOTICE` (
  `ID` varchar(40) NOT NULL COMMENT 'ID ',
  `NOTICE` varchar(300) DEFAULT NULL COMMENT '消息提醒 ',
  `NOTICE_STATUS` char(1) DEFAULT NULL COMMENT '提醒状态 ',
  `UPDATE_TIME` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) COMMENT '更新时间 ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='提醒消息表';

/*Data for the table `SYS_MAIN_NOTICE` */

/*Table structure for table `SYS_MENU_INFO` */

CREATE TABLE `SYS_MENU_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `NAME` varchar(50) DEFAULT NULL COMMENT '名称',
  `URL` varchar(50) DEFAULT NULL COMMENT '地址',
  `TYPE` varchar(2) DEFAULT NULL COMMENT '类型',
  `ICON` varchar(50) DEFAULT NULL COMMENT '图标',
  `ORDERNUM` decimal(20,0) DEFAULT NULL COMMENT '排序',
  `PID` varchar(40) DEFAULT NULL COMMENT '上级菜单',
  `ENABLE` decimal(20,0) DEFAULT NULL COMMENT '状态',
  `REMARK` varchar(400) DEFAULT NULL COMMENT '描述',
  `TARGETTYPE` varchar(2) DEFAULT NULL COMMENT '目标类型',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统菜单表';

/*Data for the table `SYS_MENU_INFO` */

/*Table structure for table `SYS_ORG_AUTOMACHINE` */

CREATE TABLE `SYS_ORG_AUTOMACHINE` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `PID` varchar(40) DEFAULT NULL COMMENT '父级ID',
  `MACHINE_NAME` varchar(200) DEFAULT NULL COMMENT '设备名字',
  `MACHINE_NUM` varchar(5) DEFAULT NULL COMMENT '设备编号',
  `UPDATE_TIME` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) COMMENT '更新时间 ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构自助设备信息表';

/*Data for the table `SYS_ORG_AUTOMACHINE` */

/*Table structure for table `SYS_ORG_INFO` */

CREATE TABLE `SYS_ORG_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `ORGNAME` varchar(100) DEFAULT NULL COMMENT '机构名称',
  `ORGNUM` varchar(20) DEFAULT NULL COMMENT '机构号',
  `UPID` varchar(200) DEFAULT NULL COMMENT '上级id',
  `ORDERNUM` varchar(20) DEFAULT NULL COMMENT '排序字段',
  `LINKMAN` varchar(200) DEFAULT NULL COMMENT '联系人',
  `PHONENUM` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `ORGADRESS` varchar(200) DEFAULT NULL COMMENT '机构地址',
  `REMARK` varchar(200) DEFAULT NULL COMMENT '备注',
  `STAT` varchar(1) DEFAULT NULL COMMENT '记录状态',
  `BY2` varchar(2) DEFAULT NULL COMMENT '机构级别',
  `BY3` varchar(1) DEFAULT NULL COMMENT '机构类型',
  `BY4` varchar(1) DEFAULT NULL COMMENT '地区代码',
  `BY5` varchar(1) DEFAULT NULL COMMENT '备用',
  `BY6` varchar(1) DEFAULT NULL COMMENT '备用',
  `SFKWD` varchar(10) DEFAULT NULL COMMENT '是否跨网点(1是0不是)',
  `BKWDYY` varchar(200) DEFAULT NULL COMMENT '不跨网点原因',
  `JGSFCQ` varchar(10) DEFAULT NULL COMMENT '机构是否城区',
  `SSFH` varchar(20) DEFAULT NULL COMMENT '所示分行',
  `ORGADRESSNUM` varchar(6) DEFAULT NULL COMMENT '邮编',
  `KIND` varchar(20) DEFAULT NULL COMMENT '小微支行类型',
  `WINDOWNUM` varchar(4) DEFAULT NULL COMMENT '窗口数量',
  `STANDARD` char(1) DEFAULT NULL COMMENT '是否标准流程',
  `CITYNO` varchar(16) DEFAULT NULL COMMENT '城市编号',
  `DISTRICTNO` varchar(16) DEFAULT NULL COMMENT '城区编号',
  `RESTTIME` varchar(6) DEFAULT NULL COMMENT '休息日工作标识',
  `RESTTIMENOTICE` varchar(400) DEFAULT NULL COMMENT '休息日工作说明',
  `WORKTIMENOTICE` varchar(400) DEFAULT NULL COMMENT '工作日工作说明',
  `LONGITUDE` varchar(32) DEFAULT NULL COMMENT '经度',
  `LATITUDE` varchar(32) DEFAULT NULL COMMENT '纬度',
  `JSHZG` varchar(2) DEFAULT NULL COMMENT '结售汇资格',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构表';

/*Data for the table `SYS_ORG_INFO` */

/*Table structure for table `SYS_PARAM_INFO` */

CREATE TABLE `SYS_PARAM_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `KEYO` varchar(20) DEFAULT NULL COMMENT '字典标识',
  `NAME` varchar(20) DEFAULT NULL COMMENT '字典名称',
  `VAL` varchar(200) DEFAULT NULL COMMENT '属性键值',
  `REMARK` varchar(1200) DEFAULT NULL COMMENT '中文信息',
  `TYPE` varchar(2) DEFAULT NULL COMMENT '类型',
  `SORTNUM` decimal(10,0) DEFAULT NULL COMMENT '排序',
  `STATUS` varchar(20) DEFAULT NULL COMMENT '状态',
  `RES1` varchar(255) DEFAULT NULL COMMENT '扩展字段',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数表';

/*Data for the table `SYS_PARAM_INFO` */

/*Table structure for table `SYS_POSTLOG_INFO` */

CREATE TABLE `SYS_POSTLOG_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `USERNO` varchar(40) DEFAULT NULL COMMENT '员工号',
  `USERNAME` varchar(40) DEFAULT NULL COMMENT '员工姓名',
  `STARTORGNUM` varchar(40) DEFAULT NULL COMMENT '原机构号',
  `ENDORGNUM` varchar(40) DEFAULT NULL COMMENT '现机构号',
  `STARTPOSTID` varchar(40) DEFAULT NULL COMMENT '原岗位id',
  `STARTDATE` varchar(14) DEFAULT NULL COMMENT '原岗位开始时间',
  `ENDDATE` varchar(14) DEFAULT NULL COMMENT '原岗位结束时',
  `FLAG` varchar(2) DEFAULT NULL COMMENT '标志位',
  `CZDATE` varchar(14) DEFAULT NULL COMMENT '操作时间',
  `REASON` varchar(200) DEFAULT NULL COMMENT '原因',
  `ENDPOSTID` varchar(40) DEFAULT NULL COMMENT '现岗位id',
  `BZ` varchar(40) DEFAULT NULL COMMENT '备注',
  `POSTTIME` varchar(40) DEFAULT NULL COMMENT '进入初始该网点的日期',
  `INITPOSTID` varchar(40) DEFAULT NULL COMMENT '进入原网点最初的岗位id',
  `ZXYY` varchar(40) DEFAULT NULL COMMENT '注销原因',
  `ZXSM` varchar(40) DEFAULT NULL COMMENT '注销说明',
  `EXTENDDATE` varchar(14) DEFAULT NULL COMMENT '拟结束时间(延长时间)',
  `PLAN_FLAG` varchar(1) DEFAULT NULL COMMENT '计划标志位',
  `OUTREASON` varchar(1000) DEFAULT NULL COMMENT '计划外原因',
  `SROLEID` varchar(80) DEFAULT NULL COMMENT '原角色',
  `EROLEID` varchar(80) DEFAULT NULL COMMENT '现角色',
  `RYQX` varchar(40) DEFAULT NULL COMMENT '人员去向              ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='岗位调整记录表';

/*Data for the table `SYS_POSTLOG_INFO` */

/*Table structure for table `SYS_POST_INFO` */

CREATE TABLE `SYS_POST_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `NAME` varchar(30) DEFAULT NULL COMMENT '岗位名称',
  `IN_WORK_PERIOD` decimal(10,0) DEFAULT NULL COMMENT '网点内轮岗期限',
  `ACROSS_WORK_PERIOD` decimal(10,0) DEFAULT NULL COMMENT '跨网点期限',
  `DELE_FLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `ISMAIN` varchar(2) DEFAULT NULL COMMENT '是否为主岗位',
  `FLAG` varchar(2) DEFAULT NULL COMMENT '是否参与轮岗',
  `ISVACATION` varchar(2) DEFAULT NULL COMMENT '是否可用强制休假代替轮岗',
  `VACATION` decimal(10,0) DEFAULT NULL COMMENT '最少强制休假天数',
  `CQBACK` decimal(10,0) DEFAULT NULL COMMENT '允许回原岗位期限(城区)',
  `POST_LEVEL` varchar(2) DEFAULT NULL COMMENT '岗位等级',
  `REMIND_WORK_PERIOD` decimal(10,0) DEFAULT NULL COMMENT '轮岗提醒起始天数',
  `FCQBACK` decimal(10,0) DEFAULT NULL COMMENT '允许回原岗位期限(非城区)',
  `IS_YYTX` varchar(2) DEFAULT NULL COMMENT '岗位是否营运条线',
  `TIPS` varchar(2) DEFAULT NULL COMMENT ' 岗位种类 (支行级别)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='岗位信息表';

/*Data for the table `SYS_POST_INFO` */

/*Table structure for table `SYS_POST_RULE` */

CREATE TABLE `SYS_POST_RULE` (
  `POSTID` varchar(32) NOT NULL COMMENT '岗位id',
  `CANTID` varchar(32) DEFAULT NULL COMMENT '不能轮换成该岗位id',
  `FLAG` varchar(2) DEFAULT NULL COMMENT '标志位',
  PRIMARY KEY (`POSTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='轮岗规则设置表';

/*Data for the table `SYS_POST_RULE` */

/*Table structure for table `SYS_POWER_INFO` */

CREATE TABLE `SYS_POWER_INFO` (
  `MENUID` varchar(40) NOT NULL COMMENT '菜单ID',
  `OBJID` varchar(40) DEFAULT NULL COMMENT '角色ID/机构ID/菜单ID',
  `TYPE` varchar(2) DEFAULT NULL COMMENT '类型',
  `TARGETTYPE` varchar(2) DEFAULT NULL COMMENT '目标类型',
  PRIMARY KEY (`MENUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户权限表';

/*Data for the table `SYS_POWER_INFO` */

/*Table structure for table `SYS_ROLE_INFO` */

CREATE TABLE `SYS_ROLE_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `NAME` varchar(40) DEFAULT NULL COMMENT '名称',
  `REMARK` varchar(255) DEFAULT NULL COMMENT '描述',
  `PID` varchar(40) DEFAULT NULL COMMENT '上级角色',
  `ROLE_DELE_FLAG` varchar(2) DEFAULT NULL COMMENT '角色删除标志',
  `ROLE_LEVEL` varchar(2) DEFAULT NULL COMMENT '角色级别',
  `ROLE_SEQ` varchar(40) DEFAULT NULL COMMENT '角色等级序列',
  `BANK_LEVEL` varchar(2) DEFAULT NULL COMMENT '银行角色级别',
  `ROLE_NO` varchar(40) DEFAULT NULL COMMENT '角色号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

/*Data for the table `SYS_ROLE_INFO` */

/*Table structure for table `SYS_ROLE_POWER` */

CREATE TABLE `SYS_ROLE_POWER` (
  `ID` varchar(40) NOT NULL COMMENT 'ID ',
  `ROLE_ID` varchar(40) DEFAULT NULL COMMENT '角色ID ',
  `POWER_ID` varchar(40) DEFAULT NULL COMMENT '权限ID ',
  `TARGETTYPE` varchar(2) DEFAULT NULL COMMENT '目标类型 ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限菜单表';

/*Data for the table `SYS_ROLE_POWER` */

/*Table structure for table `SYS_TELLER_SUM` */

CREATE TABLE `SYS_TELLER_SUM` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `BRANCH` varchar(50) DEFAULT NULL COMMENT '分行/中心支行',
  `NETPOINT` varchar(50) DEFAULT NULL COMMENT '营运经理人数',
  `SUM1` varchar(10) DEFAULT NULL COMMENT '营运经理人数',
  `SUM2` varchar(10) DEFAULT NULL COMMENT '结算员人数',
  `SUM3` varchar(10) DEFAULT NULL COMMENT '临柜员人数',
  `TIME` varchar(14) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营条线人员统计表';

/*Data for the table `SYS_TELLER_SUM` */

/*Table structure for table `SYS_USERLOG_INFO` */

CREATE TABLE `SYS_USERLOG_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `USERNO` varchar(20) DEFAULT NULL COMMENT '用户编号',
  `POST` varchar(40) DEFAULT NULL COMMENT '新增或删除时的岗位',
  `CZDATE` varchar(20) DEFAULT NULL COMMENT '操作日期',
  `FLAG` varchar(1) DEFAULT NULL COMMENT '标志位',
  `ORGNO` varchar(40) DEFAULT NULL COMMENT '部门号',
  `LY` varchar(40) DEFAULT NULL COMMENT '来源',
  `YCSGW` varchar(40) DEFAULT NULL COMMENT '原从事岗位',
  `YBM` varchar(40) DEFAULT NULL COMMENT '原部门',
  `ROLE` varchar(40) DEFAULT NULL COMMENT '新增或删除时的角色',
  `SCYY` varchar(40) DEFAULT NULL COMMENT '删除原因',
  `ZRGW` varchar(40) DEFAULT NULL COMMENT '删除时记录转入岗位',
  `POSTLOG_ID` varchar(40) DEFAULT NULL COMMENT 'sys_postlog_info操作记录ID',
  `YYTXGZNX` varchar(40) DEFAULT NULL COMMENT '运营条线工作年限',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户岗位调整记录表';

/*Data for the table `SYS_USERLOG_INFO` */

/*Table structure for table `SYS_USERPOWER_INFO` */

CREATE TABLE `SYS_USERPOWER_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `MENU_ID` varchar(40) DEFAULT NULL COMMENT '菜单id',
  `OBJCODE` varchar(20) DEFAULT NULL COMMENT '操作',
  `OBJNAME` varchar(20) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户操作权限表';

/*Data for the table `SYS_USERPOWER_INFO` */

/*Table structure for table `SYS_USER_INFO` */

CREATE TABLE `SYS_USER_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '编号',
  `ORG_ID` varchar(100) DEFAULT NULL COMMENT '部门ID',
  `NAME` varchar(50) DEFAULT NULL COMMENT '姓名',
  `STAT` varchar(2) DEFAULT NULL COMMENT '状态',
  `BIRTHDAY` varchar(20) DEFAULT NULL COMMENT '生日',
  `GENDER` varchar(10) DEFAULT NULL COMMENT '性别',
  `PWD` varchar(50) DEFAULT NULL COMMENT '密码',
  `WORKTIME` varchar(30) DEFAULT NULL COMMENT '工作日期',
  `PHONE` varchar(20) DEFAULT NULL COMMENT '固定电话',
  `ADDR` varchar(100) DEFAULT NULL COMMENT '家庭地址',
  `NAMEPY` varchar(50) DEFAULT NULL COMMENT '名字拼音',
  `NATION` varchar(50) DEFAULT NULL COMMENT '民族',
  `IDCARD` varchar(30) DEFAULT NULL COMMENT '证件号',
  `WAGE` decimal(20,0) DEFAULT NULL COMMENT '年龄',
  `PHOTO` varchar(100) DEFAULT NULL COMMENT '头像',
  `REMARK` varchar(255) DEFAULT NULL COMMENT '备注',
  `RESUME` varchar(500) DEFAULT NULL COMMENT '个人说明',
  `ROLE_ID` varchar(500) DEFAULT NULL COMMENT '角色',
  `DELE_FLAG` varchar(2) DEFAULT NULL COMMENT '用户被删除标志 1:删除 0：未删除',
  `EMAIL` varchar(60) DEFAULT NULL COMMENT '邮箱',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '手机',
  `CUR_POST` varchar(40) DEFAULT NULL COMMENT '主岗位',
  `STUDY_LEVEL` varchar(30) DEFAULT NULL COMMENT '最高学历',
  `SCHOOL_NAME` varchar(50) DEFAULT NULL COMMENT '毕业院校',
  `ORIGO` varchar(50) DEFAULT NULL COMMENT '籍贯',
  `MARITAL_STAT` varchar(20) DEFAULT NULL COMMENT '婚姻状况',
  `IS_TELLER` varchar(10) DEFAULT NULL COMMENT '是否柜员',
  `PODATE` varchar(20) DEFAULT NULL COMMENT '岗位开始日期',
  `FLAG` varchar(1) DEFAULT NULL COMMENT '标志位',
  `POLITICAL` varchar(20) DEFAULT NULL COMMENT '政治面貌',
  `HEIGHT` varchar(5) DEFAULT NULL COMMENT '身高',
  `EMERGENTLINKER` varchar(30) DEFAULT NULL COMMENT '紧急联系人',
  `EMERGENTPHONE` varchar(30) DEFAULT NULL COMMENT '紧急联系人电话',
  `SKILL` varchar(200) DEFAULT NULL COMMENT '技能及特长',
  `HEALTH` varchar(10) DEFAULT NULL COMMENT '健康状况',
  `POSTCODE` varchar(15) DEFAULT NULL COMMENT '邮编',
  `BIRTHADDRESS` varchar(200) DEFAULT NULL COMMENT '出生地',
  `RESIDENADDRESS` varchar(200) DEFAULT NULL COMMENT '户口所在地',
  `JRWORKTIME` varchar(10) DEFAULT NULL COMMENT '金融行业从业年限',
  `NJRWORKTIME` varchar(10) DEFAULT NULL COMMENT '非金融行业从业年限',
  `TELLERGRADE` varchar(50) DEFAULT NULL COMMENT '已取得柜员等级',
  `POSTTIME` varchar(20) DEFAULT NULL COMMENT '进入该网点时间',
  `POSTID` varchar(50) DEFAULT NULL COMMENT '进入该网点最早岗位',
  `CANTELLERGRADE` varchar(50) DEFAULT NULL COMMENT '聘任柜员等级',
  `POSTTURN_FLAG` varchar(10) DEFAULT NULL COMMENT '是否轮岗',
  `NOPOSTTURN` varchar(50) DEFAULT NULL COMMENT '未轮岗的原因',
  `ROLEKJ_ID` varchar(40) DEFAULT NULL COMMENT '会计组别',
  `YHGW` varchar(300) DEFAULT NULL COMMENT '要害岗位',
  `DELTIME` varchar(40) DEFAULT NULL COMMENT '离职或者转岗时间',
  `BLGTS` varchar(50) DEFAULT NULL COMMENT '不轮岗天数',
  `BLGSTIME` varchar(50) DEFAULT NULL COMMENT '不轮岗开始时间',
  `MMGQTIME` varchar(50) DEFAULT NULL COMMENT '密码过期时间',
  `INBANKTIME` varchar(50) DEFAULT NULL COMMENT '进入银行的时间',
  `HXUSERNO` varchar(20) DEFAULT NULL COMMENT '核心工号',
  `ZWDL` varchar(5) DEFAULT NULL COMMENT '是否需要指纹登录',
  `ZWJJ` varchar(5) DEFAULT NULL COMMENT '是否需要指纹交接',
  `ZWTXDK` varchar(5) DEFAULT NULL COMMENT '指纹通信端口',
  `LZZT` varchar(5) DEFAULT NULL COMMENT '离职状态',
  `ROLEFH_ID` varchar(40) DEFAULT NULL COMMENT '分行营管部组别ID',
  `PROFESSIONAL` varchar(50) DEFAULT NULL COMMENT '专业',
  `HOBBY` varchar(1000) DEFAULT NULL COMMENT '爱好',
  `OANAME` varchar(20) DEFAULT NULL COMMENT 'OA登录名',
  `OTHER_POST` varchar(1000) DEFAULT NULL COMMENT '兼任岗位',
  `HOLDERINFO` varchar(300) DEFAULT NULL COMMENT '持证信息',
  `HNQUALIFY` varchar(300) DEFAULT NULL COMMENT '行内任职资格 ''1'':持有；''0''：不持有',
  `JJEMAIL` varchar(30) DEFAULT NULL COMMENT '紧急联系人Email',
  `FIRSTDEGREE` varchar(30) DEFAULT NULL COMMENT '第一学历',
  `YGLY` varchar(20) DEFAULT NULL COMMENT '员工来源',
  `ZRGW` varchar(50) DEFAULT NULL COMMENT '原从事岗位(转入岗位)',
  `ZRJG` varchar(20) DEFAULT NULL COMMENT '原从事机构(转入机构)',
  `ZCGW` varchar(20) DEFAULT NULL COMMENT '转出岗位',
  `JOB_CATEGORY` varchar(20) DEFAULT NULL COMMENT '新加项用工性质  字典表配置：2003',
  `ZC` varchar(200) DEFAULT NULL COMMENT '职称',
  `ORDER_CATEGORY` varchar(20) DEFAULT NULL COMMENT '序列类别',
  `ORDER_LEVEL` varchar(20) DEFAULT NULL COMMENT '序列等级',
  `YYTXGZNX` varchar(30) DEFAULT NULL COMMENT '进入运营条线工作时间',
  `IS_RESERVE` varchar(20) DEFAULT NULL COMMENT '是否是后备',
  `HAVE_BANK_CARD` varchar(500) DEFAULT NULL COMMENT '行内持证信息',
  `HAVE_SOCIETY_CARD` varchar(500) DEFAULT NULL COMMENT '社会证书信息',
  `ISQUALIFIED` varchar(20) DEFAULT NULL COMMENT '技能是否达标',
  `INPUT_CHINESE` varchar(20) DEFAULT NULL COMMENT '汉字录入',
  `KEYPAD` varchar(20) DEFAULT NULL COMMENT '数字小键盘',
  `MANUAL_COUNTING` varchar(20) DEFAULT NULL COMMENT '手工点钞',
  `MACHINE_COUNTING` varchar(20) DEFAULT NULL COMMENT '机器点钞',
  `ISYYTX` varchar(20) DEFAULT NULL COMMENT '进入条线类别',
  `TELLER_ID` varchar(20) DEFAULT NULL COMMENT '网点柜员组',
  `ATT_PID` varchar(100) DEFAULT NULL COMMENT '文件上传pid',
  `ORG_TWO` varchar(100) DEFAULT NULL COMMENT '兼管机构',
  `IDTYPE` char(1) DEFAULT NULL COMMENT '证件类型',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `SYS_USER_INFO` */

/*Table structure for table `SYS_USER_ROLE_INFO` */

CREATE TABLE `SYS_USER_ROLE_INFO` (
  `USER_NO` varchar(40) NOT NULL COMMENT '用户编号',
  `ROLE_NO` varchar(40) DEFAULT NULL COMMENT '角色编号',
  `UPDATE_TIME` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) COMMENT '更新时间',
  PRIMARY KEY (`USER_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

/*Data for the table `SYS_USER_ROLE_INFO` */

/*Table structure for table `YYGL_AFFAIRS_APPLY_BAK` */

CREATE TABLE `YYGL_AFFAIRS_APPLY_BAK` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `AFFAIRS_ID` varchar(40) DEFAULT NULL COMMENT '事务类别号',
  `USER_NO` varchar(40) DEFAULT NULL COMMENT '申请人用户号',
  `USER_NAME` varchar(40) DEFAULT NULL COMMENT '申请人姓名',
  `USER_MOBILE` varchar(20) DEFAULT NULL COMMENT '申请人电话',
  `ORG_ID` varchar(40) DEFAULT NULL COMMENT '申请人机构号',
  `ORG_NAME` varchar(40) DEFAULT NULL COMMENT '申请人机构名',
  `NEXT_APPROVER` varchar(40) DEFAULT NULL COMMENT '下一个审批人',
  `FZK_RECEIVER` varchar(40) DEFAULT NULL COMMENT '非重空申请，收货人',
  `FZK_PHONE` varchar(40) DEFAULT NULL COMMENT '非重空申请，收件人电话',
  `FZK_ADDRESS` varchar(500) DEFAULT NULL COMMENT '非重空申请，收货地址',
  `FZK_COMPANY` varchar(40) DEFAULT NULL COMMENT '非重空申请，生产厂家',
  `FZK_TOTAL` varchar(40) DEFAULT NULL COMMENT '非重空申请，合计金额',
  `MARK` varchar(10) DEFAULT NULL COMMENT '标识',
  `STATUS` varchar(10) DEFAULT NULL COMMENT '状态',
  `APPLY_TIME` varchar(40) DEFAULT NULL COMMENT '申请时间',
  `DEMAND_NAME` varchar(40) DEFAULT NULL COMMENT '业务需求申请',
  `EMERGENCY` varchar(10) DEFAULT NULL COMMENT '申请紧急程度',
  `DEMAND_USER` varchar(40) DEFAULT NULL COMMENT '业务需求申请，需求提出人',
  `DEMAND_DESCRIBE` varchar(500) DEFAULT NULL COMMENT '业务需求申请，需求描述',
  `DATA_NAME` varchar(200) DEFAULT NULL COMMENT '数据提取申请，名称',
  `DATA_USE` varchar(200) DEFAULT NULL COMMENT '数据提取申请，数据采集用途',
  `DATA_INSIDER` varchar(200) DEFAULT NULL COMMENT '数据提取申请，知情人范围',
  `DATA_BUSINESS` varchar(200) DEFAULT NULL COMMENT '数据提取申请，涉及业务范围',
  `DATA_RANGE` varchar(200) DEFAULT NULL COMMENT '数据提取申请，数据范围',
  `DATA_TIME_RANGE` varchar(200) DEFAULT NULL COMMENT '数据提取申请，提取数据时间范围',
  `DATA_APPLY_RANGE` varchar(200) DEFAULT NULL COMMENT '数据提取申请，数据使用范围',
  `DATA_RULE` varchar(200) DEFAULT NULL COMMENT '数据提取申请，数据提取规则',
  `SEAL_ITEM` varchar(40) DEFAULT NULL COMMENT '新增/更新印章申请，申请项目 ',
  `SEAL_REASON` varchar(500) DEFAULT NULL COMMENT ' 新增/更新印章申请，申请事由',
  `AFFAIRS_NAME` varchar(40) DEFAULT NULL COMMENT '事务类别名',
  `SEQUENCE` varchar(40) DEFAULT NULL COMMENT '影像平台sequence',
  `NEXT_ROLE_ID` varchar(500) DEFAULT NULL COMMENT '下一审批角色ID，（对应流程子表多个角色）',
  `ROLEID_NEXTROLEID` varchar(200) DEFAULT NULL COMMENT ' 申请人角色ID+下一审批角色ID',
  `SEAL_ORG` varchar(200) DEFAULT NULL COMMENT '新增/更新印章申请，所属机构 ',
  `FILE_TYPE` varchar(10) DEFAULT NULL COMMENT '档案调阅申请，调阅类型',
  `FILE_NAME` varchar(40) DEFAULT NULL COMMENT '档案调阅申请，档案名称',
  `FILE_NUMBER` varchar(40) DEFAULT NULL COMMENT '档案调阅申请，数量',
  `FILE_ORG` varchar(200) DEFAULT NULL COMMENT '档案调阅申请，调阅机构',
  `FILE_APPLICANT` varchar(40) DEFAULT NULL COMMENT '档案调阅申请，调阅人',
  `FILE_TIME` varchar(40) DEFAULT NULL COMMENT '档案调阅申请，调阅时间',
  `FILE_REASON` varchar(500) DEFAULT NULL COMMENT '档案调阅申请，调阅事由',
  `FILE_MANAGER` varchar(40) DEFAULT NULL COMMENT '档案调阅申请，档案管理员',
  `NEXT_PHONE` varchar(40) DEFAULT NULL COMMENT '下一审批人电话',
  `GENERAL_REASON` varchar(500) DEFAULT NULL COMMENT '通用事务申请，申请事由',
  `IS_BREAK` varchar(10) DEFAULT NULL COMMENT '是否中途结束的流程',
  `NEXTFLAG` varchar(10) DEFAULT NULL COMMENT '下一个审批角色是否为总行会计结算部',
  `IS_REMAND` varchar(10) DEFAULT NULL COMMENT '档案调阅申请，是否归还',
  `REMAND_TIME` varchar(40) DEFAULT NULL COMMENT '档案调阅申请，归还时间',
  `REMAND_REMARK` varchar(500) DEFAULT NULL COMMENT '档案调阅申请，归还备注',
  `AFFAIRS_ROLE_ID` varchar(40) DEFAULT NULL COMMENT '用户申请事务时选择的角色ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='事务申请记录表';

/*Data for the table `YYGL_AFFAIRS_APPLY_BAK` */

/*Table structure for table `YYGL_AFFAIRS_APPLY_CHILD_BAK` */

CREATE TABLE `YYGL_AFFAIRS_APPLY_CHILD_BAK` (
  `ID` varchar(40) DEFAULT NULL COMMENT 'ID ',
  `SEAL_TYPE` varchar(40) DEFAULT NULL COMMENT '新增/更新印章申请，印章种类编号',
  `SEAL_TYPE_NAME` varchar(40) DEFAULT NULL COMMENT '新增/更新印章申请，印章种类名',
  `SEAL_NO` varchar(40) DEFAULT NULL COMMENT '新增/更新印章申请，印章编号',
  `SEAL_NAME` varchar(40) DEFAULT NULL COMMENT '新增/更新印章申请，印章名称',
  `FZK_VOUCHER` varchar(40) DEFAULT NULL COMMENT '非重空申请，凭证 ',
  `FZK_UNIT` varchar(40) DEFAULT NULL COMMENT '非重空申请，单位 ',
  `FZK_PRICE` varchar(40) DEFAULT NULL COMMENT '非重空申请，单价 ',
  `FZK_NUMBER` varchar(40) DEFAULT NULL COMMENT '非重空申请，数量 ',
  `FZK_AMOUNT` varchar(40) DEFAULT NULL COMMENT '非重空申请，金额 ',
  `SEAL_STATE` varchar(20) DEFAULT NULL COMMENT '新增/更新印章申请，入库状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='事务申请记录表子信息表';

/*Data for the table `YYGL_AFFAIRS_APPLY_CHILD_BAK` */

/*Table structure for table `YYGL_AFFAIRS_COMMON` */

CREATE TABLE `YYGL_AFFAIRS_COMMON` (
  `ID` varchar(40) DEFAULT NULL COMMENT 'ID',
  `CURRENT_OPERATOR` varchar(40) DEFAULT NULL COMMENT '当前操作角色',
  `CURRENT_OPERATOR_NAME` varchar(80) DEFAULT NULL COMMENT '当前操作角色名称',
  `NEXT_OPERATOR_GROUP` varchar(400) DEFAULT NULL COMMENT '下级审批角色',
  `NEXT_OPERATOR_GROUP_NAME` varchar(400) DEFAULT NULL COMMENT '下级审批角色名称',
  `NEED_PRINT` char(1) DEFAULT NULL COMMENT '是否打印审批意见'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通用事务审批流程维护表';

/*Data for the table `YYGL_AFFAIRS_COMMON` */

/*Table structure for table `YYGL_AFFAIRS_EXA_RECORD` */

CREATE TABLE `YYGL_AFFAIRS_EXA_RECORD` (
  `ID` varchar(40) DEFAULT NULL COMMENT 'ID',
  `AFFAIRS_APPLY_ID` varchar(40) DEFAULT NULL COMMENT '事务申请表ID',
  `EXA_USER` varchar(20) DEFAULT NULL COMMENT '审批人',
  `EXA_TIME` varchar(14) DEFAULT NULL COMMENT '审批时间',
  `EXA_RESULT` decimal(10,0) DEFAULT NULL COMMENT '审批结果',
  `EXA_EXPLAIN` varchar(400) DEFAULT NULL COMMENT '审批说明',
  `EXA_ROLENAME` varchar(40) DEFAULT NULL COMMENT '审批人审批时使用的角色'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='事务审批记录表';

/*Data for the table `YYGL_AFFAIRS_EXA_RECORD` */

/*Table structure for table `YYGL_AFFAIRS_SORTJOB_VIN` */

CREATE TABLE `YYGL_AFFAIRS_SORTJOB_VIN` (
  `ID` varchar(40) DEFAULT NULL COMMENT 'ID',
  `AFFAIRS_NAME` varchar(40) DEFAULT NULL COMMENT '事务名',
  `START_ROLE_ID` varchar(500) DEFAULT NULL COMMENT '开始节点',
  `ROLE_ONE_ID` varchar(500) DEFAULT NULL COMMENT '一级审批节点',
  `ROLE_TWO_ID` varchar(500) DEFAULT NULL COMMENT '二级审批节点',
  `ROLE_THREE_ID` varchar(500) DEFAULT NULL COMMENT '三级审批节点',
  `ROLE_FOUR_ID` varchar(500) DEFAULT NULL COMMENT '四级审批节点',
  `ROLE_FIVE_ID` varchar(500) DEFAULT NULL COMMENT '五级审批节点',
  `END_ROLE_ID` varchar(500) DEFAULT NULL COMMENT '终审节点',
  `FLAG` varchar(2) DEFAULT NULL COMMENT '状态',
  `ROLE_SIX_ID` varchar(500) DEFAULT NULL COMMENT '六级审批节点',
  `ROLE_SEVEN_ID` varchar(500) DEFAULT NULL COMMENT '七级审批节点',
  `IS_PRINT1` char(1) DEFAULT NULL COMMENT '一级节点是否打印',
  `IS_PRINT2` char(1) DEFAULT NULL COMMENT '二级节点是否打印',
  `IS_PRINT3` char(1) DEFAULT NULL COMMENT '三级节点是否打印',
  `IS_PRINT4` char(1) DEFAULT NULL COMMENT '四级节点是否打印',
  `IS_PRINT5` char(1) DEFAULT NULL COMMENT '五级节点是否打印',
  `IS_PRINT6` char(1) DEFAULT NULL COMMENT '六级节点是否打印',
  `IS_PRINT7` char(1) DEFAULT NULL COMMENT '七级节点是否打印',
  `IS_PRINT8` char(1) DEFAULT NULL COMMENT '终审节点是否打印'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专用事务审批流程维护表';

/*Data for the table `YYGL_AFFAIRS_SORTJOB_VIN` */

/*Table structure for table `YYGL_AFFAIRS_VOUCHER` */

CREATE TABLE `YYGL_AFFAIRS_VOUCHER` (
  `ID` varchar(40) DEFAULT NULL COMMENT 'ID ',
  `NAME` varchar(100) DEFAULT NULL COMMENT '凭证名称 ',
  `UNIT` varchar(40) DEFAULT NULL COMMENT '单位 ',
  `PRICE` varchar(40) DEFAULT NULL COMMENT '单价 ',
  `COMPANY_NAME` varchar(100) DEFAULT NULL COMMENT '生产厂家 ',
  `COMPANY_NO` varchar(40) DEFAULT NULL COMMENT '生产厂家ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='非重空凭证表';

/*Data for the table `YYGL_AFFAIRS_VOUCHER` */

/*Table structure for table `YYGL_DJBATTOUNTANTANTRECORDCLASS_INFO` */

CREATE TABLE `YYGL_DJBATTOUNTANTANTRECORDCLASS_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `RECTYPE` varchar(60) DEFAULT NULL COMMENT '档案类型',
  `TYPNUMBER` varchar(60) DEFAULT NULL COMMENT '类型编号',
  `RECNAME` varchar(100) DEFAULT NULL COMMENT '档案名称',
  `NUMBER` varchar(60) DEFAULT NULL COMMENT '编号',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1 ',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2 ',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3 ',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会计档案类别信息维护';

/*Data for the table `YYGL_DJBATTOUNTANTANTRECORDCLASS_INFO` */

/*Table structure for table `YYGL_DJBATTOUNTANTANTRECORDKEEP_INFO` */

CREATE TABLE `YYGL_DJBATTOUNTANTANTRECORDKEEP_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `RECTYPE` varchar(60) DEFAULT NULL COMMENT '档案类型',
  `NAME` varchar(100) DEFAULT NULL COMMENT '名称',
  `NUMBER` varchar(200) DEFAULT NULL COMMENT '编号',
  `COUNT` varchar(16) DEFAULT NULL COMMENT '册数',
  `RESSTART` varchar(20) DEFAULT NULL COMMENT '档案所属期间起',
  `RESSTOP` varchar(20) DEFAULT NULL COMMENT '档案所属期间止',
  `LOCBOXNUMBER` varchar(200) DEFAULT NULL COMMENT '保管地点及箱号',
  `DECDATE` varchar(20) DEFAULT NULL COMMENT '销毁日期',
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1 ',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2 ',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3 ',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会计档案保管登记簿';

/*Data for the table `YYGL_DJBATTOUNTANTANTRECORDKEEP_INFO` */

/*Table structure for table `YYGL_DJBATTRIBUTEMACHINE_INFO` */

CREATE TABLE `YYGL_DJBATTRIBUTEMACHINE_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `MACTYPE` varchar(60) DEFAULT NULL COMMENT '机具类型',
  `BRADTYPE` varchar(60) DEFAULT NULL COMMENT '品牌型号',
  `NUMBER` varchar(200) DEFAULT NULL COMMENT '机具编号',
  `INSDATE` varchar(20) DEFAULT NULL COMMENT '安装启用时间',
  `LEAFACDATE` varchar(20) DEFAULT NULL COMMENT '出厂日期',
  `BUYPRICE` varchar(24) DEFAULT NULL COMMENT '机具购入价格',
  `MACKEEPER` varchar(40) DEFAULT NULL COMMENT '机具保管人',
  `INACCPRICE` varchar(24) DEFAULT NULL COMMENT '入账价格',
  `MACLABEL` varchar(200) DEFAULT NULL COMMENT '机具资产标签',
  `INACCDATE` varchar(20) DEFAULT NULL COMMENT '入账时间',
  `RETDATE` varchar(20) DEFAULT NULL COMMENT '报废日期',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运营管理部归口机具台账';

/*Data for the table `YYGL_DJBATTRIBUTEMACHINE_INFO` */

/*Table structure for table `YYGL_DJBBTELLERAUTHORITY_INFO` */

CREATE TABLE `YYGL_DJBBTELLERAUTHORITY_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `SYSNAME` varchar(200) DEFAULT NULL COMMENT '系统名称',
  `BANTELNAME` varchar(40) DEFAULT NULL COMMENT '柜员姓名',
  `USERNAME` varchar(80) DEFAULT NULL COMMENT '用户名',
  `ROLENAME` varchar(200) DEFAULT NULL COMMENT '级别/权限角色 ',
  `STARTDATE` varchar(20) DEFAULT NULL COMMENT '启用日期',
  `STAMAINAME` varchar(40) DEFAULT NULL COMMENT '启用维护人员',
  `STOPDATE` varchar(20) DEFAULT NULL COMMENT '停用日期',
  `STOMAINAME` varchar(40) DEFAULT NULL COMMENT '停用维护人员',
  `STOPREASON` varchar(2000) DEFAULT NULL COMMENT '停用原因',
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1 ',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2 ',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3 ',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='柜员权限登记簿';

/*Data for the table `YYGL_DJBBTELLERAUTHORITY_INFO` */

/*Table structure for table `YYGL_DJBCURRENCY_INFO` */

CREATE TABLE `YYGL_DJBCURRENCY_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `MONClASS` varchar(60) DEFAULT NULL COMMENT '劵别',
  `VERClASS` varchar(80) DEFAULT NULL COMMENT '版别',
  `COUNT` varchar(16) DEFAULT NULL COMMENT '张数',
  `MONEY` varchar(24) DEFAULT NULL COMMENT '金额',
  `ABSTRACT` varchar(2000) DEFAULT NULL COMMENT '摘要',
  `FINPASS` varchar(2000) DEFAULT NULL COMMENT '发现经过',
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1 ',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2 ',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3 ',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='反宣币登记簿';

/*Data for the table `YYGL_DJBCURRENCY_INFO` */

/*Table structure for table `YYGL_DJBERROE_INFO` */

CREATE TABLE `YYGL_DJBERROE_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `ERRCLASS` varchar(60) DEFAULT NULL COMMENT '差错类别',
  `ERRDATE` varchar(20) DEFAULT NULL COMMENT '错账日期',
  `ERRCONDITION` varchar(2000) DEFAULT NULL COMMENT '差错情况',
  `ERRMONEY` varchar(24) DEFAULT NULL COMMENT '差错金额',
  `RESPERSON` varchar(200) DEFAULT NULL COMMENT '责任人',
  `CHIEF` varchar(40) DEFAULT NULL COMMENT '主管',
  `DEACONDITION` varchar(2000) DEFAULT NULL COMMENT '处理情况',
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1 ',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2 ',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3 ',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='差错登记簿';

/*Data for the table `YYGL_DJBERROE_INFO` */

/*Table structure for table `YYGL_DJBHANDWORKQUERY_INFO` */

CREATE TABLE `YYGL_DJBHANDWORKQUERY_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `VARIETY` varchar(60) DEFAULT NULL COMMENT '凭证种类',
  `CODE` varchar(200) DEFAULT NULL COMMENT '凭证号码',
  `QUEDATE` varchar(20) DEFAULT NULL COMMENT '查询日期',
  `SENDRECEIVE` varchar(100) DEFAULT NULL COMMENT '发出/收到 ',
  `BANNUMNAME` varchar(200) DEFAULT NULL COMMENT '对方行号或行名',
  `QUECONTENT` varchar(2000) DEFAULT NULL COMMENT '查询内容',
  `MONEY` varchar(24) DEFAULT NULL COMMENT '金额',
  `QUECONDITION` varchar(2000) DEFAULT NULL COMMENT '查复情况',
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1 ',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2 ',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3 ',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='手工查询复查登记簿';

/*Data for the table `YYGL_DJBHANDWORKQUERY_INFO` */

/*Table structure for table `YYGL_DJBHWORKEMPTYPROOF_INFO` */

CREATE TABLE `YYGL_DJBHWORKEMPTYPROOF_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `CLASS` varchar(60) DEFAULT NULL COMMENT '手工凭证登记种类',
  `CHADATE` varchar(20) DEFAULT NULL COMMENT '变动日期',
  `ABSTRACT` varchar(200) DEFAULT NULL COMMENT '摘要',
  `STASTONUMBER` varchar(200) DEFAULT NULL COMMENT '起止号码',
  `ADDCOUNT` varchar(16) DEFAULT NULL COMMENT '增加数量',
  `REDCOUNT` varchar(16) DEFAULT NULL COMMENT '减少数量',
  `BALCOUNT` varchar(16) DEFAULT NULL COMMENT '结存数量',
  `USEUNIT` varchar(200) DEFAULT NULL COMMENT '领用单位',
  `USERPERSON` varchar(40) DEFAULT NULL COMMENT '领用人',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1 ',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2 ',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3 ',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='手工空白凭证保管领用登记簿';

/*Data for the table `YYGL_DJBHWORKEMPTYPROOF_INFO` */

/*Table structure for table `YYGL_DJBMATERIALSASSOCIATE_INFO` */

CREATE TABLE `YYGL_DJBMATERIALSASSOCIATE_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `ASSOCIATEDATE` varchar(20) DEFAULT NULL COMMENT '交接日期（时间）',
  `ASSOCIATECONTENT` varchar(2000) DEFAULT NULL COMMENT '交接内容（物品）',
  `COUNT` varchar(80) DEFAULT NULL COMMENT '数量',
  `GIVER` varchar(200) DEFAULT NULL COMMENT '交出人',
  `RECEIVER` varchar(40) DEFAULT NULL COMMENT '接收人（工号）',
  `RECCODE` varchar(40) DEFAULT NULL COMMENT '接收人工号密码',
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品资料交接登记簿';

/*Data for the table `YYGL_DJBMATERIALSASSOCIATE_INFO` */

/*Table structure for table `YYGL_DJBPREDRAWMONEY_INFO` */

CREATE TABLE `YYGL_DJBPREDRAWMONEY_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `CONDATE` varchar(20) DEFAULT NULL COMMENT '预约取款日期',
  `COUNAME` varchar(40) DEFAULT NULL COMMENT '户名',
  `MONEY` varchar(24) DEFAULT NULL COMMENT '预约金额',
  `TELEPHONE` varchar(40) DEFAULT NULL COMMENT '联系电话',
  `RECEIVER` varchar(40) DEFAULT NULL COMMENT '受理人',
  `ACUDATE` varchar(20) DEFAULT NULL COMMENT '实际取款日期',
  `ACUMONEY` varchar(24) DEFAULT NULL COMMENT '实际取款金额',
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1 ',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2 ',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3 ',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='取款预约登记簿';

/*Data for the table `YYGL_DJBPREDRAWMONEY_INFO` */

/*Table structure for table `YYGL_DJBSALESDEPARTMENT_INFO` */

CREATE TABLE `YYGL_DJBSALESDEPARTMENT_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `IMPRECORD` varchar(2000) DEFAULT NULL COMMENT '要事记录',
  `TRALOCATION` varchar(200) DEFAULT NULL COMMENT '培训地点',
  `TRACONTENT` varchar(2000) DEFAULT NULL COMMENT '培训内容',
  `PARTICIPANT` varchar(400) DEFAULT NULL COMMENT '参加人员',
  `ATTACHMENT` varchar(400) DEFAULT NULL COMMENT '附件',
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='营业部工作登记簿';

/*Data for the table `YYGL_DJBSALESDEPARTMENT_INFO` */

/*Table structure for table `YYGL_DJBSERVICEMACHINE_INFO` */

CREATE TABLE `YYGL_DJBSERVICEMACHINE_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `MACTYPE` varchar(60) DEFAULT NULL COMMENT '机具类型',
  `TYPNUMBER` varchar(60) DEFAULT NULL COMMENT '类型编号',
  `BRADTYPE` varchar(80) DEFAULT NULL COMMENT '品牌型号',
  `NUMBER` varchar(60) DEFAULT NULL COMMENT '编号',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='营运机具信息维护登记簿';

/*Data for the table `YYGL_DJBSERVICEMACHINE_INFO` */

/*Table structure for table `YYGL_DJBSTAINEDRMB_INFO` */

CREATE TABLE `YYGL_DJBSTAINEDRMB_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `REGPERSON` varchar(40) DEFAULT NULL COMMENT '登记人',
  `REGDATE` varchar(20) DEFAULT NULL COMMENT '登记日期',
  `EXCPERSON` varchar(40) DEFAULT NULL COMMENT '兑换人姓名',
  `EXCDATE` varchar(20) DEFAULT NULL COMMENT '兑换日期',
  `STAREASON` varchar(200) DEFAULT NULL COMMENT '残缺污损原因',
  `ISPERID` varchar(6) DEFAULT NULL COMMENT '是否持有本人证件',
  `APPMONCLASS` varchar(60) DEFAULT NULL COMMENT '申请兑换劵别',
  `APPCOUNT` varchar(16) DEFAULT NULL COMMENT '申请兑换张数',
  `APPMONEY` varchar(24) DEFAULT NULL COMMENT '申请兑换金额',
  `ACUAPPCOUNT` varchar(16) DEFAULT NULL COMMENT '实际兑换张数',
  `ACUAPPMONEY` varchar(24) DEFAULT NULL COMMENT '实际兑换金额',
  `HANDLER` varchar(40) DEFAULT NULL COMMENT '经办人',
  `RECHECKER` varchar(40) DEFAULT NULL COMMENT '复核人',
  `EXECUTIVE` varchar(40) DEFAULT NULL COMMENT '业务主管',
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `BACKUP1` varchar(200) DEFAULT NULL COMMENT '备用1 ',
  `BACKUP2` varchar(200) DEFAULT NULL COMMENT '备用2 ',
  `BACKUP3` varchar(200) DEFAULT NULL COMMENT '备用3 ',
  `DELFLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '登记人用户编号',
  `ORG_ID` varchar(20) DEFAULT NULL COMMENT '登记人所属机构编号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='残缺、污损人民币兑换登记簿';

/*Data for the table `YYGL_DJBSTAINEDRMB_INFO` */

/*Table structure for table `YYGL_EDUCATION_INFO` */

CREATE TABLE `YYGL_EDUCATION_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '员工号',
  `SCHOOL_NAME` varchar(50) DEFAULT NULL COMMENT '学校名称',
  `MAJOR` varchar(50) DEFAULT NULL COMMENT '专业',
  `START_DATE` varchar(14) DEFAULT NULL COMMENT '开始日期',
  `END_DATE` varchar(14) DEFAULT NULL COMMENT '结束日期',
  `STUDY_TYPE` varchar(30) DEFAULT NULL COMMENT '高等教育文凭种类',
  `STUDY_LEVEL` varchar(30) DEFAULT NULL COMMENT '学历',
  `STUDY_NO` varchar(30) DEFAULT NULL COMMENT '学历证书号',
  `DEGREE_NAME` varchar(40) DEFAULT NULL COMMENT '学位',
  `DEGREE_NO` varchar(50) DEFAULT NULL COMMENT '学位证书号',
  `DELE_FLAG` varchar(2) DEFAULT NULL COMMENT '删除标志',
  `XXXS` varchar(40) DEFAULT NULL COMMENT '学习形式 ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教育信息表';

/*Data for the table `YYGL_EDUCATION_INFO` */

/*Table structure for table `YYGL_EXAM_INFO` */

CREATE TABLE `YYGL_EXAM_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID ',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '员工号 ',
  `EXAM_NAME` varchar(50) DEFAULT NULL COMMENT '考试名称 ',
  `START_DATE` varchar(14) DEFAULT NULL COMMENT '开始日期 ',
  `SCORE` varchar(20) DEFAULT NULL COMMENT '分数 ',
  `HOLD_UNIT` varchar(50) DEFAULT NULL COMMENT '举办单位 ',
  `ACHIEVE_CERT` varchar(50) DEFAULT NULL COMMENT '获得证书 ',
  `DELE_FLAG` varchar(2) DEFAULT NULL COMMENT '删除标志 ',
  `CERT_EFFDATE` varchar(50) DEFAULT NULL COMMENT '证书有效期 ',
  `SFTG` varchar(2) DEFAULT NULL COMMENT '考试是否通过 ',
  `CERTIFICATE_NO` varchar(60) DEFAULT NULL COMMENT '证书编号 ',
  `CATEGORY` varchar(20) DEFAULT NULL COMMENT '证书类型 ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考试表';

/*Data for the table `YYGL_EXAM_INFO` */

/*Table structure for table `YYGL_GOODSLOG_INFO` */

CREATE TABLE `YYGL_GOODSLOG_INFO` (
  `ID` varchar(100) NOT NULL COMMENT 'ID',
  `TYPE` varchar(50) DEFAULT NULL COMMENT '物品类别',
  `NAME` varchar(100) DEFAULT NULL COMMENT '物品名称',
  `SCTIME` varchar(40) DEFAULT NULL COMMENT '生成时间',
  `SCSM` varchar(400) DEFAULT NULL COMMENT '生成说明',
  `YJRGH` varchar(40) DEFAULT NULL COMMENT '移交人工号',
  `YJRXM` varchar(100) DEFAULT NULL COMMENT '移交人姓名',
  `YJRJGH` varchar(40) DEFAULT NULL COMMENT '移交人机构号',
  `YJRJGMC` varchar(100) DEFAULT NULL COMMENT '移交人机构',
  `YJRJS` varchar(100) DEFAULT NULL COMMENT '移交人角色',
  `YJRGW` varchar(100) DEFAULT NULL COMMENT '移交人岗位',
  `YJTIME` varchar(40) DEFAULT NULL COMMENT '移交时间',
  `YJSM` varchar(400) DEFAULT NULL COMMENT '移交说明',
  `JSRGH` varchar(40) DEFAULT NULL COMMENT '接收人工号',
  `JSRXM` varchar(40) DEFAULT NULL COMMENT '接收人姓名',
  `JSRJGH` varchar(40) DEFAULT NULL COMMENT '接收人机构号',
  `JSRJGMC` varchar(100) DEFAULT NULL COMMENT '接收人机构名称',
  `JSRJS` varchar(100) DEFAULT NULL COMMENT '接收人角色',
  `JSRGW` varchar(100) DEFAULT NULL COMMENT '接收人岗位',
  `JSTIME` varchar(40) DEFAULT NULL COMMENT '接收时间',
  `JJRGH` varchar(40) DEFAULT NULL COMMENT '监交人工号',
  `JJRXM` varchar(40) DEFAULT NULL COMMENT '监交人姓名',
  `JJRJGH` varchar(40) DEFAULT NULL COMMENT '监交人机构号',
  `JJRJGMC` varchar(100) DEFAULT NULL COMMENT '监交人机构名称',
  `JJRJS` varchar(100) DEFAULT NULL COMMENT '监交人角色',
  `JJRGW` varchar(100) DEFAULT NULL COMMENT '监交人岗位',
  `STAT` varchar(5) DEFAULT NULL COMMENT '状态',
  `GOODID` varchar(100) DEFAULT NULL COMMENT '物品ID',
  `WPBZ` varchar(1200) DEFAULT NULL COMMENT '物品备注',
  `CZDATE` varchar(40) DEFAULT NULL COMMENT '操作时间',
  `SECJS` varchar(40) DEFAULT NULL COMMENT '等待接收人',
  `SECYJ` varchar(40) DEFAULT NULL COMMENT '等待移交人',
  `FILELJ` varchar(400) DEFAULT NULL COMMENT '文件路径',
  `CZUSER` varchar(100) DEFAULT NULL COMMENT '操作人',
  `BBGGY` varchar(40) DEFAULT NULL COMMENT '备保管员',
  `BBGGYXM` varchar(100) DEFAULT NULL,
  `CZLX` varchar(5) DEFAULT NULL COMMENT '操作类型',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品操作记录表';

/*Data for the table `YYGL_GOODSLOG_INFO` */

/*Table structure for table `YYGL_JOB_TRANSFER` */

CREATE TABLE `YYGL_JOB_TRANSFER` (
  `ID` varchar(40) NOT NULL COMMENT 'ID ',
  `YJRGH` varchar(10) DEFAULT NULL COMMENT '柜员号 ',
  `YJRXM` varchar(20) DEFAULT NULL COMMENT '柜员姓名 ',
  `ORGID` varchar(10) DEFAULT NULL COMMENT '机构号 ',
  `ORGNAME` varchar(100) DEFAULT NULL COMMENT '机构名 ',
  `CZDATE` varchar(14) DEFAULT NULL COMMENT '移交时间 ',
  `REASON` varchar(1000) DEFAULT NULL COMMENT '移交原因 ',
  `JSRGH` varchar(10) DEFAULT NULL COMMENT '接收人工号 ',
  `JSRXM` varchar(20) DEFAULT NULL COMMENT '接收人姓名 ',
  `JJRGH` varchar(10) DEFAULT NULL COMMENT '兼交人工号 ',
  `JJRXM` varchar(20) DEFAULT NULL COMMENT '兼交人姓名 ',
  `STIME` varchar(14) DEFAULT NULL COMMENT '移交时间段 开始',
  `ETIME` varchar(14) DEFAULT NULL COMMENT '移交时间段 结束',
  `YJSX` varchar(1000) DEFAULT NULL COMMENT '交接事项 ',
  `HDBF` varchar(1000) DEFAULT NULL COMMENT '核对不符事项 ',
  `WLSX` varchar(1000) DEFAULT NULL COMMENT '未了会计事项 ',
  `OTHER` varchar(1000) DEFAULT NULL COMMENT '其他事项 ',
  `WP` varchar(1000) DEFAULT NULL COMMENT '物品ID 以逗号分隔',
  `WPNAME` varchar(1000) DEFAULT NULL COMMENT '物品名字 以逗号分隔',
  `STAT` varchar(2) DEFAULT NULL COMMENT '状态               ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工作移交表';

/*Data for the table `YYGL_JOB_TRANSFER` */

/*Table structure for table `YYGL_LOG_INFO` */

CREATE TABLE `YYGL_LOG_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '用户编号',
  `CREATE_TIME` varchar(14) DEFAULT NULL COMMENT '创建时间',
  `MENUNAME` varchar(40) DEFAULT NULL COMMENT '菜单名称',
  `TYPE` varchar(2) DEFAULT NULL COMMENT '类型',
  `REMARK` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日志表';

/*Data for the table `YYGL_LOG_INFO` */

/*Table structure for table `YYGL_MESSAGE_SENDER` */

CREATE TABLE `YYGL_MESSAGE_SENDER` (
  `ID` varchar(50) NOT NULL COMMENT 'ID',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `MESSAGE` varchar(500) DEFAULT NULL COMMENT '短信内容',
  `UPDATE_TIME` varchar(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='短信发送记录表';

/*Data for the table `YYGL_MESSAGE_SENDER` */

/*Table structure for table `YYGL_ORGCHANGELOG_INFO` */

CREATE TABLE `YYGL_ORGCHANGELOG_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `USERNO` varchar(40) DEFAULT NULL COMMENT '工号',
  `USERNAME` varchar(40) DEFAULT NULL COMMENT '姓名',
  `STARTORGNUM` varchar(40) DEFAULT NULL COMMENT '原机构',
  `ENDORGNUM` varchar(40) DEFAULT NULL COMMENT '现机构',
  `ROLEID` varchar(100) DEFAULT NULL COMMENT '调动后的角色',
  `CZDATE` varchar(14) DEFAULT NULL COMMENT '时间',
  `REASON` varchar(200) DEFAULT NULL COMMENT '理由',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人员机构变更历史表';

/*Data for the table `YYGL_ORGCHANGELOG_INFO` */

/*Table structure for table `YYGL_POST_PLAN` */

CREATE TABLE `YYGL_POST_PLAN` (
  `ID` varchar(100) NOT NULL COMMENT 'ID',
  `USERNO` varchar(100) DEFAULT NULL COMMENT '员工号',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '姓名',
  `STARTORGID` varchar(100) DEFAULT NULL COMMENT '机构号',
  `ORGDATE` varchar(100) DEFAULT NULL COMMENT '进入机构时间',
  `POSTDATE` varchar(100) DEFAULT NULL COMMENT '岗位开始时间',
  `STARTPOST` varchar(100) DEFAULT NULL COMMENT '变动前岗位',
  `ENDDATE` varchar(100) DEFAULT NULL COMMENT '轮岗时间',
  `ENDORGID` varchar(100) DEFAULT NULL COMMENT '轮岗后网点',
  `ENDPOST` varchar(100) DEFAULT NULL COMMENT '轮岗后岗位',
  `REMARK` varchar(2000) DEFAULT NULL COMMENT '备注',
  `FLAG` varchar(2) DEFAULT NULL COMMENT '标志位',
  `STAT` varchar(2) DEFAULT NULL COMMENT '审批',
  `YEARS` varchar(5) DEFAULT NULL COMMENT '年份',
  `SFLG` varchar(2) DEFAULT NULL COMMENT '轮岗类型',
  `ADDER` varchar(100) DEFAULT NULL COMMENT '添加人',
  `ADD_TIME` varchar(100) DEFAULT NULL COMMENT '添加时间',
  `ADD_EXPLAIN` varchar(2000) DEFAULT NULL COMMENT '添加原因',
  `PID` varchar(100) DEFAULT NULL COMMENT '用于审批字段',
  `UPID` varchar(100) DEFAULT NULL COMMENT 'UPID        ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='轮岗计划表';

/*Data for the table `YYGL_POST_PLAN` */

/*Table structure for table `YYGL_POST_TEMP` */

CREATE TABLE `YYGL_POST_TEMP` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `USERNO` varchar(40) DEFAULT NULL COMMENT '员工号',
  `USERNAME` varchar(40) DEFAULT NULL COMMENT '员工姓名',
  `STARTORGNUM` varchar(40) DEFAULT NULL COMMENT '原机构号',
  `ENDORGNUM` varchar(40) DEFAULT NULL COMMENT '现机构号',
  `STARTPOSTID` varchar(40) DEFAULT NULL COMMENT '原岗位id',
  `ENDPOSTID` varchar(40) DEFAULT NULL COMMENT '现岗位id',
  `STARTDATE` varchar(14) DEFAULT NULL COMMENT '现岗位开始时间',
  `ENDDATE` varchar(14) DEFAULT NULL COMMENT '现岗位结束时间',
  `FLAG` varchar(1) DEFAULT NULL COMMENT '1-过去 2-回来 ',
  `CZDATE` varchar(14) DEFAULT NULL COMMENT '操作时间',
  `REASON` varchar(200) DEFAULT NULL COMMENT '原因',
  `SROLE` varchar(40) DEFAULT NULL COMMENT '原角色',
  `EROLE` varchar(40) DEFAULT NULL COMMENT '代班角色      ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='临时代班记录表';

/*Data for the table `YYGL_POST_TEMP` */

/*Table structure for table `YYGL_REST_INFO` */

CREATE TABLE `YYGL_REST_INFO` (
  `ID` varchar(100) NOT NULL COMMENT 'ID',
  `ORGID` varchar(100) DEFAULT NULL COMMENT '机构号',
  `USERNO` varchar(100) DEFAULT NULL COMMENT '员工号',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '员工姓名',
  `STARTDATE` varchar(100) DEFAULT NULL COMMENT '休假开始时间',
  `EXTENDDATE` varchar(100) DEFAULT NULL COMMENT '预计结束时间',
  `ENDDATE` varchar(100) DEFAULT NULL COMMENT '实际结束时间',
  `FLAG` varchar(2) DEFAULT NULL COMMENT '结束标志',
  `REASON` varchar(2000) DEFAULT NULL COMMENT '休假说明',
  `POSTID` varchar(100) DEFAULT NULL COMMENT '岗位',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='休假表';

/*Data for the table `YYGL_REST_INFO` */

/*Table structure for table `YYGL_RESUME_INFO` */

CREATE TABLE `YYGL_RESUME_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '用户编号',
  `START_DATE` varchar(14) DEFAULT NULL COMMENT '开始日期',
  `END_DATE` varchar(14) DEFAULT NULL COMMENT '结束日期',
  `COM_NAME` varchar(50) DEFAULT NULL COMMENT '公司名称',
  `JOB` varchar(30) DEFAULT NULL COMMENT '职务',
  `DUTY` varchar(100) DEFAULT NULL COMMENT '职责',
  `POST_NAME` varchar(30) DEFAULT NULL COMMENT '岗位',
  `REW_PUN` varchar(200) DEFAULT NULL COMMENT '奖惩情况',
  `DELE_FLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='履历信息表';

/*Data for the table `YYGL_RESUME_INFO` */

/*Table structure for table `YYGL_REWARDPUBLISH_INFO` */

CREATE TABLE `YYGL_REWARDPUBLISH_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID ',
  `UPLOADING_USER_NO` varchar(40) DEFAULT NULL COMMENT '导入人员工号 ',
  `UPLOADING_TIME` varchar(20) DEFAULT NULL COMMENT '导入时间 ',
  `USER_NO` varchar(40) DEFAULT NULL COMMENT '员工号 ',
  `REWARDITEMS` varchar(400) DEFAULT NULL COMMENT '奖惩事项 ',
  `REWARDLEVEL` varchar(50) DEFAULT NULL COMMENT '奖惩级别 ',
  `REWARDREASON` varchar(1000) DEFAULT NULL COMMENT '奖惩原因 ',
  `DELE_FLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖励信息表';

/*Data for the table `YYGL_REWARDPUBLISH_INFO` */

/*Table structure for table `YYGL_SKILL_INFO` */

CREATE TABLE `YYGL_SKILL_INFO` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `UPLOADING_USER_NO` varchar(40) DEFAULT NULL COMMENT '上传人编号',
  `UPLOADING_TIME` varchar(20) DEFAULT NULL COMMENT '上传时间',
  `USER_NO` varchar(40) DEFAULT NULL COMMENT '用户编号',
  `USER_NAME` varchar(20) DEFAULT NULL COMMENT '用户名',
  `INPUT_CHINESE_LEVEL` varchar(20) DEFAULT NULL COMMENT '汉字输入等级',
  `KEYPAD_LEVEL` varchar(20) DEFAULT NULL COMMENT '翻打传票等级',
  `MANUAL_COUNTING_LEVEL` varchar(20) DEFAULT NULL COMMENT '手工点钞等级',
  `MACHINE_COUNTING_LEVEL` varchar(20) DEFAULT NULL COMMENT '机器点钞等级',
  `UPLOADING_USER_NAME` varchar(40) DEFAULT NULL COMMENT '上传人名字',
  `INPUT_CHINESE_SCORE` varchar(40) DEFAULT NULL COMMENT '汉字输入得分',
  `KEYPAD_SCORE` varchar(40) DEFAULT NULL COMMENT '翻打传票成绩',
  `MANUAL_COUNTING_SCORE` varchar(40) DEFAULT NULL COMMENT '手工点钞得分',
  `MACHINE_COUNTING_SCORE` varchar(40) DEFAULT NULL COMMENT '机器点钞得分',
  `ISQUALIFIED` varchar(40) DEFAULT NULL COMMENT '是否达标',
  `WRITTEN_SCORE` varchar(40) DEFAULT NULL COMMENT '技能得分',
  `OPERATE_SCORE` varchar(40) DEFAULT NULL COMMENT '专业知识成绩 ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='技能得分表';

/*Data for the table `YYGL_SKILL_INFO` */

/*Table structure for table `YYGL_SOCIRELATION` */

CREATE TABLE `YYGL_SOCIRELATION` (
  `ID` varchar(40) NOT NULL COMMENT 'ID',
  `USER_NO` varchar(20) DEFAULT NULL COMMENT '用户编号',
  `RELATION` varchar(50) DEFAULT NULL COMMENT '关系',
  `RELANAME` varchar(50) DEFAULT NULL COMMENT '姓名',
  `JOB` varchar(50) DEFAULT NULL COMMENT '职业',
  `DELE_FLAG` varchar(2) DEFAULT NULL COMMENT '删除标志位',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='社会关系信息表';

/*Data for the table `YYGL_SOCIRELATION` */

/*Table structure for table `YYGL_THING_TYPE_MASTER` */

CREATE TABLE `YYGL_THING_TYPE_MASTER` (
  `ID` varchar(100) NOT NULL COMMENT 'ID',
  `THINGTYPE` varchar(100) DEFAULT NULL COMMENT '物品类别',
  `THINGNO` varchar(40) DEFAULT NULL COMMENT '类别编号',
  `THINGPROPERTY` varchar(1) DEFAULT NULL COMMENT '创建属性',
  `DISTORYPROPERTY` varchar(1) DEFAULT NULL COMMENT '销毁属性',
  `VAL` varchar(20) DEFAULT NULL COMMENT '属性值',
  `ORDERNUM` varchar(20) DEFAULT NULL COMMENT '排序',
  `CREATETIME` varchar(23) DEFAULT NULL COMMENT '添加日期',
  `CREATEUSER` varchar(20) DEFAULT NULL COMMENT '添加者',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物品一级分类表';

/*Data for the table `YYGL_THING_TYPE_MASTER` */

/*Table structure for table `YYGL_TRAIN_INFO` */

CREATE TABLE `YYGL_TRAIN_INFO` (
  `ID` varchar(32) NOT NULL COMMENT 'ID',
  `PXID` varchar(32) DEFAULT NULL COMMENT '培训id',
  `USER_NO` varchar(32) DEFAULT NULL COMMENT '工号',
  `USERNAME` varchar(32) DEFAULT NULL COMMENT '姓名',
  `ORGID` varchar(32) DEFAULT NULL COMMENT '机构',
  `START_DATE` varchar(50) DEFAULT NULL COMMENT '开始时间',
  `END_DATE` varchar(50) DEFAULT NULL COMMENT '结束时间',
  `TRAIN_NAME` varchar(500) DEFAULT NULL COMMENT '培训名称',
  `HOLD_UNIT` varchar(500) DEFAULT NULL COMMENT '举办单位',
  `DELE_FLAG` varchar(10) DEFAULT NULL COMMENT '删除标志位',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='培训表';

/*Data for the table `YYGL_TRAIN_INFO` */

/*Table structure for table `YYGL_USERGOODS_INFO` */

CREATE TABLE `YYGL_USERGOODS_INFO` (
  `ID` varchar(100) NOT NULL COMMENT 'ID',
  `TYPE` varchar(50) DEFAULT NULL COMMENT '物品类别',
  `NAME` varchar(100) DEFAULT NULL COMMENT '物品名称',
  `SCTIME` varchar(40) DEFAULT NULL COMMENT '建档时间',
  `BGGY` varchar(40) DEFAULT NULL COMMENT '主保管柜员',
  `BGGYXM` varchar(40) DEFAULT NULL COMMENT '保管柜员姓名',
  `BGGYJGH` varchar(20) DEFAULT NULL COMMENT '保管柜员机构号',
  `BGGYJGMC` varchar(100) DEFAULT NULL COMMENT '保管柜员机构名称',
  `BGGYJS` varchar(100) DEFAULT NULL COMMENT '保管柜员角色',
  `BGGYGW` varchar(100) DEFAULT NULL COMMENT '保管柜员岗位',
  `SCSM` varchar(400) DEFAULT NULL COMMENT '建档说明',
  `JSTME` varchar(40) DEFAULT NULL COMMENT '接收时间',
  `YJGY` varchar(40) DEFAULT NULL COMMENT '移交柜员',
  `YJGYXM` varchar(40) DEFAULT NULL COMMENT '移交柜员姓名',
  `YJGYJGH` varchar(20) DEFAULT NULL COMMENT '移交柜员机构号',
  `YJGYJGMC` varchar(100) DEFAULT NULL COMMENT '移交柜员机构名称',
  `YJGYJS` varchar(100) DEFAULT NULL COMMENT '移交柜员角色',
  `YJGYGW` varchar(100) DEFAULT NULL COMMENT '移交柜员岗位',
  `YJTIME` varchar(40) DEFAULT NULL COMMENT '移交时间',
  `YJSM` varchar(400) DEFAULT NULL COMMENT '移交说明',
  `JJR` varchar(20) DEFAULT NULL COMMENT '监交人',
  `JJRXM` varchar(100) DEFAULT NULL COMMENT '监交人姓名',
  `JJRJGH` varchar(20) DEFAULT NULL COMMENT '监交人机构号',
  `JJRJGMC` varchar(100) DEFAULT NULL COMMENT '监交人机构名称',
  `JJRJS` varchar(100) DEFAULT NULL COMMENT '监交人角色',
  `JJRGW` varchar(100) DEFAULT NULL COMMENT '监交人岗位',
  `STAT` varchar(5) DEFAULT NULL COMMENT '状态',
  `GOODSID` varchar(100) DEFAULT NULL COMMENT '物品ID',
  `WPBZ` varchar(1200) DEFAULT NULL COMMENT '物品备注',
  `SECJS` varchar(40) DEFAULT NULL COMMENT '等待的接收人',
  `SECYJ` varchar(40) DEFAULT NULL COMMENT '等待的移交人',
  `BZ5` varchar(200) DEFAULT NULL COMMENT '备注5(移交原因) ',
  `BBGGY` varchar(40) DEFAULT NULL COMMENT '备保管员',
  `CREATEUSER` varchar(40) DEFAULT NULL COMMENT '操作人员',
  `CREATEDATE` varchar(20) DEFAULT NULL COMMENT '操作时间',
  `BBGGYXM` varchar(100) DEFAULT NULL COMMENT '备保管员姓名',
  `DELE_FLAG` varchar(5) DEFAULT NULL COMMENT '删除标识',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='我的物品表';

/*Data for the table `YYGL_USERGOODS_INFO` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
