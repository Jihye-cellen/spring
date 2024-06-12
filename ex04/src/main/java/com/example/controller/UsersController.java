package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("pagename", "/users/login.html");
		return "/home.html";
	}
}
