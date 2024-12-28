package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Project;
import com.example.demo.payload.EmployeeDTO;
import com.example.demo.repository.Employeerepository;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private Employeerepository employeerepository;

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public EmployeeDTO saveEmployee(Employee employee) {

		Employee saveEmployee = employeerepository.save(employee);
		Project project = new Project();
		Project project1 = projectRepository.findByProjectCode(project.getProjectCode());
		System.out.println(project1);
		EmployeeDTO employeeDTO = new EmployeeDTO();
		
		employeeDTO.setId(saveEmployee.getId());
		employeeDTO.setEmpName(saveEmployee.getEmpName());
		employeeDTO.setEmpMail(saveEmployee.getEmpMail());
		employeeDTO.setEmpBaseLocation(saveEmployee.getEmpBaseLocation());
		employeeDTO.setProjectCode(project.getProjectCode());
		employeeDTO.setProjectName(project.getProjectName());
		return employeeDTO;
	}

	@Override
	public EmployeeDTO getEmployeeById(long id) {
		Employee foundEmployee = employeerepository.findById(id).get();
		Project project = new Project();
		Project project1 = projectRepository.findByProjectCode(project.getProjectCode());
		EmployeeDTO employeeDTO = new EmployeeDTO();
		System.out.println(project1);
		employeeDTO.setId(foundEmployee.getId());
		employeeDTO.setEmpName(foundEmployee.getEmpName());
		employeeDTO.setEmpMail(foundEmployee.getEmpMail());
		employeeDTO.setEmpBaseLocation(foundEmployee.getEmpBaseLocation());
		employeeDTO.setProjectCode(project.getProjectCode());
		employeeDTO.setProjectName(project.getProjectName());
		return employeeDTO;
	}

}
