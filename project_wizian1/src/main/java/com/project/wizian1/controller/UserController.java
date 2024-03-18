package com.project.wizian1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.wizian1.command.StudentVO;
import com.project.wizian1.student.service.StudentService;
import com.project.wizian1.student.service.StudentServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentservice;
	
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
	
	@PostMapping("/joinStudent")
	public String joinStudent(StudentVO vo) {
		
		int result = studentservice.regist(vo);
		System.out.println(result);
		
		return "redirect:/user/login";
	}
	
	@PostMapping("/joinCompany")
	public String joinCompany() {
		return "redirect:/user/login";
	}
	
	@PostMapping("/joinManager")
	public String joinManager() {
		return "redirect:/user/login";
	}
	
}
