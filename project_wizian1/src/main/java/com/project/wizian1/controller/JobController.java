package com.project.wizian1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/job")
public class JobController {

	@GetMapping("/jobpost")
	public String jobPost() {
		
		return "job/resume_jobpost";
	}
	
}
