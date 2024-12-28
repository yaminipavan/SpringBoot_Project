package com.example.demo.service;

import com.example.demo.entity.Project;

public interface ProjectService {

	public Project saveProject(Project project);

	public Project getProjectByCode(long projectCode);
}
