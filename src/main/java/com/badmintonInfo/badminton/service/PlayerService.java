package com.badmintonInfo.badminton.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.badmintonInfo.badminton.mongoPojo.MongoPlayer;
import com.badmintonInfo.badminton.pojo.Player;
import com.badmintonInfo.badminton.pojo.PlayerData;
import com.badmintonInfo.badminton.repository.PlayerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PlayerService {

	
	private final PlayerRepository playerRepository;
	
	@Autowired
	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	
	public PlayerData getPlayers(String country, String category) {
		
		Pageable request = PageRequest.of(0, 2, Sort.Direction.DESC, "bwfRanking");	
		
		List<MongoPlayer> findByCountryAndCategory = getMongoPlayers(country,category, request);
		List<Player> players = findByCountryAndCategory.stream().map(r -> new Player(r)).collect(Collectors.toList());
		
		return new PlayerData(players);
	}

	private List<MongoPlayer> getMongoPlayers(String country, String category, Pageable request) {
		
		List<MongoPlayer> findByCountryAndCategory = new ArrayList<>();
		
		if(!StringUtils.isEmpty(country) && !StringUtils.isEmpty(category)) {
			
			log.info("findByCountryAndCategory");
			findByCountryAndCategory = playerRepository.findByCountryAndCategory(request,country, category);
			
		} else if(!StringUtils.isEmpty(country) ) {
			
			log.info("findByCountry");
			findByCountryAndCategory = playerRepository.findByCountry(request,country);
			
		} else if(!StringUtils.isEmpty(category) ) {
			
			log.info("findByCategory");
			findByCountryAndCategory = playerRepository.findByCategory( request,category);
			
		} else {
			
			log.info("findByBwfRanking");
			findByCountryAndCategory = playerRepository.findByBwfRanking(request).getContent(); // Top 10 overall
		}
		System.out.println("the result is  " + findByCountryAndCategory.size());
		return findByCountryAndCategory;
	}

}
