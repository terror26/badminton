package com.badmintonInfo.badminton.pojo;

import java.util.List;

public class CategoryData {

	private List<Category> data;
	private List<Player> iconicPlayers;
	
	public CategoryData() {};
	
	public CategoryData(List<Category> categories, List<Player> iconicPlayers) {
		this.data = categories;
		this.iconicPlayers = iconicPlayers; 
	};
	
	
	
	public List<Category> getData() {
		return data;
	}
	public void setData(List<Category> data) {
		this.data = data;
	}
	public List<Player> getIconicPlayer() {
		return iconicPlayers;
	}
	public void setIconicPlayer(List<Player> iconicPlayers) {
		this.iconicPlayers = iconicPlayers;
	}
	
	
}
