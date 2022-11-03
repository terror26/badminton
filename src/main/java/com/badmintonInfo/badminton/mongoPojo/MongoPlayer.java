package com.badmintonInfo.badminton.mongoPojo;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("player")
public class MongoPlayer {

	
	@BsonProperty(value= "_id")
	private ObjectId id;
	private String name;
	private String country;
	private String category;
	private String url;
	private boolean iconicPlayer;
	private int bwfRanking;
	
	public MongoPlayer() {
		super();
	}
	
	
	
	
	public MongoPlayer(ObjectId id, String name, String country, String category, String url, boolean iconicPlayer,
			int bwfRanking) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.category = category;
		this.url = url;
		this.iconicPlayer = iconicPlayer;
		this.bwfRanking = bwfRanking;
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

	public int getBwfRanking() {
		return bwfRanking;
	}

	public void setBwfRanking(int bwfRanking) {
		this.bwfRanking = bwfRanking;
	}

}
