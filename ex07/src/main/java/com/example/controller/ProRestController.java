package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.*;
import com.example.domain.ProVO;
import com.example.domain.QueryVO;

@RestController
@RequestMapping("/pro")
public class ProRestController {
	@Autowired
	ProDAO dao;
	
	@GetMapping("") //테스트 : /pro?page=1&size=3 하면 total까지 출력
	public HashMap<String, Object> list(QueryVO vo){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total());
		return map;
	}
	
}
