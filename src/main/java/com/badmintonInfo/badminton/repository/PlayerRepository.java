package com.badmintonInfo.badminton.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.badmintonInfo.badminton.mongoPojo.MongoPlayer;

@Repository
public interface PlayerRepository extends MongoRepository<MongoPlayer, String> {

	@Query
	List<MongoPlayer> findByIconicPlayerIsTrue(Pageable pageable);

	@Query("{category:?0}")
	List<MongoPlayer> findByIconicPlayerIsTrueAndCategory(Pageable pageable, String category);

	@Query
	Page<MongoPlayer> findByBwfRanking(Pageable pageable);

    @Query("{country:?0,category:?1}")
	List<MongoPlayer> findByCountryAndCategory(Pageable pageable,String country, String category);

    @Query("{country:?0}")	
    List<MongoPlayer> findByCountry(Pageable pageable,String country);

    @Query("{category: ?0}")	
    List<MongoPlayer> findByCategory( Pageable pageable,String category);
}
