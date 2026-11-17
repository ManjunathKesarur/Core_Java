package com.example.JpaRelations.repository;

import org.springframework.stereotype.Repository;

import com.example.JpaRelations.model.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class CourseRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public String addCourse(Course course) {
		entityManager.persist(course);
		return "Saved";
	}
	
	@Transactional 
	public Course findCourse(int id) {
	return 	entityManager.find(Course.class,id);
	
	}
}
