package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloApplication {
	

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloApplication
        		.class, args);
    }
}