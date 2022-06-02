package com.syntax.class08;

import java.util.Scanner;

public class HW2AmtLeft2Pay {

	public static void main(String[] args) {

		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money, accumulate the amount and tell the
		 * user how much is left to pay off. If user gives more money, the program
		 * should return change. Whenever a user is done with payments, program should
		 * say "Thank you for shopping!"
		 */

		Scanner input = new Scanner(System.in);

		int price, paid = 0, payment = 0;
		String item;

		System.out.println("Please enter the item you wish to purchase");
		item = input.nextLine();

		System.out.println("Please enter the price of the item");
		price = input.nextInt();

		do {
			System.out.println("How much do you wish to pay?");
			payment = input.nextInt();
			paid += payment;

			if (paid < price) {
				System.out.println("Your outstanding balance is $" + (price - paid));
			} else if (paid >price) {
				System.out.println("You have a credit of $" + (paid - price));
			}
		} while (paid != price);
		System.out.println("Thank you for shopping at MyStore");
	}
}