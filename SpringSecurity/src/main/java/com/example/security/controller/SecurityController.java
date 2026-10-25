package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class SecurityController {
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		return "Hi, this is the home page controller "+request.getSession().getId();
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "hi this is my cantact : 9390441208";
	}

}
