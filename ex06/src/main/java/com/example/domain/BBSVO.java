package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BBSVO extends UserVO{
	private int bid;
	private String title;
	private String contents;
	@JsonFormat(pattern="yyyy년 MM월 dd일 HH:mm:ss", timezone="Asia/Seoul")
	private Date regDate;
	private String uid;
	private int viewcnt;
	
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
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
				+ uid + ", viewcnt=" + viewcnt + "]";
	}
	

}
