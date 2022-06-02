package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter a number and then define if the number is small, 
		 * medium, or large.
		 * - Small number if value is between 1 and 10
		 * - Medium number if value is between 11 and 100
		 * - Large number if value is between 101 and 1000
		 */
		
		Scanner scan = new Scanner(System.in);	//Create a Scanner object
		
		System.out.println("Please enter a number");
		int num = scan.nextInt();  // capture int
		
		if (num >= 1 && num <= 10) {
			System.out.println("The number you entered is small");
		} else if (num >= 11 && num <= 100) {
			System.out.println("The number you entered is medium");
		} else if (num  >= 101 && num <= 1000) {
			System.out.println("The number you entered is large");
		}
	}
}