package com.project.wizian1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/support")
public class SupportController {
	
	@GetMapping("/resume")
	public String resume_supportCenter() {
		return "support/resume_supportCenter";
	}

}
