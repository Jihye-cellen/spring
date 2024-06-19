package com.example;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.*;
import com.example.domain.QueryVO;


@SpringBootTest
public class MysqlTest {
	@Autowired
	ProDAO pdao;
	
	@Autowired
	StuDAO sdao;
	

	
	@Test
	public void test() {
		sdao.getcode("93", "건축");
		
		
	
				
		
		
	}

}
