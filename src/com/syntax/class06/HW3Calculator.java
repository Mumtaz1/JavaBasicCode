package com.syntax.class06;

import java.util.Scanner;

public class HW3Calculator {

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
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator (+, -, *, /). Based on operator provide the result to the user.
		 * Please complete this assignment in 2 ways: - using if statement and - switch
		 * case.
		 */

		// If is a condition based statement
		
		Scanner input = new Scanner(System.in);

		int sum, num1, num2;
		
		System.out.println("Please enter the first number");
		num1 = input.nextInt();

		System.out.println("Please enter the second number");
		num2 = input.nextInt();

		System.out.println("Choose operator: Add, Subtract, Multiply, or Divide");
		String mathOperator = input.next();

		if (mathOperator.equalsIgnoreCase("Add")) {
			sum = (num1 + num2);
		} else if (mathOperator.equalsIgnoreCase("Subtract)")) {
			sum = (num1 - num2);
		} else if (mathOperator.equalsIgnoreCase("Multiply")) {
			sum = (num1 * num2);
		} else {
			sum = (num1 / num2);
		}
		System.out.println("The first number you entered was " + num1 + ", the second number you entered was " + num2
				+ ", and using the math operator  " + mathOperator + " the result = " + sum);
		
		System.out.println("------------------------------------");
		
		// Switch is a value based statement
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		int n1 = scan.nextInt();

		System.out.println("Please enter the second number");
		int n2 = scan.nextInt();

		System.out.println("Choose an operator: +, -, *, /");
		char Operator = scan.next().charAt(0);
		int sum1 = 0;
		
		switch (Operator) {
		case '+':
			sum1 = (n1 + n2);
			break;
		case '-':
			sum1 = (n1 - n2);
			break;
		case '*':
			sum1 = (n1 * n2);
			break;
		case '/':
			sum1 = (n1 / n2);
			break;
		}
		System.out.println("Result  is " + sum1);
	}
}