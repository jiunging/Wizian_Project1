package com.project.wizian1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/join")
	public String join() {
		return "user/join";
	}
	
	@GetMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("/mypage")
	public String mypage() {
		return "user/mypage";
	}

}
