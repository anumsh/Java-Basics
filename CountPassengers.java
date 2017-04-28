package com.anum.practice.basics;
/* This is simple java program to start your bus with no passengers,
 *  when bus stops at various bus-stop 
 *  passengers are get into bus and some are get out of the bus
 *  Once the  bus reach at final bus-stop , print the passengers that are
 *  left in bus.
 */
public class CountPassengers {

	public static void main(String[] args) {
		// no passengers in bus. 0 is assigned to passengers variable.
		int passengers   // declaring the variable
		passengers=0;   // initialising the variable passengers
		/* 5 passengers get into the bus. 5 is added into passengers variable.
		     and assign to passengers variable again.
		     java start calculating from right --> left . 
		    So there should always one variable in left side.
		*/
		passengers=passengers +5;      // updating the passengers value by adding 5 in it. passengers=5
		// 3 passenegers get out from bus .
		passengers=passengers -3;		// substracting 3 from updated value of passengers (5-3)=2
		// 1 passenger is out and 5 passengers are gt into the bus
		passengers=passengers -1 +5;
		// print the number of passengers left in bus.
		System.out.println(passengers);  // it will print 6.

	}

}
