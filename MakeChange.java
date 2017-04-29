public class MakeChange {
	
	/* return type  example   
	 * function to return the correct change. 
	*/
	
	public static double change(double itemCost, double dollorsProvided){
		double change;
		change= dollorsProvided - itemCost;
		return change;
	}

	public static void main(String[] args) {
		System.out.println(change(3.56,5.88));    

	}

}
