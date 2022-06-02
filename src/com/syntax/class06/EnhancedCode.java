package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

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
		 * Write a program that will read three inputs of scores (quiz, mid terms, and
		 * final scores) and determine the grade based on the following rules: - if the
		 * average score >= 90 -> grade = A - if the average score > = 70 and < 90 ->
		 * grade = B - if the average score >= 50 and <70 -> grade = C - if the average
		 * score < 50 -> grade = F
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score you got in the quiz");
		int quiz = input.nextInt();

		System.out.println("Enter the score you got in the midterm");
		int mid = input.nextInt();

		System.out.println("Enter the score you get in final");
		int fin = input.nextInt();

		int averageS = (quiz + mid + fin) / 3;

		System.out.println("Your average score is " + averageS);
		char grade;

		if (averageS >= 90) {
		grade='A';
		}else if (averageS >= 70 && averageS <= 90) {
		grade='B';
		}else if(averageS >= 50 && averageS < 70) {
		grade='C';
		}else {
		grade='F';
		}

		System.out.println("You are a " + grade + " student");
		/* if you are A or B student --> you are doing great
		* otherwise --> please try to study more
		*/

		if(grade=='A' || grade=='B') {
		System.out.println("You are doing great");
		}else {
		System.out.println("Please try to study more");
		}
	}
}