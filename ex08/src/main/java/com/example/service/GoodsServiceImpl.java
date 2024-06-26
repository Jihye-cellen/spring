package com.example.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.GoodsDAO;
import com.example.domain.GoodsVO;
import com.example.domain.QueryVO;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	GoodsDAO dao;
	
	@Transactional
	@Override
	public int insert(GoodsVO vo) {
		GoodsVO goods=dao.read(vo.getGid());
		if(goods==null) {
			dao.insert(vo);
			return 1;
		}
		return 0;
	}

	@Transactional
	@Override
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("total", dao.total());
		map.put("list", dao.list(vo));
		return map;
	}
}
