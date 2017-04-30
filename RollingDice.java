public class KeepRolling {
	public static int roll() {   
		//random number from 0 to almost 1
	double randomNumber=Math.random();
	//change range from 0 to almost 6
	randomNumber=randomNumber * 6;
	//shift range upto one
	randomNumber=randomNumber + 1;
	//cast to integer(ignore decimal part)
	int randomInt= (int) randomNumber;
	return randomInt;
	}

	public static void main(String[] args) {
		 int dice1=roll();
		 int dice2=roll();
		 int count=1 ; // keep track of number of roles
		 System.out.println("dice1 value " +dice1);
		 System.out.println("dice2 value " +dice2);
		 while(!(dice1==dice2)) {
			 // recroll the dice if dice1 is not equal to dice2
			 dice1=roll();
			 dice2=roll();
			 count=count+1;	 
			 System.out.println("after rollong again " +dice1);
			 System.out.println("after rollong again " + dice2);
			 if (dice1 == dice2){
				 System.out.println("values of dice1 and dice2 are equal");
			 }
		 }
		 

	}

}
