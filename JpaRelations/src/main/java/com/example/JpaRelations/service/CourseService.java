package com.example.JpaRelations.service;

import org.springframework.stereotype.Service;

import com.example.JpaRelations.model.Course;
import com.example.JpaRelations.repository.CourseRepository;

@Service
public class CourseService {

	private CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {

		this.courseRepository = courseRepository;
	}
	
	public String addCourse(Course course) {
		return	courseRepository.addCourse(course);
	}
}
