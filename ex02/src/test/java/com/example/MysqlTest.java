package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.MysqlDAO;
import com.example.dao.UserDAO;

@SpringBootTest
public class MysqlTest {
 
	@Autowired 
	MysqlDAO dao;
	
	@Test
	public void now() {
		dao.now();
	}
	
	@Autowired
	UserDAO udao;
	
	@Test
	public void list() {
		udao.list();
	}
}
