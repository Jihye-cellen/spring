package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.GraphDAO;

@RestController
public class GraphController {
	@Autowired
	GraphDAO dao;
	
	@GetMapping("/avg/lcode") //테스트 /avg/lcode
	public List<HashMap<String, Object>> lcodeAvg(){
		return dao.lcodeAvg();
	}
	
	@GetMapping("/avg/scode") //테스트 /avg/scode
	public List<HashMap<String, Object>> scodeAvg(){
		return dao.scodeAvg();
	}
	
	@GetMapping("/count/dept") //테스트 /avg/scode
	public List<HashMap<String, Object>> countDept(){
		return dao.deptCount();
	}
}
