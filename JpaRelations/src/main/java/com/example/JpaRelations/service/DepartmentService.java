package com.example.JpaRelations.service;

import org.springframework.stereotype.Service;

import com.example.JpaRelations.dto.DepartmentResponseDTO;
import com.example.JpaRelations.model.Department;
import com.example.JpaRelations.repository.DepartmentRepository;

import jakarta.transaction.Transactional;

@Service
public class DepartmentService {

	DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}
	
	public void	createDepartment(Department department) {
			
	departmentRepository.createDepartment(department);
	}
	
	@Transactional
	public DepartmentResponseDTO fetchDepartment(int id) {
		Department department= departmentRepository.fetchByDeptId(id);
			
		DepartmentResponseDTO departmentResponseDTO=new DepartmentResponseDTO(department);
		
		return departmentResponseDTO;
		
		
	}
	
}
