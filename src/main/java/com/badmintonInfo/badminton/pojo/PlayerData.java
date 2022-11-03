package com.badmintonInfo.badminton.pojo;

import java.util.List;

public class PlayerData {
	private List<Player> players;
	
	public PlayerData() {
	}
	
	public PlayerData(List<Player> players) {
		this.players = players;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	
}
