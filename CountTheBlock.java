public class CountTheBlocks {
	/*
	 * Find the number of blocks required to build a pyramid made up of that many levels.
	 */

	public static void main(String[] args) {
		 int total=0;
		 for(int i=1; i <=3; i++){ // 3 is number of levels 
		    total= total + (i*i);	
		     
		 }
		System.out.println(total); 
		    
		}

	}


