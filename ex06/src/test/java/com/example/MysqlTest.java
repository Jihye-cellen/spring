package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.*;
import com.example.domain.TradeVO;
import com.example.service.TradeService;

@SpringBootTest
public class MysqlTest {
	@Autowired
	UserDAO dao;
	
	@Autowired
	BBSDAO bdao;
	
	@Autowired
	ReplyDAO rdao;
	
	@Autowired
	MessageDAO mdao;
	
	@Autowired
	AccountDAO adao;
	
	@Autowired
	TradeService service;
	
	@Test
	public void test() {
//		ReplyVO vo = new ReplyVO();
//		QueryVO query =new QueryVO();
//		query.setPage(1);
//		query.setSize(3);
//		rdao.list(218, query);
//		
		//MessageVO mvo = new MessageVO();	
		TradeVO vo = new TradeVO();
		vo.setAmount(5000);
		vo.setAno("A001");
		vo.setTno("A002");
		vo.setType(-1);
		service.insert(vo);
				
		
		
	}

}
