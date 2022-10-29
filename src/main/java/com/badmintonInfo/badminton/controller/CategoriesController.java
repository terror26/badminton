package com.badmintonInfo.badminton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badmintonInfo.badminton.pojo.Category;
import com.badmintonInfo.badminton.pojo.CategoryData;
import com.badmintonInfo.badminton.service.CategoriesService;

@RestController
public class CategoriesController {
	
	private final CategoriesService categoryService;
	
	@Autowired
	public CategoriesController(CategoriesService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/categories")
	public CategoryData getCategories() {
		return categoryService.getCategoryData();
	}
}
