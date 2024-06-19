package com.example.dao;

import java.util.List;

import com.example.domain.UserVO;

public interface UserDAO {
	public UserVO read(String uid);
	public void update (UserVO vo);
	public void updatePhoto(String photo, String uid);
	public void updatePass(String upass, String uid);
	public void updatePoint(String uid, int amount);
	public List<UserVO> list();
}
