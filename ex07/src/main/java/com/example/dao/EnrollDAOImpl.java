package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.EnrollVO;

@Repository
public class EnrollDAOImpl implements EnrollDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.EnrollMapper";
	
	@Override
	public List<HashMap<String, Object>> scodeList(String scode) {
		return session.selectList(namespace + ".scodeList", scode);
	}

	@Override
	public int check(EnrollVO vo) {
		return session.selectOne(namespace + ".check", vo);
	}

	@Override
	public void insert(EnrollVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public void delete(EnrollVO vo) {
		session.delete(namespace + ".delete", vo);
	}

	@Override
	public List<HashMap<String, Object>> lcodeList(String lcode) {
		return session.selectList(namespace + ".lcodeList", lcode);
	}

	@Override
	public void update(EnrollVO vo) {
		session.update(namespace + ".update", vo);
	}
}
