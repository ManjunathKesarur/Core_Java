package com.example.JpaRelations.dto;

import com.example.JpaRelations.model.Department;
import com.example.JpaRelations.model.Student;

import lombok.Data;

@Data
public class StudentResponseDTO {

	private int id;
	
	private String name;
	
	private DepartmentSummary dept_id ;

	public StudentResponseDTO(Student student) {
	
		this.id = student.getId();
		this.name =student.getName();
		
		if(student.getDept()!=null) {
				
			this.dept_id=new DepartmentSummary(
					student.getDept().getId(),student.getDept().getName());
		}
		
	}}
	
	@Data
     class DepartmentSummary{
		private int id;
		private String name;
		public DepartmentSummary(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}
	
