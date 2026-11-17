package com.example.JpaRelations.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaRelations.model.Course;
import com.example.JpaRelations.service.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

	private CourseService courseService;

	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	
	@PostMapping
	public String addCourse(@RequestBody  Course course) {
		return courseService.addCourse(course);
	}
}
