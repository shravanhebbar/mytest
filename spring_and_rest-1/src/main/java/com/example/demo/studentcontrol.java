package com.example.demo;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s/")
public class studentcontrol{
	@Autowired//bean
	private studentservice students;

	@RequestMapping(method=RequestMethod.GET)
	public Collection<student> getAllStudent(){
		return students.getAllStudent();
		
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public student getById(@PathVariable("id") int id){
		return   this.students.getById(id);
		
	}
}