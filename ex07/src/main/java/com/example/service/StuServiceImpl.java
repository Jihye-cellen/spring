package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.*;
import com.example.domain.*;

@Service
public class StuServiceImpl implements StuService{
	@Autowired
	StuDAO dao;
	
	@Transactional
	@Override
	public void insert(StuVO vo) {
		String scode= dao.getcode("24", vo.getDept());
		vo.setScode(scode);
		dao.insert(vo);
		
	}

}
