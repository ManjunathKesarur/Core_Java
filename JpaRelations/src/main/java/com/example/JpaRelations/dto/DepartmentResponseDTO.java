package com.example.JpaRelations.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.JpaRelations.model.Department;
import com.example.JpaRelations.model.Student;

import lombok.Data;

@Data
public class DepartmentResponseDTO {

	private int id;
	
	private String name;
	private List<StudentSummary> students;
	
	public DepartmentResponseDTO(Department department) {
		this.id = department.getId();
		this.name = department.getName();
		this.students = new ArrayList<StudentSummary>();
		
		if(department.getStudents() != null) {
			for(Student student : department.getStudents()) {
				StudentSummary summary=new StudentSummary(student.getId(),student.getName());
				this.students.add(summary);
			}
		}
	}	
}

@Data
class StudentSummary{
	private int id;
	private String name;
	
	
	public StudentSummary(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
