# FoodTruckProject
created by Ieshia Parker
# Description
This food truck app makes it easy to share the best food trucks around.
Just input the truck's name, type of food, and your rating out of 5. 
Then,you will find out which truck is rated the highest and see the average rating for all trucks.
# Tech Used
I used Eclipse for the java code and README.
Google, previous lessons and our zoom recordings for the codes.
# Lessons Learned

The starter code the instructor provided was helpful.
Also, the group project was beneficial because I mostly mirrored it.
Especially, in the FoodTruck blueprint. 

I had run into my most trouble with the rating.
I used a Do-while Loop which has a try-catch statement inside.
This loop gets the user input and check for potential errors.
I accidently put the a word thats how I even caught I needed to fix this issue.
It would break the code. 

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

	            

This code checks to see if the entered numbers are not between 1.0 - 5.0.
It also checks for if you enter text that is not a number.
The statement will loop as long as the condition is true.

For some reason I had trouble with the scanner, I never ran in this issue and I fixed the issue using this code.
It was skipping the previous questions. I found a code that helps with this.

	rating = Double.parseDouble(scanner.nextLine());

It converts the input from a string to a double.

To create a new 'FoodTruck' object with the entered details and adds it to the 'fleet' array.

	fleet[truckCount] = new FoodTruck(name, foodType, rating);
	truckCount++;
  
There was an if statement was added if the user decided to quit without entering any trucks in.

	 if(truckCount == 0) {
		        	System.out.println("No food trucks entered. Goodbye!");
		        	System.exit(0);
  
I created a switch statement for the menu. I referred to previous work to help with this.

I created 3 private methods that is reference for the switch statement.



