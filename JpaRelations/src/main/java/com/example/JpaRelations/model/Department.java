package com.example.JpaRelations.model;



import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data

public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String name;
	
	
	private int studentcount;
	
	
	@OneToMany(mappedBy = "dept")
	
	private List<Student> students=new ArrayList<Student>();
	
	
	
}
