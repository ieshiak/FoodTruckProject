package com.skilldistillery.foodtruck.entities;

public class FoodTruck {

	private String name;
	private String foodType;
	private int rating;
	
	public FoodTruck() {
	
}
	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String toString() {
		String output = "Name: " + name + "\n" + "Food Type: " + foodType + "\n" + "Rating: " + rating;
		return output;
	}
	
}
