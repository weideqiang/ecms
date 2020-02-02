package com.siroinfo.ecms.util;

public class ExamTrqtObject extends OracleObject{
	private String trxno;
	private int scount;

	public String getTrxno() {
		return trxno;
	}

	public void setTrxno(String trxno) {
		this.trxno = trxno;
	}

	public int getScount() {
		return scount;
	}

	public void setScount(int scount) {
		this.scount = scount;
	}

	// 构造函数
	public ExamTrqtObject(String trxno, int count) {
		super();
		this.trxno = trxno;
		this.scount = count;
	}

	public Object[] toArray() {
		return new Object[] { this.trxno, this.scount };
	}
}
