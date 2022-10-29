package com.badmintonInfo.badminton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badmintonInfo.badminton.pojo.Category;
import com.badmintonInfo.badminton.service.CategoriesService;

@RestController
public class CategoriesController {
	
	private final CategoriesService categoryService;
	
	@Autowired
	public CategoriesController(CategoriesService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/categories")
	public List<Category> getCategories() {
		return categoryService.getCategories();
	}
	
}
