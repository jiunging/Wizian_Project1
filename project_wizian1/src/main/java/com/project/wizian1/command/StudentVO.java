package com.project.wizian1.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVO {

	private String stu_num;
	private String stu_pw;
	private String stu_name;
	private String stu_bd;
	private String stu_phone;
	private String stu_email;
	
}
