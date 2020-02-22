package emailApp;

public class emailApp {

	public static void main(String [] args) {
		
		// create email user account objects
		Email userOne = new Email("Shahzada", "Shah");
		System.out.println(userOne.showInfo());
		
		// optional 2nd user created for program (uncomment to test) 
		// Email userTwo = new Email("Tanzeel", "Saeed");
		// System.out.println(userTwo.showInfo());
		
	}
	
}
