package com.skilldistillery.foodtruck.entities;

public class FoodTruck {

	private int nextTruckId = 1;
	
	private int truckId;
	private String name;
	private String foodType;
	private double rating;
	
	public FoodTruck() {
	
}
	public FoodTruck(String name, String foodType, double rating) {
		this.truckId = nextTruckId++;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}
	
	public int getTruckId() {
		return truckId;
	}
	public void setTruckId(int truckId) {
		this.truckId = truckId;
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String toString() {
		String output = "Name: " + name + "\n" + "Food Type: " + foodType + "\n" + "Rating: " + rating + "\n";
		return output;
	}
	
}
