package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.UsersMapper";
		
	@Override
	public UserVO read(String uid) {
		return session.selectOne(namespace + ".read" , uid);
	}

	@Override
	public void update(UserVO vo) {
		session.update(namespace + ".update", vo);
		
	}

	@Override
	public void updatePhoto(String photo, String uid) {
		HashMap<String,Object> map = new HashMap<>();
		map.put("photo", photo);
		map.put("uid", uid);
		session.update(namespace + ".updatePhoto", map); 
	}

	@Override
	public void updatePass(String upass, String uid) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("upass", upass);
		map.put("uid", uid);
		session.update(namespace + ".updatePass", map);
		
	}

	@Override
	public void updatePoint(String uid, int amount) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("uid", uid);
		map.put("amount", amount);
		session.update(namespace + ".updatePoint", map);
		
	}

	@Override
	public List<UserVO> list() {
		return session.selectList(namespace + ".list");
	}
	
}
