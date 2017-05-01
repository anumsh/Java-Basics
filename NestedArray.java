public class NestedArray {

	public static void main(String[] args) {
		/*
		 * Nested Array Example
		 * it works like this:
		 * 
		 * 			i		j			output
				----------------------------------------------------
		 * 			0		0			hello
		 * 					1			hello
		 * 					2			hello
		 * 					3			
		 * 			1		0			hello
		 * 					1			hello
		 * 					2			hello
		 * 					3
		 * 			2		0			hello
		 * 					1			hello
		 * 					2			hello
		 * 					3	
		 * 			3
		 * 
		 */
		for (int row=0; row< 3; row ++){  // outer loop 
			for (int col=0;col<3;col++){  // inner loop
				System.out.println("hello"); // It will print 9(3*3)  times "hello"   
			}
		}

	}

}

