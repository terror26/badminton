package com.badmintonInfo.badminton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.badmintonInfo.badminton.pojo.PlayerData;
import com.badmintonInfo.badminton.service.PlayerService;

@RestController
@RequestMapping("players")
public class PlayerController {

	private final PlayerService playerService;
	
	@Autowired
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}
	
	@GetMapping()
	public PlayerData getPlayers(@RequestParam(required= false) String country, @RequestParam(required= false)  String category) {
		return playerService.getPlayers(country, category);
	}	
}
