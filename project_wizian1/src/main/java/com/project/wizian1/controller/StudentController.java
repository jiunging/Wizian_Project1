package com.project.wizian1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("header")
	public String header() {
		return "include/header";
	}
	
	@GetMapping("/stu_main")
	public String stu_main() {
		
		return "student/stu_main";
	}
	
	@GetMapping("/stu_apply_list")
	public String stu_apply_list() {
		
		return "student/stu_apply_list";
	}
	
	
	@GetMapping("/stu_job_list")
	public String stu_job_list() {
		
		return "student/stu_job_list";
	}
	
	@GetMapping("/stu_mypage")
	public String stu_mypage() {
		
		return "student/stu_mypage";
	}
	
	@GetMapping("/comp_popup")
	public String comp_popup() {
		
		return "student/comp_popup";
	}
	

	
	
	
}
