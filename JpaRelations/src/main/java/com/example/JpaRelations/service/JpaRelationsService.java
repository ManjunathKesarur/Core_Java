package com.example.JpaRelations.service;

import org.springframework.stereotype.Service;

import com.example.JpaRelations.repository.JpaRelationsRepository;

@Service
public class JpaRelationsService {

	JpaRelationsRepository jpaRelationsRepository;

	public JpaRelationsService(JpaRelationsRepository jpaRelationsRepository) {
		this.jpaRelationsRepository = jpaRelationsRepository;
	}
	
	
}
