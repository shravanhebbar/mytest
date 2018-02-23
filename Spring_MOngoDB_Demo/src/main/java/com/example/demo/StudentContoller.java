package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.querydsl.core.types.CollectionExpression;
import com.querydsl.core.types.dsl.BooleanExpression;

@RestController
@RequestMapping("/student/")
public class StudentContoller {
	public StudentContoller(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	private StudentRepository repository; 
	
	@GetMapping("/all")
	 public List<student> getAll() {
        return repository.findAll();
    }
	@GetMapping("/{id}")
	public student findById(@PathVariable("id") String id) {
		
		
		return repository.findById(id);
		
		
	}
	@GetMapping("/name/{name}")
	public List<student> findByName(@PathVariable("name") String name){
		return repository.findByName(name);
		
	}
	
	@GetMapping("/marks/{marks}")
	public  List<student> findByMarks(@PathVariable("marks")float marks){
		Qstudent student=new Qstudent("student");
		BooleanExpression filterByMarks = student.marks.eq(marks);

        // we can then pass the filters to the findAll() method
        List<student> student1 = (List<student>) this.repository.findAll(filterByMarks);

        return student1;

		
		
	}
	

}
