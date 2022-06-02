package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

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
		
		/*
		 * Prompt the user to enter a persons height in inches. Person should be
		 * classified as one of the following:
		 *  - short (under 60 inch)
		 *  - medium (between 60 - 72 inches)
		 *  - tall (over 72 inch)
		 */
		
		Scanner scan = new Scanner(System.in);	//Create a Scanner object
		
		System.out.println("Please enter height in inches");
		double height = scan.nextDouble();  // capture double
		
		if (height < 60) {
			System.out.println("You are short");
		} else if (height >= 60 && height <= 72) {
			System.out.println("You are off medium height");
		} else if (height > 72) {
			System.out.println("You are tall");
		}
	}
}	 
