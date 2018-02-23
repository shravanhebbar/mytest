package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

@Repository
public interface StudentRepository extends MongoRepository<student,String>,QueryDslPredicateExecutor<student> {
	
	student findById(String id);

	@Query(value= "{name:?0}")
	List<student> findByName(String name);
	
	
}
