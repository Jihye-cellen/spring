package com.example.dao;

import java.util.*;

import com.example.domain.MessageVO;

public interface MessageDAO {
	public void insert(MessageVO vo);
	public MessageVO readSend(int mid);
	public MessageVO readReceive(int mid);
	public void updateReadDate(int mid);
	public List<MessageVO> listSend(String sender);
	public List<MessageVO> listReceive(String receiver);
	public void deleteReceive(int mid);
	public void deleteSend(int mid);
	public List<MessageVO> listDelete(String uid);
	public void resetDelete(int mid, String type);
}
