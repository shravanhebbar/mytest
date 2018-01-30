package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
@RestController
public class alienresource {
@RequestMapping
	public List<alian> getAliens(){
		
		List<alian> aliens=new ArrayList<alian>();
		
		alian  a=new alian();
		a.setName("shravan");
		a.setPoints(80);
		
		alian  a1=new alian();
		a1.setName("shravan");
		a1.setPoints(71);
		
		aliens.add(a);
		aliens.add(a1);
		
		return aliens;
		
	}
	
	public alian createalien(alian a1) {
	System.out.println(a1);
	return a1;
	
	}
	
}
