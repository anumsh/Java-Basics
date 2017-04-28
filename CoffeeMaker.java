public class CoffeeMaker {

	public static void main(String[] args) {
		/*
		 * This is example of switch statement.
		 * CoffeeMaker will make the coffee your the people of specific type 
		 * according to passcode provided by people.
		 * break statement helps us to go out of loop without executing next statements.
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
