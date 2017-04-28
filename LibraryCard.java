public class LibraryCard {

	public static void main(String[] args) {
		/* here I am focusing on if, else and if-else statement .
		 * these are decision making statements.
		 * The librarian have to issue the library card .
		 * so she will check the 3 things password or birth certificate  or driving license.
		 * if any of these is valid , she will issue the card.
		 * else she will denied to issue the card.
		 *  these are decision making statements.
		 */
		boolean passport= false;
		boolean birthCertificate= true;
		boolean drivingLicence=true;
		if (passport){
			System.out.println("A password is the valid ID");
		}
		else if (birthCertificate) {
			System.out.println("A birth cerificate is a valid ID");
		}
		else if (drivingLicence) {
			System.out.println("A driving licence is a valid ID");
		}
		else  {
			System.out.println("Invalid ID! the application is denied");
		}

	}

}

