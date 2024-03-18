package com.project.wizian1.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.wizian1.command.JobVO;
import com.project.wizian1.job.service.JobService;

@Controller
@RequestMapping("/job")
public class JobController {
	
	@Autowired
	@Qualifier
	private JobService jobService;
	
	
	@GetMapping("/jobpost")
	public String jobPost() {
		
		return "job/resume_jobpost";
	}
	@PostMapping("/registForm")
	public String regist(JobVO vo, RedirectAttributes ra) {
		System.out.println(vo.toString());
		int result = jobService.regist(vo);
		if(result==1) {
			ra.addFlashAttribute("msg","정상적으로 처리하였습니다");
		}else {
			ra.addFlashAttribute("msg","이상한 사람이다.");
		}
		return "redirect:/job/resume_jobpost";
		
	}
}
