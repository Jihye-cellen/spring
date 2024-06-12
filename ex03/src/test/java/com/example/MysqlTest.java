package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.UsersDAO;
import com.example.domain.QueryVO;

@SpringBootTest
public class MysqlTest {
	@Autowired
	UsersDAO udao;
	
	@Test
	public void plist() {
		QueryVO vo = new QueryVO();
		vo.setPage(1);
		vo.setSize(5);
		udao.plist(vo);
	}

}
