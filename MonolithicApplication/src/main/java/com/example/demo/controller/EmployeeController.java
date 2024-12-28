package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.payload.EmployeeDTO;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/post")
	public EmployeeDTO createEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public EmployeeDTO getEmployeeByid(@PathVariable long id) {
		return employeeService.getEmployeeById(id);
	}
	

}
