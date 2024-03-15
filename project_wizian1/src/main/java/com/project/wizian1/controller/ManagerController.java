package com.project.wizian1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mn")
public class ManagerController {
	
	@GetMapping("/managerPage")
	public String managerPage() {
		
		return "mn/managerPage";
	}

}
