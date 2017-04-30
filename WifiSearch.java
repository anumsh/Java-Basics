public class WifiSearch {
	/*
	 * This is break statement example.
	 */
	public static boolean checkWifi() {
		return  true;
	}

	public static void main(String[] args) {
		for (int i=1 ; i<=10 ; i++){
			boolean wifiAvailable= checkWifi();
			if(wifiAvailable) {
				System.out.println(i);
				System.out.println("wifi found");
				break;  //  break helps to go out of loop once condition met.

			}
			System.out.println("no wifi found");
		}

	}

}
