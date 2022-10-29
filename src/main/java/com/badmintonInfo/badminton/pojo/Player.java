package com.badmintonInfo.badminton.pojo;

import com.badmintonInfo.badminton.mongoPojo.MongoPlayer;

public class Player {

	private String name;
	private String url;
	private boolean isIconicPlayer;
	
	public Player() {
		
	}
	
public Player(MongoPlayer player) {
		this.name = player.getName();
		this.url = player.getUrl();
		this.isIconicPlayer = player.isIconicPlayer();
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
	
	
}
