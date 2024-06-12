package com.example.domain;

import java.util.Date;

public class BBSVO extends UserVO{
	private int bid;
	private String title;
	private String contents;
	private Date regDate;
	private String uid;
	public int getBid() {
		return bid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "BBSVO [bid=" + bid + ", title=" + title + ", contents=" + contents + ", regDate=" + regDate + ", uid="
				+ uid + ", getUname()=" + getUname() + "]";
	}

}
