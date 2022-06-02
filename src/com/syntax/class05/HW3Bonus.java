package com.syntax.class05;

import java.util.Scanner;

public class HW3Bonus {

	public static void main(String[] args) {

		/*
		 * The Scanner class is used to get user input, and it is found in the java.util
		 * package. The Scanner class is used for reading in primitive data types like
		 * int, double, float, etc., and objects of type String. - To read strings, we
		 * use next() - To read sentences, we use nextLine() - To read number values, we
		 * use nextInt() - To read decimal number, we use nextDouble() - To read a
		 * single character, we use next().charAt(0)
		 */

		/*
		 * Write a program to ask user to enter number of years worked and annual
		 * salary. If user worked for 5 or more years than user is eligible for the
		 * bonus, otherwise he is not. Once user is eligible and salary is larger than
		 * 50000 than bonus = 5000, otherwise bonus = 3000.
		 */
		Scanner scan = new Scanner(System.in); // Create a Scanner object

		System.out.println("Please emter the number of years you worked ");
		int yrsOfService = scan.nextInt(); // capture int

		System.out.println("Please emter your annual salary");
		int salary = scan.nextInt(); // capture int

		if (yrsOfService >= 5) {
			System.out.println("You are eligible for a bonus");
			if (salary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("Sorry, but you are not eligible for a bonus");
		}
	}
}