package com.example.JpaRelations.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaRelations.dto.StudentResponseDTO;
import com.example.JpaRelations.model.Student;
import com.example.JpaRelations.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<String> createStudnet(@RequestBody Student student,@PathVariable int id ){
		
		return ResponseEntity.ok(studentService.createStudent(id,student));
	}
	
	
	@GetMapping
	public ResponseEntity<StudentResponseDTO>fetchStudents(@RequestParam int id) {
	
		return ResponseEntity.ok(studentService.fetchStudents(id));
	}

	
}
