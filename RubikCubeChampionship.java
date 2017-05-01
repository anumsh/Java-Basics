public class RubikCubeChampionship {
	/*
	 * @param speed array of speed
	 * @return double the fastest speed found
	 */
	public static double speed(double [] speed){
		int size=speed.length;
		double min=speed[0];
		for (int i=1; i<size;i++){
			if (speed[i]<min){
				min=speed[i];
				
			}
		}
		return min;
		
	}
	public static void main(String[] args) {
		/*
		 * searches the array of speed
		 * for the fastest (smallest) value.
		 * This is array search example.
		 */
		double [] speed={7.85,7.23,4.9,6.22,5.4,7.3,5.13};
		System.out.println("the fastest  speed found : " +speed(speed));

	}

}

