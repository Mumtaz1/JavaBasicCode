package com.syntax.class04;

import java.util.Scanner;

public class HWUserInput {

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
		 * Homework 3. 
		 * Write a program to find largest number 
		 * among three numbers using nested if
		 * provided by a user (numbers must be
		 * distinct)
		 */
		
			Scanner input = new Scanner(System.in);	//Create a Scanner object
	
			// Send instructions to the console
			System.out.println("Please provide the first number");		
			// We need to grab from the console the first number entered by the user
			// To read number values we use .nextInt()
			int num1 = input.nextInt();  	// After you type the value hit enter
			System.out.println(num1);		
			
			// Send instructions to the console requesting user enter 2nd number 
			System.out.println("Please provide a unique second number");		
			// We need to grab from the console the second number entered by the user
			int num2 = input.nextInt();
			System.out.println(num2);
			
			// Send instructions to the console requesting user enter 3rd number 
			System.out.println("Please provide a unique third number");						
			// We need to grab from the console the second number entered by the user
			int num3 = input.nextInt();
			System.out.println(num3);
			
			if (num1 >= num2) {
				if (num1 >= num3)
					System.out.println(num1 + " is the largest number.");	
				else
					System.out.println(num3 + " is the largest number.");
			} else {
				if (num2 >=  num3) {
					System.out.println(num2 + " is the largest number");
			}
			  else
				System.out.println(num3 + " is the largest number");
			}
			System.out.println("------------------------");
		
			//Or you can write the code as per the below:
			
			if (num1 > num2 && num1 > num3) {
				System.out.println(num1 + " is greater than " + num2 + " and " + num3);
			} else if (num2 > num1 && num2 > num3) {
				System.out.println(num2 + " is greater than " + num1 + " and " + num3);
			} else if (num3 > num1 && num3 > num2) {
				System.out.println(num3 + " is greater than " + num1 + " and " + num2);
			} else {
				System.out.println("Either any two values or all three values are equal");
			}
		}
	}