package com.syntax.class04;

import java.util.Scanner;

public class HWScanner2 {

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
			
		/* HW 2.
		 * Create a Java program in which using Scanner you are
		 * going to capture 2 numbers. And once you capture
		 * 2 numbers, please check which one is the largest.
		 */
		
			Scanner input = new Scanner(System.in);	//Create a Scanner object
		
			// Send instructions to the console requesting user enter a number
			System.out.println("Please enter a number");	
			// We need to grab from the console the first number entered by the user
			// To read number numbers we use nextInt()
			int num1 = input.nextInt();  	// After you type a number hit enter
			// System.out.println(num1);		// commented out on 5/9/22 after submitting	
			
			// Send instructions to the console requesting user to enter a 2nd number
			System.out.println("Please enter another number");
			// We need to grab from the console the users last name
			int num2 = input.nextInt();
			// System.out.println(num2);	// commented out on 5/9/22 after submitting
		
			if (num1 > num2) {
				System.out.println("The 1st number you entered " + num1 + " is greater than the 2nd number " + num2);
			} else {
				System.out.println(("The 1st number you entered " + num1 + " is smaller than the 2nd number " + num2));
			}
		}
	}
