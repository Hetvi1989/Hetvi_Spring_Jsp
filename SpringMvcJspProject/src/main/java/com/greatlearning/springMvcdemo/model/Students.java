package com.greatlearning.springMvcdemo.model;

public class Students {
	
	 String Id;
	 String Name;
	 int score;
	
	
	public Students() {
		super();
	}


	public Students(String id, String name, int score) {
		super();
		this.Id = id;
		this.Name = name;
		this.score = score;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Students [Id=" + Id + ", Name=" + Name + ", score=" + score + "]";
	}
	

}
