package com.badmintonInfo.badminton.mongoPojo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("player")
public class MongoPlayer {

	
	private ObjectId id;
	private String name;
	private String url;
	private boolean iconicPlayer;
	
	public MongoPlayer() {
		
	}
	
	public MongoPlayer(String name,String url, boolean iconicPlayer) {
		this.name = name;
		this.url = url;
		this.iconicPlayer = iconicPlayer;
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
		return iconicPlayer;
	}

	public void setIconicPlayer(boolean iconicPlayer) {
		this.iconicPlayer = iconicPlayer;
	}

	public ObjectId getId() {
		return id;
	}


}
