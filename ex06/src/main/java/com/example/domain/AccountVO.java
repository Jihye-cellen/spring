package com.example.domain;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AccountVO {
	private String ano;
	private String uid;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date openDate;
	private double balance;
	private String fmtBalance;
	
	public String getFmtBalance() {
		return fmtBalance;
	}
	public void setFmtBalance(String fmtBalance) {
		this.fmtBalance = fmtBalance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountVO [ano=" + ano + ", uid=" + uid + ", openDate=" + openDate + ", balance=" + balance + "]";
	}
	
}
