public class WeatherInterpreter {
	/* function argument example
	*/
	
	public static void weather(int temperature) {   		// temperature is parameter
		if(temperature > 30){
			System.out.println("it's hot outside");
		}
		else if(temperature < 5){
			System.out.println("its very cold");
		}
		else {
			System.out.println("not too hot, not too  cold");
		}
	}

	public static void main(String[] args) {
		
			weather(40);  //   40, 4,23 are the arguments. calling weather() function.
			weather(4);
			weather(23);
	}

}
