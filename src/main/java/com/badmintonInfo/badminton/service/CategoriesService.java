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
	public CategoriesService(CategoryRepository categoryRepository, PlayerRepository playerRepository) {
		this.categoryRepository = categoryRepository;
		this.playerRepository = playerRepository;
	}

	public CategoryData getCategoryData(String category) {
		Pageable request = PageRequest.of(0, 2, Sort.Direction.DESC, "bwfRanking");

		List<MongoCategory> mongoRepo = categoryRepository.findAll();
		List<MongoPlayer> mongoPlayers = new ArrayList<>();
		if (StringUtils.isEmpty(category)) {
			mongoPlayers = playerRepository.findByIconicPlayerIsTrue(request); // iconicPlayers
		} else {
			mongoPlayers = playerRepository.findByIconicPlayerIsTrueAndCategory(request, category); // iconicPlayers
		}

		List<Category> categories = mongoRepo.stream().map(r -> new Category(r)).collect(Collectors.toList());
		List<Player> iconicPlayers = mongoPlayers.stream().map(r -> new Player(r)).collect(Collectors.toList());
		return new CategoryData(categories, iconicPlayers);
	}

}
