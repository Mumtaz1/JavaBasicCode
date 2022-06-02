package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

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
		 * Create a Java program that will ask if user has a credit card or not.
		 * If user does not have a credit card then offer them one. If they do
		 * have one, then ask them what is the balance of the card? If balance
		 * of the card is larger than 1000, tell them to pay off immediately,
		 * otherwise you can tell them that they can spend more.
		 */
		
		Scanner scan = new Scanner(System.in);	//Create a Scanner object
		
		System.out.println("Do you have a credit card? Please enter true or false");
		boolean creditCard = scan.nextBoolean();  // capture Boolean 
		System.out.println(creditCard);

		if (creditCard) {
			System.out.println("What is the balance on the card?");
			int bal = scan.nextInt();
			if (bal > 1000) {
			System.out.println("Please pay off your balance immediately");
			} else {
				System.out.println("You can spend more");
			}		
		} else {
			System.out.println("We can offer you a credit card");
		}
		// Or the code can be written as below:
		System.out.println("Do you have a credit card? Please enter yes or no");
		String answer = scan.next();
		
		if (answer.equals("no")) {
			System.out.println("We can offer you a credit card");
		} else {
				System.out.println("What is the balance on the card");
				int bal = scan.nextInt();
				if (bal > 1000) {
					System.out.println("Please pay off your balance immediately");
				} else {
					System.out.println("You can spend more");					
			}
		}
	}
}