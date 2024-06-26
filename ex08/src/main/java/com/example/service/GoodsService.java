package com.example.service;

import java.util.HashMap;

import com.example.domain.GoodsVO;
import com.example.domain.QueryVO;

public interface GoodsService {
	public int insert(GoodsVO vo);
	public HashMap<String, Object> list(QueryVO vo);
}
