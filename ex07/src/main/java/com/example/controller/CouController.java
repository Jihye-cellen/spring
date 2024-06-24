package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.*;
import com.example.domain.*;
import com.example.service.CouService;

@RestController
@RequestMapping("/cou")
public class CouController {
	@Autowired
	CouDAO dao;
	
	@Autowired
	CouService service;

	
	@PostMapping("/insert")
	public void insert(@RequestBody CouVO vo) {
		service.insert(vo);
	}
	
	@GetMapping("/read/{lcode}")
	public CouVO read(@PathVariable("lcode") String lcode) {
		return dao.read(lcode);
	}
	
	@PostMapping("/delete/{lcode}")
	public void delete(@PathVariable("lcode") String lcode) {
		dao.delete(lcode);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody CouVO vo) {
		dao.update(vo);
	}
	
	@GetMapping("") //테스트 /cou?page=1&size=3
	public HashMap<String, Object> list(QueryVO vo){
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("total", dao.total());
		map.put("list", dao.list(vo));
		return map;
	}
}
