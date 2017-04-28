public class RestaurantRating {
	/*
	 * This is example of logical operators &&, || and ! (AND , OR , NOT)
	 *  first check if the rating is valid input (1 to 5).
	 *  then check  if the rating is less than 2, print the result.
	 * else it is good restaurant.
	 */

	public static void main(String[] args) {
		int rating=2; // current rating
		if(rating >=1 && rating <= 5) {   // checking the rating range
			if (rating <=2){  // check another condition if rating is less than equal to 2
				System.out.println("What is the reason for your low rating");
			}
		}
		System.out.println("thanks for your feedback"); //else it will print this message
		

	}

}
