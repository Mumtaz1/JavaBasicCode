package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

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
		 * You are DMV representative and you need to ask the customer
		 * their age. If they are 18 and older you will issue them a drivers
		 * license, otherwise you will offer them to a learners permit
		 */
		
		Scanner scan = new Scanner(System.in);	//Create a Scanner object
		
		System.out.println("Please enter your age");
		int age = scan.nextInt();  // capture int

		if (age >= 18) {
			System.out.println("We will issue you a drivers license");
		} else {
			System.out.println("We will provide you with a learners permit");
		}
	}
}
