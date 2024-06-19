package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.MessageVO;

@Repository
public class MessageDAOImpl implements MessageDAO {
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.MessageMapper";
	
	@Override
	public void insert(MessageVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}

	@Override
	public MessageVO readSend(int mid) {
		return session.selectOne(namespace + ".readSend", mid);
	}

	@Override
	public MessageVO readReceive(int mid) {
		return session.selectOne(namespace + ".readReceive", mid);
	}

	@Override
	public void updateReadDate(int mid) {
		session.update(namespace + ".updateReadDate", mid);
		
	}

	@Override
	public List<MessageVO> listSend(String sender) {
		return session.selectList(namespace + ".listSend" , sender) ;
	}

	@Override
	public List<MessageVO> listReceive(String receiver) {
		return session.selectList(namespace + ".listReceive", receiver);
	}

	@Override
	public void deleteReceive(int mid) {
		session.update(namespace + ".deleteReceive", mid);
		
	}

	@Override
	public void deleteSend(int mid) {
		session.update(namespace + ".deleteSend", mid);
		
	}

	@Override
	public List<MessageVO> listDelete(String uid) {
		return session.selectList(namespace + ".listDelete", uid) ;
	}

	@Override
	public void resetDelete(int mid, String type) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("mid", mid);
		map.put("type", type);
		session.update(namespace + ".resetDelete", map);
		
	}

}
