package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.payload.EmployeeDTO;

public interface EmployeeService {

	public EmployeeDTO saveEmployee(Employee employee);
	
	public EmployeeDTO getEmployeeById(long id);
}
