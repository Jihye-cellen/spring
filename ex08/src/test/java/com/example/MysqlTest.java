package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.GoodsDAO;
import com.example.dao.MysqlDAO;
import com.example.domain.GoodsVO;


@SpringBootTest
public class MysqlTest {
	@Autowired
	MysqlDAO dao;
	
	@Autowired
	GoodsDAO gdao;
	
	@Test
	public void test() {
		GoodsVO vo=gdao.read("46670109618");
		System.out.println("vo........" + vo);
	}
}






