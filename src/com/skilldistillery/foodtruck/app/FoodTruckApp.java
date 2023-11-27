package com.skilldistillery.foodtruck.app;
import com.skilldistillery.foodtruck.entities.FoodTruck;
import java.text.DecimalFormat;
import java.util.Scanner;
public class FoodTruckApp {


	private FoodTruck[] fleet = new FoodTruck[5];
	private int truckCount = 0;
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	        FoodTruckApp app = new FoodTruckApp();
	        app.run();
	    }

	    public void run() {
	    	System.out.println("Welcome to the Food Truck App!");
	    
	        while (truckCount < 5) {
	            System.out.println("\nEnter the name of the food truck (type 'quit' to end):");
	            String name = scanner.nextLine();

	            if (name.equalsIgnoreCase("quit")) {
	                break;
	            }

	            System.out.println("Enter the type of food served:");
	            String foodType = scanner.nextLine();

	            double rating;

	            do {
	                System.out.println("Enter the rating (1.0 - 5.0):");

	                try {
	                    rating = Double.parseDouble(scanner.nextLine());

	                    if (rating < 1 || rating > 5) {
	                        System.out.println("Invalid rating. Please enter a number from 1.0 - 5.0.");
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid input. Please enter a number from 1.0 - 5.0.");
	                    rating = 0;
	                }

	            } while (rating < 1 || rating > 5);

	            fleet[truckCount] = new FoodTruck(name, foodType, rating);
	            truckCount++;
	        }
	        
	        if(truckCount == 0) {
	        	System.out.println("No food trucks entered. Goodbye!");
	        	System.exit(0);
	        }
	        
	        while (true) {
	        	System.out.println();
	    		System.out.println("======================= MENU =====================");
	    		System.out.println("|                                                |");
	    		System.out.println("|   1. List all the Food Trucks                  |");
	    		System.out.println("|   2. The average rating for all Food Trucks    |");
	    		System.out.println("|   3. The highest rated food truck              |");
	    		System.out.println("|   4. Quit                                      |");
	    		System.out.println("|                                                |");
	    		System.out.println("==================================================");
	    		System.out.println();
	    		
	            int choice = Integer.parseInt(scanner.nextLine());

	            switch (choice) {
	                case 1:
	                    listAllFoodTrucks();
	                    break;
	                case 2:
	                    showAverageRating();
	                    break;
	                case 3:
	                    showHighestRatedTruck();
	                    break;
	                case 4:
	                    System.out.println("Goodbye!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private void listAllFoodTrucks() {
	        System.out.println("\nList of Food Trucks: \n");
	        for (int i = 0; i < truckCount; i++) {
	            System.out.println(fleet[i]);
	        }
	    }

	    private void showAverageRating() {
	        if (truckCount == 0) {
	            System.out.println("No food trucks to calculate average rating.");
	            return;
	        }

	        int totalRating = 0;
	        for (int i = 0; i < truckCount; i++) {
	            totalRating += fleet[i].getRating();
	        }

	        double averageRating = (double) totalRating / truckCount;
	        DecimalFormat decimalFormat = new DecimalFormat("#.#");
	        String formattedAverage = decimalFormat.format(averageRating);
	        
	        
	        System.out.println("\nAverage Rating: " + formattedAverage);
	    }

	    private void showHighestRatedTruck() {
	        if (truckCount == 0) {
	            System.out.println("No food trucks to display.");
	            return;
	        }

	        FoodTruck highestRatedTruck = fleet[0];
	        for (int i = 1; i < truckCount; i++) {
	            if (fleet[i].getRating() > highestRatedTruck.getRating()) {
	                highestRatedTruck = fleet[i];
	            }
	        }

	        System.out.println("\nHighest Rated Food Truck:\n\n" + highestRatedTruck);
	    }
	}



