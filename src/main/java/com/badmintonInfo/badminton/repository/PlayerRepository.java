package com.badmintonInfo.badminton.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.badmintonInfo.badminton.mongoPojo.MongoPlayer;

@Repository
public interface PlayerRepository extends MongoRepository<MongoPlayer, String> {

	@Query
	List<MongoPlayer> findByIconicPlayerIsTrue();
}
