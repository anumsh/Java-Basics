public class PrintPhoto {
	public static void printPic(int height, int width, boolean inColor) {
		System.out.println("width is "+ width + "cm");
		System.out.println("height is " + height + "cm");
		if(inColor) {
			System.out.println("print is full color \n");
		}
		else {
			System.out.println("print is black and white \n ");
		}
		
		
	}

	public static void main(String[] args) {
		/*  multiple parameters example*/
			printPic(12,5,true);
			printPic(23,15,false);
	}

}

