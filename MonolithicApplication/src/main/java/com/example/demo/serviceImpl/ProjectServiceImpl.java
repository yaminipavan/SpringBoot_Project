package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Project;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepo;

	@Override
	public Project saveProject(Project project) {

		Project Saveproject = projectRepo.save(project);
		return Saveproject;
	}

	@Override
	public Project getProjectByCode(long projectCode) {
		Project foundproject = projectRepo.findByProjectCode(projectCode);

		return foundproject;
	}

}
