package com.badmintonInfo.badminton.mongoPojo;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("category")
public class MongoCategory {

	@BsonProperty(value= "_id")
	private ObjectId id;
	
	private String name;
	
	@BsonProperty(value= "_class")
	private String classV;

	public MongoCategory() {}
	
	public MongoCategory(ObjectId id, String name) {
        this.id = id;
        this.name = name;
    }

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassV() {
		return classV;
	}

	public void setClassV(String classV) {
		this.classV = classV;
	}
	
}
