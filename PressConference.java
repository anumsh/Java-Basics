import java.util.Arrays;

public class PressConference {

	public static void main(String[] args) {
		/*
		 * This is example of ARRAY in java.
		 * So , we have press conference in some oragnisation.
		 * and the CEO have to give answers of different new channels like ABC, FOX etc
		 * So we will create an array of newsOutlets to store all the new channels name.
		 * 
		 */
		String [] newsOutlet={"abc","bbc","CNN","CBS","AP","NBC","FOX","sky","Alzazeera","npr"};
		// print array of newsOutlet
		System.out.println(Arrays.toString(newsOutlet));
		
		// find the length of array
		int arrayLength= newsOutlet.length;
		System.out.println(" The length of array is :- "+arrayLength);
		double lucky=Math.random();   // suppose lucky=0.423
		// multiply by 10 to get fractional number between 0-9
		lucky *= 10;                  // and lucky*10=4.23
		//cast the integer to get an integer number between 0-9
		int luckyIndex=(int) lucky;      //so, luckyIndex=4 (after converting into int)
		System.out.println("the lucky news channel(index number) to ask questions from CEO :- "+ luckyIndex);
		
		// random we pick the news channels speaker to ask the questions from CEO
		System.out.println(newsOutlet[luckyIndex]);
		
		
		

	}

}

