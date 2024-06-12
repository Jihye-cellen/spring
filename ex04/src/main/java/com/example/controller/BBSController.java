package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.BBSDAO;

@Controller
@RequestMapping("/bbs")
public class BBSController {
	@Autowired
	BBSDAO dao;
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("pagename", "/bbs/list.html");
		return "/home.html";
	}
	
	@GetMapping("/read/{bid}")
	public String read(@PathVariable("bid") int bid, Model model) {
		model.addAttribute("bbs", dao.read(bid));
		model.addAttribute("pagename", "/bbs/read.html");
		return "/home.html";
	}
	
	@GetMapping("/update/{bid}")
	public String update(@PathVariable("bid") int bid, Model model) {
		model.addAttribute("bbs", dao.read(bid));
		model.addAttribute("pagename", "/bbs/update.html");
		return "/home.html";
	}
	
	@GetMapping("/insert")
	public String insert(Model model) {
		model.addAttribute("pagename", "/bbs/insert.html");
		return "/home.html";
	}
}
