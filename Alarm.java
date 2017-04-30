
public class Alarm {
	/*
	 *while loop example .  
	 * while loops allow you to repeat
	 * an if condition over and over for as long as that condition remains true,
	 * hence the name while!
	 */
	
	//  beep function
	public static String beep(){
		return  ("Beep Beep" ) ;
	}
	
	// @return true if alarm is on , false if off.
	public static boolean checkAlarm(){
		 return true;
	}

	public static void main(String[] args) {
		
		boolean on=checkAlarm();
		while(on){					// if true , beep the alarm until checkAlarm is not equal to false.
			System.out.println(beep());
			on=checkAlarm();
		}
		

	}

}
