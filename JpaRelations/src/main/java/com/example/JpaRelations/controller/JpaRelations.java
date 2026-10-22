package com.example.JpaRelations.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaRelations.service.JpaRelationsService;

@RestController
@RequestMapping("/jpaRelations")
public class JpaRelations {

JpaRelationsService jpaRelationsService;

public JpaRelations(JpaRelationsService jpaRelationsService) {
	this.jpaRelationsService = jpaRelationsService;
}

	
}
