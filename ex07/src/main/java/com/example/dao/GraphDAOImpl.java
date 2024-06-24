package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GraphDAOImpl implements GraphDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.GraphMapper";
	
	@Override
	public List<HashMap<String, Object>> lcodeAvg() {
		
		return session.selectList(namespace + ".lcodeAvg");
	}

	@Override
	public List<HashMap<String, Object>> scodeAvg() {
		
		return session.selectList(namespace + ".scodeAvg");
	}

	@Override
	public List<HashMap<String, Object>> deptCount() {
		return session.selectList(namespace + ".deptCount");
	}

}
