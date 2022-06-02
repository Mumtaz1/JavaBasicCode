package com.syntax.class08;

import java.util.Scanner;

public class HW1OddEvenNos {

	public static void main(String[] args) {

		/*
		 * Step1: does initialization Step 2: checks condition Step 3: does the print
		 * Step 4: then does the increment
		 */
		
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */

		int num1, num2, number;
		int sumEven = 0, sumOdd = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		for  (number = num1; number <= num2; number ++) {
			if (number  % 2 == 0) {
				sumEven += number;
			} else {
				sumOdd += number;
			}
		}
		System.out.println("The sum of the odd numbers from " + num1 + " to " + num2 + " is: " + sumOdd);
		System.out.println("The sum of the even numbers from " + num1 + " to " + num2 + " is: " + sumEven);
	}
}