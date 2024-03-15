package com.project.wizian1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/co")
public class CompanyController {
	
	@GetMapping("/coMypage")
	public String comypage() {
		return "co/coMypage";
	}
	
	

}
