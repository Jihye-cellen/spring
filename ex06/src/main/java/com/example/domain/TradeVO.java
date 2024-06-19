package com.example.domain;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TradeVO {
	private int tid;
	private String ano;
	private String tno;
	private double amount;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date tradeDate;
	private int type;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "TradeVO [tid=" + tid + ", ano=" + ano + ", tno=" + tno + ", amount=" + amount + ", tradeDate="
				+ tradeDate + ", type=" + type + "]";
	}
}
