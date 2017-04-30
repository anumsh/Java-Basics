public class Googol {

	public static void main(String[] args) {
		String googol="1";
		int len=googol.length();
		System.out.println(len);
		while(len <101){
			googol=googol + "0";
			len=googol.length();
		}
	}

}

