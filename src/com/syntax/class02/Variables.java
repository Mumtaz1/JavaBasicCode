package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program and name it Variables
		 * a) In your program create different types of variables to
		 *     store student's information (name, last name, grade,
		 *     city, state, phone number) and then print value of
		 *     those variables in the format
		 *     My name is _ and my last name is _
		 *     I am A/B student
		 *     I live in city _ and state _
		 *     And my phone number is ...
		 *  
		 */
		String firstName = "Mumtaz";
		String lastName = "Ahmed";
		char grade = 'B';
		String city = "San Francisco";
		String state = "CA";
		long phoneNumber = 1234567890L;
		
		System.out.println("My name is "  + firstName + " and my last name is " + lastName );
		System.out.println("I am" + grade + "student");
		System.out.println("I live in city " + city +  " and state is " + state);
		System.out.println("And my phone number is " + phoneNumber);
				
		/*
		 * b) Change student's city, state, phone number and grade. And print 
		 * those updated values:
		 * Example:
		 * My name is _ and I moved to new city _ and new state_. My new
		 * phone number is _
		 */
		city = "Phoneix";
		state = "AZ";
		phoneNumber =2345678901L;
		grade = 'A';
		System.out.println("My name is "  + firstName + " and I moved to new city " 
		+ city + " and new state " + state + ". My new phone number is "+ phoneNumber);
		
		// Or you can type the print statements as per below. Note first two lines are print, last line is println
		System.out.print("My name is "  + firstName + " and I moved to new city " + city);
		System.out.print(" and new state " + state);
		System.out.println(". My new phone number is "+ phoneNumber);
	}

}
