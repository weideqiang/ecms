package com.siroinfo.ecms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 附件表
 * create by zhoujh
 */
public class SysAttachmentsModel {
    private String id;
    private String pid;  							//父主键
    private String user_no;   						//记录用户
    private String filename;						//文件名
    private String filepath;						//文件路径 
    private String filetype;						//文件类型
    private String pidtype;							//父设置类型
    private String createdate;						//记录创建时间
    private String status;							//状态
    private String yxptid;							//影像平台文件id
    
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
	public String getUser_no() {
		return user_no;
	}
	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public String getPidtype() {
		return pidtype;
	}
	public void setPidtype(String pidtype) {
		this.pidtype = pidtype;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getYxptid() {
		return yxptid;
	}
	public void setYxptid(String yxptid) {
		this.yxptid = yxptid;
	}
}
