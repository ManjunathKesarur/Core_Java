package com.jio.hibernatePrac.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jio.hibernatePrac.controller.model.Labour;
import com.jio.hibernatePrac.service.LabourService;

@RestController
@RequestMapping("/labour")
public class LabourController {

	LabourService labourService;

	public LabourController(LabourService labourService) {
		this.labourService = labourService;
	}
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Labour labour) {
		labourService.save(labour);
		return ResponseEntity.ok("Saveds");
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Labour> fetch(@PathVariable int id) {
//	 	labourService.fetch(id);
	return ResponseEntity.ok(labourService.fetch(id));
	}
	
	@PutMapping("/{id}")
	public String update(@PathVariable int id,@RequestBody Labour labour) {
	return labourService.update(id, labour);	
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return labourService.delete(id);
	}
}
