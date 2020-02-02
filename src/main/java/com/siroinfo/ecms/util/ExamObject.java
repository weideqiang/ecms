package com.siroinfo.ecms.util;

public class ExamObject extends OracleObject {
	private int linage;
	private String type;
	private String busitype;
	private String lvl;

	public int getLinage() {
		return linage;
	}

	public void setLinage(int linage) {
		this.linage = linage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBusitype() {
		return busitype;
	}

	public void setBusitype(String busitype) {
		this.busitype = busitype;
	}

	public String getLvl() {
		return lvl;
	}

	public void setLvl(String lvl) {
		this.lvl = lvl;
	}

	// 构造函数
	public ExamObject(int linage, String type, String busitype, String lvl) {
		super();
		this.linage = linage;
		this.type = type;
		this.busitype = busitype;
		this.lvl = lvl;
	}

	public Object[] toArray() {
		return new Object[] { this.linage, this.type, this.busitype, this.lvl };
	}
}
