package com.syntax.class04;

import java.util.Scanner;  // Import the Scanner class

public class UserInput {

	public static void main(String[] args) {
	
		/* The Scanner class is used to get user input, and it is found in the 
		 * java.util package.
		 * The Scanner class is used for reading in primitive data types
		 * like int, double, float, etc., and objects of type String.
		 * - To read strings, we use next()
		 * - To read sentences, we use nextLine()
		 * - To read number values, we use nextInt()
		 * - To read decimal number, we use nextDouble()
		 * - To read a single character, we use next().charAt(0)
		 */
	Scanner input = new Scanner(System.in);	//Create a Scanner object
	
	// Send instructions to the console
	System.out.println("Please enter your name");	//Please enter your name. When you type your name it prints out line 21
	
	// We need to grab from the console the value entered by the user
	// To read Strings we use .next()
	String name = input.next();  	// After you type the value hit enter
	System.out.println(name);		//Mumtaz
	
	// Let's send instructions 
	System.out.println(name + " please enter your age");
	
	// Need to capture and store age
	int age = input.nextInt();
	System.out.println(name + " is " + age + " years old");
	}

}

