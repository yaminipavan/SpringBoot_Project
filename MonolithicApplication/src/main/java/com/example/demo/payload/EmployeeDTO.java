package com.example.demo.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

	private long id;

	private String empName;
	private String empMail;
	private String empBaseLocation;
	private long projectCode;
	private String projectName;
}
