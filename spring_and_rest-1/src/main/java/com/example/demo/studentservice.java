package com.example.demo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentservice{
	@Autowired//bean
	private studentdata student;
	public Collection<student> getAllStudent(){
		return student.getAllStudent();
		
	}
	
	public student getById(int id){
		return ((studentdata) this.student).getById(id);
		
	}
}