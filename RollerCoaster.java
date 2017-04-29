public class RollerCoaster {
	public static void admission(double height){
		if(height > 120){
			System.out.println("you pass the height requirement");
		}
		else {
			System.out.println("you donot pass");
		}
		
	}

	public static void main(String[] args) {
		/* 
		 * function checks eligibility to ride a rollercoaster, and 
		 * requires that a person input their height in cm.
		 * admission(130.5); is a valid function call.
		 * 
		 * 
		 * */
		double height=130.5; // variable parameter
		admission(height);
		

	}

}

