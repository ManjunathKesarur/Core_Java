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
	public void save(Labour labour) {
		entityManager.persist(labour);
	}
	
	public Labour fetch(int id) {
	return 	entityManager.find(Labour.class,id);
	}

	public void remove(int id) {
		entityManager.remove(id);
	}
}
