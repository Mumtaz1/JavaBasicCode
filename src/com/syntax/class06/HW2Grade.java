package com.syntax.class06;

import java.util.Scanner;

public class HW2Grade {

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
		
		/* Allow the user to enter a grade (A, B, or C etc ...)
		 * and then provide explanation: A - Excellent, B - Good,
		 * C - Average, D - Bad, any other grade --> Not
		 * acceptable. At the end your program should print which
		 * grade was entered by a user with explanation.
		 */
		Scanner input = new Scanner(System.in);
		String grade, rating;
		
		System.out.println("Please enter your grade");
		grade = input.next();
		
		switch(grade.toUpperCase()) {
		
		case "A":
			rating = "Excellent";
			break;
		case "B":
			rating = "Good";
			break;
		case "C":
			rating = "Average";
			break;
		case "D":
			rating = "Bad";
			break;
		default:
			rating = "Not acceptable";
		}
		System.out.println("The grade you entered was " + grade + " - " + rating);    
	}
}