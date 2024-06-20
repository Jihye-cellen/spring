package com.example.domain;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StuVO extends ProVO{
	private String scode;
	private String sname;
	private String dept;
	private String advisor;
	private int year;
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date birthday;
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "StuVO [scode=" + scode + ", sname=" + sname + ", dept=" + dept + ", year="
				+ year + ", birthday=" + birthday + ", advisor=" + advisor + ", getPname()=" + getPname() + "]";
	}
	
	
}
