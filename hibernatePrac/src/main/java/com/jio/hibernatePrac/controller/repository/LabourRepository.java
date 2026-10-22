package com.jio.hibernatePrac.controller.repository;

import org.springframework.stereotype.Repository;

import com.jio.hibernatePrac.controller.model.Labour;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class LabourRepository {
	
	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public String save(Labour labour) {
		entityManager.persist(labour);
		return "saved";
	}
	
	public Labour fetch(int id) {
	return 	entityManager.find(Labour.class,id);
	}

	@Transactional
	public void remove(Labour labour) {
		entityManager.remove(labour);
	}
}
