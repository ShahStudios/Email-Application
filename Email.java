package emailApp;

import java.util.Scanner;

public class Email {
	
	// declare some private variables
	private String firstName, lastName, password, department, email, alternateEmail, companySuffix = "shahstudios.com";
	private int mailboxCapacity=500, defaultPassword=12;
	
	// constructor: receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("-------------------------------------------------" +
				"\r\n" + "Welcome " + lastName + ".");
	
		// call setDepartment method
		this.department = setDepartment();
		System.out.println(this.department);
		
		// generate company email
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + companySuffix;
		// System.out.println("\r\n" + "Email address generated: " + email);
		
		// call randomPassword method 
		this.password = randomPassword(defaultPassword);
		// System.out.println("Email password generated: " + password + "\r\n");
		
	}
	
	
	// method: will ask user to pick what department they are in
	private String setDepartment() {
		System.out.print("\r\n" +  " Department Numbers:" + "\r\n"
				+ "  1: Sales" + "\r\n" + "  2: Development" + "\r\n" 
				+ "  3: Accounting" + "\r\n" +  "  0: None of the above"
				+ "\r\n" + "\r\n" + "Please enter what department number you are in: ");
		
		// take user input and based off that return message
		Scanner input = new Scanner(System.in);
		int departmentChoice = input.nextInt();
			if (departmentChoice == 1) {
				return "You have chosen the department for sales";
			} else if (departmentChoice == 2) {
				return "You have chosen the department for developement";
			} else if (departmentChoice == 3) {
				return "You have chosen the department for accounting";
			} else { 
				System.out.println("\r\n" + "You have chosen none of the above or an invalid input." + "\r\n" 
			+ "Please contact: shahstudios@support.com");
				System.exit(0); 
			}
			return "";
	}
	
	// method: generate a password for the user
	private String randomPassword(int length) {
		// string that holds a bunch of characters that will generate the password with
		String passwordArraySet = "ABCDEFGHIJKLMNOPQRSTUVWXYNZ123456789!@#$%";
		// create a array that will look and generate a password that will randomly select out of the passwordArraySet
		// then it will return a new string with whatever password it generates using that passwordArraySet
		char[] password = new char[length];
			for (int i = 0; i<length; i++) {
				int rand = (int) (Math.random() * passwordArraySet.length());
				password[i] = passwordArraySet.charAt(rand);
			}
			return new String(password);
	}
	
	
	// set method: put a mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// set method: set a alternate email 
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// set method: let user change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	
	// get methods below
	public int getMailCapacity() {
		return mailboxCapacity; 
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	
	
	// show all information about user
	public String showInfo() {
		return "\r\n" + "Employee Information: " + "\r\n" + 
				"Full name: " + firstName + " " + lastName +
				"\r\n" + "Company email: " + email + "\r\n" +
				"Email password: " + password + "\r\n" +
				"Email maxbox capacity: " + mailboxCapacity + "mb" + "\r\n" +
				"-------------------------------------------------" + "\r\n" + "\r\n";
	}
	
	
}