package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.BBSDAO;
import com.example.dao.ReplyDAO;
import com.example.dao.UserDAO;
import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;

@SpringBootTest
public class MysqlTest {
	@Autowired
	UserDAO dao;
	
	@Autowired
	BBSDAO bdao;
	
	@Autowired
	ReplyDAO rdao;
	
	@Test
	public void test() {
//		ReplyVO vo = new ReplyVO();
//		QueryVO query =new QueryVO();
//		query.setPage(1);
//		query.setSize(3);
//		rdao.list(218, query);
//		
		
		rdao.total(218);
		
	}

}
