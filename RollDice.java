public class RollDice {
	/*  random number example */
	
	public static int roll(int sides) {   // random roll parameter
		//random number from 0 to almost 1
	double randomNumber=Math.random();
	//change range from 0 to almost 6
	randomNumber=randomNumber * sides;
	//shift range upto one
	randomNumber=randomNumber + 1;
	//cast to integer(ignore decimal part)
	int randomInt= (int) randomNumber;
	return randomInt;
	}

	public static void main(String[] args) {
		System.out.println(roll(8));

	}

}

