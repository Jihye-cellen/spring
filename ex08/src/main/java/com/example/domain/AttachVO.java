package com.example.domain;

public class AttachVO {
	private int aid;
	private String gid;
	private String filename;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "AttachVO [aid=" + aid + ", gid=" + gid + ", filename=" + filename + "]";
	}
}
