package com.project.wizian1.student.service;

import org.apache.ibatis.annotations.Mapper;

import com.project.wizian1.command.StudentVO;

@Mapper
public interface StudentMapper {
	
	public int regist(StudentVO vo);
	
}
