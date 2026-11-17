package com.example.JpaRelations.service;

import org.springframework.stereotype.Service;

import com.example.JpaRelations.model.Course;
import com.example.JpaRelations.model.Student2;
import com.example.JpaRelations.repository.CourseRepository;
import com.example.JpaRelations.repository.Student2Repository;

@Service
public class Student2Service {

	private Student2Repository student2Repository;
	
	private CourseRepository courseRepository;

	public Student2Service(Student2Repository student2Repository, CourseRepository courseRepository) {
		this.student2Repository = student2Repository;
		this.courseRepository = courseRepository;
	}
	
	public String addStudent2(Student2 student2,int id) {
		
		Course course=	courseRepository.findCourse(id);
		
		if(course ==  null)
			return "enter the valid couseid";
		
		student2.getCourse().add(course);
		
		return student2Repository.addStudent2(student2);
	}
	
	public Student2 fetchStudnt2(int id) {
		return student2Repository.fetchStudnt2(id);
	}
	
	
	
	
}
