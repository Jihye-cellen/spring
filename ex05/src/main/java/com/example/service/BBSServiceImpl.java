package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.BBSDAO;
import com.example.domain.BBSVO;

@Service
public class BBSServiceImpl implements BBSService{
	@Autowired
	BBSDAO dao;
	
	@Transactional
	@Override
	public BBSVO read(int bid) {
		dao.updateViewcnt(bid);
		return dao.read(bid);
	}

}
