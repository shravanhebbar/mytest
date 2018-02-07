package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class studentdata{
	
	private static Map<Integer,student> student;
	
	static {
		student=new HashMap<Integer,student>(){
			
			{
				put(1,new student(1,"Shravan"));
				put(2,new student(2,"Shravani"));
			}
		};
	}
	public Collection<student> getAllStudent(){
		return this.student.values();
		
	}
	public student getById(int id){
		return this.student.get(id);
		
	}
}