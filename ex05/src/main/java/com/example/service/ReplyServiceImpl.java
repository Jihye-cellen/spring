package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.BBSDAO;
import com.example.dao.ReplyDAO;
import com.example.domain.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	ReplyDAO rdao;
	
	@Autowired
	BBSDAO bdao;

	
	@Transactional
	@Override
	public void insert(ReplyVO vo) {
		rdao.insert(vo);
		bdao.updateReplycnt(vo.getBid(), +1);
	}

	@Transactional
	@Override
	public void delete(int rid) {
		ReplyVO vo = rdao.read(rid);
		rdao.delete(rid);
		bdao.updateReplycnt(vo.getBid(), -1);
		
		
	}

}
