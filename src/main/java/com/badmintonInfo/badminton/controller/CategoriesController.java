package com.badmintonInfo.badminton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@GetMapping(value = { "/categories", "/categories/{category}" })
	public CategoryData getCategories(@PathVariable(required = false) String category) {
		return categoryService.getCategoryData(category);
	}

}
