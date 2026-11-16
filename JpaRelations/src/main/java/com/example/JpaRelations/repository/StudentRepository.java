package com.example.JpaRelations.repository;

import org.springframework.stereotype.Repository;

import com.example.JpaRelations.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class StudentRepository {

	@PersistenceContext
	EntityManager entityManager;

	
	@Transactional
	public String create(Student student) {
		entityManager.persist(student);
		return "Saved";
	}
	
	@Transactional
	public Student fetch(int id) {
		return entityManager.find(Student.class,id);
	}
	
}
