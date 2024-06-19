package com.example.dao;

import java.util.*;

import com.example.domain.TradeVO;

public interface TradeDAO {
	public List<HashMap<String, Object>> list(String ano);
	public void insert(TradeVO vo);
 }
