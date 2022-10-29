package com.badmintonInfo.badminton.pojo;

import com.badmintonInfo.badminton.mongoPojo.MongoCategory;

public class Category {
	
	private int id ; 
	private String name;
	
	public Category() {}
	
	public Category(MongoCategory mongoCategory) {
		this.id = (int) (Math.random()*100+1);
		this.name = mongoCategory.getName();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
