package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//홈페이지출력
	@GetMapping("/")
	public String home() {
		return "/home.html";
				
	}
}
