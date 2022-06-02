package com.syntax.class04;

import java.util.Scanner;

public class HWScanner {

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
		
		/* HW using Scanner
		 * 1. Create a Java program in which using Scanner you are going
		 *     to capture user's first name, last name, and state where 
		 *     s/he lives.
		 */
		
			Scanner input = new Scanner(System.in);	//Create a Scanner object
		
			// Send instructions to the console requesting user to enter their first name
			System.out.println("Please enter your first name");	
			// We need to grab from the console the first name entered by the user
			// To read number Strings we use next()
			String firstName = input.next();  	// After you type your name hit enter
			// System.out.println(firstName);	// commented out 5/9/22 after submitting	
			
			// Send instructions to the console requesting user to enter their surname 
			System.out.println("Please enter your last name");
			// We need to grab from the console the users last name
			String lastName = input.next();
			// System.out.println(lastName); 	// commented out 5/9/22 after submitting
			
			// Send instructions to the console requesting user enter the state they reside in 
			System.out.println("Please enter the State you reside in");
			// We need to grab from the console the State the user resides in
			String state = input.next();
			// System.out.println(state);	// commented out 5/9/22 after submitting
			}
		}