package com.example.domain;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MessageVO extends UserVO{
	private int mid;
	private String sender;
	private String receiver;
	private String message;
	private int sendDelete;
	private int reiceiveDelete;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date sendDate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date readData;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public Date getReadDate() {
		return readData;
	}
	public int getSendDelete() {
		return sendDelete;
	}
	public void setSendDelete(int sendDelete) {
		this.sendDelete = sendDelete;
	}
	public int getReiceiveDelete() {
		return reiceiveDelete;
	}
	public void setReiceiveDelete(int reiceiveDelete) {
		this.reiceiveDelete = reiceiveDelete;
	}
	public Date getReadData() {
		return readData;
	}
	public void setReadData(Date readData) {
		this.readData = readData;
	}
	public void setReadDate(Date readData) {
		this.readData = readData;
	}
	@Override
	public String toString() {
		return "MessageVO [mid=" + mid + ", sender=" + sender + ", receiver=" + receiver + ", message=" + message
				+ ", sendDate=" + sendDate + ", readDate=" + readData + ", getPoint()=" + getPoint() + "]";
	}
	
	
	
}
