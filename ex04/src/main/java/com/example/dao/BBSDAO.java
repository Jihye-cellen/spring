package com.example.dao;

import java.util.*;

import com.example.domain.*;

public interface BBSDAO {
	public List<HashMap<String, Object>> list(QueryVO vo);
	public int total(QueryVO vo);
	public BBSVO read(int bid);
	public void delete(int bid);
	public void update (BBSVO vo);
	public void insert(BBSVO vo);
}
