package com.example.JpaRelations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaRelations.model.Student2;
import com.example.JpaRelations.service.Student2Service;

@RestController
@RequestMapping("/api/students2")
public class Student2Controller {

	private Student2Service student2Service;

	public Student2Controller(Student2Service student2Service) {
		this.student2Service = student2Service;
	}
	
	
	@PostMapping
	public String addStudent(@RequestBody Student2 student2,@RequestParam	int id) {
	return  student2Service.addStudent2(student2,id);
	
	}
	
	@GetMapping
	public Student2 fetchStudnt2(@RequestParam	int id) {
		return student2Service.fetchStudnt2(id);
	}
}
