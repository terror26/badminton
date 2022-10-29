package com.badmintonInfo.badminton.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badmintonInfo.badminton.mongoPojo.MongoCategory;
import com.badmintonInfo.badminton.pojo.Category;
import com.badmintonInfo.badminton.repository.CategoryRepository;

@Service
public class CategoriesService {
	
	private final CategoryRepository categoryRepository;
	
	@Autowired
	public CategoriesService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> getCategories() {
		List<MongoCategory> mongoRepo = categoryRepository.findAll();
		System.out.println("error after this convertion");
		return mongoRepo.stream().map(r -> new Category(r)).collect(Collectors.toList());
	}
	
}
