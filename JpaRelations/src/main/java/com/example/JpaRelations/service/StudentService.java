package com.example.JpaRelations.service;

import org.springframework.stereotype.Service;

import com.example.JpaRelations.dto.StudentResponseDTO;
import com.example.JpaRelations.model.Department;
import com.example.JpaRelations.model.Student;
import com.example.JpaRelations.repository.DepartmentRepository;
import com.example.JpaRelations.repository.StudentRepository;

@Service
public class StudentService {

	StudentRepository studentRepository;
	
	DepartmentRepository departmentRepository;
	
	public StudentService(StudentRepository studentRepository,DepartmentRepository departmentRepository) {
		
		this.studentRepository = studentRepository;
		this.departmentRepository=departmentRepository;
	}
	
	
	public String createStudent(int id,Student student) {
			
		Department department=	departmentRepository.fetchByDeptId(id);
		student.setDept(department);
		department.getStudents().add(student);
		return 	studentRepository.create(student);
		 
	}
	
	public StudentResponseDTO fetchStudents(int id) {
		Student student=	studentRepository.fetch(id);
	
		StudentResponseDTO studentResponseDTO=new StudentResponseDTO(student);
		
		return studentResponseDTO;
		
	
	}

	
	
	
}
