package com.badmintonInfo.badminton.pojo;

import com.badmintonInfo.badminton.mongoPojo.MongoPlayer;

public class Player {

	private String name;
	private String country;
	private String category;
	private String url;
	private boolean isIconicPlayer;
	private int bwfRanking;
	
	public Player() {
		
	}
	
public Player(MongoPlayer player) {
		this.name = player.getName();
		this.url = player.getUrl();
		this.isIconicPlayer = player.isIconicPlayer();
		this.country = player.getCountry();
		this.category = player.getCategory();
		this.bwfRanking = player.getBwfRanking();
	}
	
	public Player(String name,String url, boolean isIconicPlayer) {
		this.name = name;
		this.url = url;
		this.isIconicPlayer = isIconicPlayer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isIconicPlayer() {
		return isIconicPlayer;
	}

	public void setIconicPlayer(boolean isIconicPlayer) {
		this.isIconicPlayer = isIconicPlayer;
	}

	public int getBwfRanking() {
		return bwfRanking;
	}

	public void setBwfRanking(int bwfRanking) {
		this.bwfRanking = bwfRanking;
	}
	
	
	
}
