package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.ProVO;
import com.example.domain.QueryVO;

@Repository
public class ProDAOImpl implements ProDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.ProMapper";
	
	@Override
	public List<ProVO> list(QueryVO vo) {
	
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public int total() {
		return session.selectOne(namespace + ".total" );
	}

}
