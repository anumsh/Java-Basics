public class Yahtzee {
	/*
	 * Yahtzee Game ( in this game all the random values of 5 dices are same - dice1 , dice2, dice3 , dice4 and dice5)
	 */
	
	public static int rollDice() {   
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


public static int keepRolling() 
{
    int dice1 = rollDice();
    int dice2 = rollDice();
    int dice3 = rollDice();
    int dice4 = rollDice();
    int dice5 = rollDice();
    int count = 1;
    while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4  && dice4 == dice5)) {
        //we need to re-roll
        dice1 = rollDice();
        dice2 = rollDice();
        dice3 = rollDice();
        dice4 = rollDice();
        dice5 = rollDice();
        count = count + 1;
    }
    return count;
}


	public static void main(String[] args) {
		System.out.println("after "+keepRolling() + "  times,the random values of dice1, dice2, dice3, dice4 and dice5 are equal");

	}

}

