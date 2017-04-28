public class RememberStops {

	public static void main(String[] args) {
		// decalaring variables of integer type
		int stops;
		int fare;
		// initialiasing variables
		stops=0;
		fare=0;
		// first stop
		stops= stops + 1;
		// fare collected at stop-1 = 5
		fare=fare+5;
		//next stop
		stops=stops+1;
		// fare collected = 3 in this stop 
		fare=fare+3;
		// next stop
		stops=stops +1;
		// fare collected in next stop : 7
		fare=fare+7;
		// total stops
		System.out.println(stops);
		//total fare
		System.out.println(fare);
		
		
	}

}

