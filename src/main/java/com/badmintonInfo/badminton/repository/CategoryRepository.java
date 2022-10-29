package com.badmintonInfo.badminton.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.badmintonInfo.badminton.mongoPojo.MongoCategory;

@Repository
public interface CategoryRepository extends MongoRepository<MongoCategory, String> {
	 
	@Query("{name:'?0'}")
	MongoCategory findItemByName(String name);
	
}
