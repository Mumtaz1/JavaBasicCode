package com.syntax.class05;

import java.util.Scanner;

public class HW4Time {

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
		 * Write a program that will ask the user to input the current 
		 * time (use 24 hour format). Based on the given time define:
		 * - if hour is between 1 - 11 -> Morning
		 * - if hour is between 12 - 15 -> Afternoon
		 * - if hour is between 16 - 20 -> Evening
		 * - if hour is between 21 - 24 -> Night
		 */
		
		Scanner scan = new Scanner(System.in);	//Create a Scanner object
		
		System.out.println("Please emter the current time in a 24 hour format ");
		int time = scan.nextInt();  // capture int
		
		if (time >= 1 && time <= 11) {
			System.out.println("Morning");
			} else if (time >= 12 && time <= 15) {
				System.out.println("Afternoon");
			} else if (time >= 16 && time <= 20) {
				System.out.println("Evening");	
			}
		else {
			System.out.println("Night");
		}
	}
}
