package com.example.dao;

import java.util.*;

import com.example.domain.*;

public interface StuDAO {
	public List<StuVO> list(QueryVO vo);
	public int total(QueryVO vo);
	public String getcode(String yy, String dept);
	public void insert(StuVO vo);
	public StuVO read (String scode);
	public void delete(String scode);
	public void update(StuVO vo);
}
