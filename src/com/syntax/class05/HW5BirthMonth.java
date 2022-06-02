package com.syntax.class05;

import java.util.Scanner;

public class HW5BirthMonth {

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
		 * Write a program for user to enter his/her birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May -> season =
		 * "Spring" If user is born in June, July, August -> season = "Summer", etc ...
		 * At the end of the program we should see output as
		 * "You were born in season _".
		 */

		Scanner scan = new Scanner(System.in); // Create a Scanner object

		System.out.println("Please emter your birth month");
		String month = scan.nextLine(); // capture string

		if (month.equalsIgnoreCase("March") || month.equals("April") || month.equalsIgnoreCase("May")) {
			System.out.println("Season is Spring");
		} else if (month.equalsIgnoreCase("June") || month.equals("July") || month.equalsIgnoreCase("August")) {
			System.out.println("Season is Summer");
		} else if (month.equalsIgnoreCase("September") || month.equals("October") || month.equalsIgnoreCase("November")) {
			System.out.println("Season is Fall");
		} else if (month.equalsIgnoreCase("December") || month.equals("January") || month.equalsIgnoreCase("February")) {
			System.out.println("You were born in season Winter");
		}
	}
}
