package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentData implements  CommandLineRunner {

	public StudentData(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	private StudentRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		student s1=new student("1", "Peter", "Development", (float) 300.22);
		student s2=new student("2", "Sam", "Development", (float) 250.22);
		
		
		this.repository.deleteAll();
		
		
		List<student> students=Arrays.asList(s1,s2);
		this.repository.save(students);
	
		
	}
	
	

}
