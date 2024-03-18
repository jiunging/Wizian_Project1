package com.project.wizian1.student.service;

import org.springframework.stereotype.Service;

import com.project.wizian1.command.StudentVO;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Override
	public int regist(StudentVO vo) {
		System.out.println("imple작동됨");
		return 0;
	}

	
	
}
