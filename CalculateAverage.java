public class CalculateAverage {
	public static  double average(double []  temperature){
		// calculate the size
		int size=temperature.length;
		// declare total variable to add the temparature values
		double total=0;
		// use for loop to traverse through each element of array
		for(int i=0; i< size;i++){
			total += temperature[i];
		}
		// find the average dividing the total  value by size of array
		double average= total/size;
		return average;
		
	}

	public static void main(String[] args) {
		/*
		 * Another array example (array + loops)
		 */
		// make a array of temperature
		double [] temperature={22.5,45.8,10.1,33.5,17,33};
		System.out.println(" the average value of temperature is:- "+   average(temperature));;
		
		

	}

}

