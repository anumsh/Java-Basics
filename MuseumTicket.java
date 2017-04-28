public class MuseumTicket {
	/*
	 * This is example of ticket to the museum.
	 * there are discount on ticket on your age and student .
	 * here is conditions:
	 * if age less than and equal to 15 , ticket price will be $5.
	 * if age is greater than 60 , ticket price will be $5.
	 * if you are a student , ticket price will be $5.
	 * else, you have to pay $10 for museum ticket.
	 */
	public static void main(String[] args) {
		int ticketPrice=10;
		int age= 22;
		boolean isStudent=false;
		if (age <= 15) {
			ticketPrice=5;
			//System.out.println(ticketPrice);
		}
		else if (age > 60){
			ticketPrice=5;
			//System.out.println(ticketPrice);
		}
		else if (isStudent){
		ticketPrice=5;
		//System.out.println(ticketPrice);
	}
		else {
			//System.out.println(ticketPrice);
		}
		System.out.println(ticketPrice);
	}

}
