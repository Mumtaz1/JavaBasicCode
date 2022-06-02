package com.syntax.class05;

import java.util.Scanner;

public class HW6Scores {

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

		Scanner scan = new Scanner(System.in); // Create a Scanner object

		System.out.println("Please enter the quiz score ");
		double averageScore = 0;
		averageScore += scan.nextDouble();

		System.out.println("Please enter the mid-term score ");
		averageScore += scan.nextDouble();

		System.out.println("Please enter the final score ");
		averageScore += scan.nextDouble();

		averageScore /= 3;

		if (averageScore >= 90) {
			System.out.println("Grade = A");
		} else if (averageScore >= 70 && averageScore < 90) {
			System.out.println("Grade = B");
		} else if (averageScore >= 50 && averageScore < 70) {
			System.out.println("Grade = C");
		} else if (averageScore < 50) {
			System.out.println("Grade = F");
		}
	}
}