package com.example.JpaRelations.repository;

import org.springframework.stereotype.Repository;

import com.example.JpaRelations.model.Student2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class Student2Repository {

	@PersistenceContext
	EntityManager entityManager;
	
	
	@Transactional
	public String addStudent2(Student2 student2) {
		entityManager.persist(student2);
		return "Saved";
	}
	
	public Student2 fetchStudnt2(int id) {
		return 	entityManager.find(Student2.class,id);
	}
	
}
