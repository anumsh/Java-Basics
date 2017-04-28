public class CoffeeMaker {

	public static void main(String[] args) {
		/*
		 * This is example of switch statement.
		 * 
		 * CoffeeMaker will make the coffee for  the people of specific type 
		 * according to passcode provided by people.
		 * 
		 * 
		 *After this code is this word break; which will break out of the case code 
		 *and go to the ending curly brace of the switch statement, 
		 *where this code prints the value of coffeeType.
		 *So the break ensures that only one case at a time will have it’s code executed.
		 *If the break were not included, Java would continue reading code in the
		 * switch statement line by line and keep executing statements 
		 * (like the default case code) until it reaches the end of the
		 *  switch statement or hits another break!
		 *  
		 *  
		 *  The default case typically comes at the end of a switch statement and 
		 *  its code will execute whenever the other cases aren’t met.
		 *  So, if the passcode was something like 914, 
		 *  this code doesn’t have a case for this particular value,
		 *  and so it would fall into the default category and 
		 *  the coffeeType String would be set to “Unknown".

		 */
		int passcode=444;
		String coffeeType;
		switch(passcode){
			case(232): coffeeType="Espresso";
				break;		// it use to go out of this loop and print coffee type if passcode is 232. 
			case(347): coffeeType="Vanilla Lette";
				break;
			case(444): coffeeType="Drip Coffee";
				break;
			case(678): coffeeType="Cold Coffee";
				break;
			case (757):
			case (7439):  // it is execute default case, no coffeeType is specified here.(Unknown) will be the answer
			default:
				coffeeType="Unknown";
				
		}
		System.out.println(coffeeType);

	}

}

