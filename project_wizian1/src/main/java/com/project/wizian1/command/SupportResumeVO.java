package com.project.wizian1.command;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class SupportResumeVO {
	private String stu_name;
	private String stu_address;
	private String stu_address_detail;
	private String stu_phone;
	private String stu_email;
	private String stu_age;
	private String stu_certi_name;
	private String stu_gradyn;
	private LocalDate stu_jobstartdate;
	private LocalDate stu_jobenddate;
	private String jobcompname;
	private String joblevel;
	private String stu_jobjob;
	private String stu_jobwork;
	private String stu_awardname;
	private String stu_awardcompname;
	private String stu_emp_type;
	private String stu_interest;
	private String stu_wage;

}
