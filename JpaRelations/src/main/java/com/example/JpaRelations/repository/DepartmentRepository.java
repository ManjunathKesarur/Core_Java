package com.example.JpaRelations.repository;

import org.springframework.stereotype.Repository;

import com.example.JpaRelations.model.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class DepartmentRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void	createDepartment(Department department) {
		entityManager.persist(department);
	}
	
	
	public Department fetchByDeptId(int id) {
		return 	entityManager.find(Department.class,id);
	}
}
