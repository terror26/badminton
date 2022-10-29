package com.badmintonInfo.badminton.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badmintonInfo.badminton.mongoPojo.MongoCategory;
import com.badmintonInfo.badminton.mongoPojo.MongoPlayer;
import com.badmintonInfo.badminton.pojo.Category;
import com.badmintonInfo.badminton.pojo.CategoryData;
import com.badmintonInfo.badminton.pojo.Player;
import com.badmintonInfo.badminton.repository.CategoryRepository;
import com.badmintonInfo.badminton.repository.PlayerRepository;

@Service
public class CategoriesService {
	
	private final CategoryRepository categoryRepository;
	private final PlayerRepository playerRepository;

	
	@Autowired
	public CategoriesService(CategoryRepository categoryRepository , PlayerRepository playerRepository) {
		this.categoryRepository = categoryRepository;
		this.playerRepository = playerRepository;
	}
	
	public CategoryData getCategoryData() {
		List<MongoCategory> mongoRepo = categoryRepository.findAll();
		List<MongoPlayer> mongoPlayers = playerRepository.findByIconicPlayerIsTrue(); // iconicPlayers
		
		List<Category> categories = mongoRepo.stream().map(r -> new Category(r)).collect(Collectors.toList());
		List<Player> iconicPlayers = mongoPlayers.stream().map(r -> new Player(r)).collect(Collectors.toList());
		return new CategoryData(categories, iconicPlayers);
	}
	
}
