package com.syntax.class08;

import java.util.Scanner;

public class TaskForAndDoWhileLoop {

	public static void main(String[] args) {

		// Print numbers from 1 to 50 except those that are divisible by 3

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println("-----------------------");
		/*
		 * Create a program that will keep asking user to apply for a credit card. As
		 * soon as you get "yes" from a user, program should stop asking
		 */
		Scanner scan = new Scanner(System.in);
		String card;

		do {
			System.out.println("Did you apply for a credit card. Please enter yes or no");
			card = scan.next();

		} while (!card.equalsIgnoreCase("yes"));
			System.out.println("Thank you for applying for a credit card");
			scan.close();
	}
}