package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.AccountVO;
import com.example.domain.TradeVO;

@Repository
public class AccountDAOImpl implements AccountDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.AccountMapper";
	
	@Override
	public List<AccountVO> list() {
		return session.selectList(namespace + ".list");
	}

	@Override
	public AccountVO read(String uid) {
		return session.selectOne(namespace + ".read", uid);
	}

	@Override
	public void update(TradeVO vo) {
		session.update(namespace + ".update", vo);
	}
	
}
