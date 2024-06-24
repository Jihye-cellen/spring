package com.example.dao;

import java.util.*;

import com.example.domain.EnrollVO;

public interface EnrollDAO {
	public List<HashMap<String,Object>> scodeList(String scode);
	public List<HashMap<String,Object>> lcodeList(String lcode);
	public int check(EnrollVO vo);
	public void insert(EnrollVO vo);
	public void delete(EnrollVO vo);
	public void update(EnrollVO vo);
}
