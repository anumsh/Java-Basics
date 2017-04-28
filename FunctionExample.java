public class FunctionExample {
	/*
	 * public: it is access specifier , any one access this function.
	 * static: no need to create object in order to execute this function.
	 * void: no return type is needed.
	 * Lyrics- function name
	 * without parameters.
	 */
	public static void Lyrics(){		// function declaration
		System.out.println("Hello Darkness , my old friend");
		System.out.println("I have come to tallk with you");
		System.out.println("because the vision softly creeping");
		System.out.println("Lefts its seeds while I was sleeping");
	}

	public static void main(String[] args) {
		/*
		 * This is simple function example in java.
		 * 
		 * Functions are organized and group code in block.
		 * It perform the specific task.
		 * 
		 * Function definition:
		 * 1. contains the code that function execute
		 * 2. calling the function is same as executing the  code in the definition.
		 * 
		 */
			Lyrics(); //  calling the function

	}

}

