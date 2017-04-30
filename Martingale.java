public class Martingale {
	
	public static boolean play(){
		return true;
	}

	public static void main(String[] args) {
		/*
		 * Break statement example.
		 * It is the Martingale betting system .
		 * You can only keep doubling your bet until you blow through your entire bankroll, and then you're stuck. 
		 */
		//first initialise the money you have($1000), the target amount you want to win($1200) and bet money ($10)
		int money = 1000;
		 int target = 1200;
		 int bet = 10;
		 // check if  $1000 > $10
		 while (money > bet)
		 {
		  boolean win = play(); // if  you win , then add $10 into your $1000=$1010
		  if (win) 
		  {
		   money += bet;
		   bet = 10;
		  } else
		  {
		   money -= bet;   // else substract it from $1000 and double the bet amount=$20
		   bet *= 2;
		  }
		  if(money >= target)  // check if the $1000 > $1200 , if yes then stop playing
		  {
		      break;
		  }

		 }
		 System.out.println(money); // print the amount
		}

}
