package com.example.JpaRelations.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaRelations.dto.DepartmentResponseDTO;
import com.example.JpaRelations.model.Department;
import com.example.JpaRelations.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	
	
	DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	

	@PostMapping
	public ResponseEntity<String> createDepartment( @RequestBody Department department){
		departmentService.createDepartment(department);
		return ResponseEntity.ok("Done");
	}
	
	@GetMapping
	public ResponseEntity<DepartmentResponseDTO> fetchDepartment(@RequestParam int id){
		return ResponseEntity.ok(departmentService.fetchDepartment(id));
	}

}
