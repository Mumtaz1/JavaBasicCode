package com.syntax.class06;

import java.util.Scanner;

public class HW4SalePrice {

	public static void main(String[] args) {

		/*
		 * The Scanner class is used to get user input, and it is found in the java.util
		 * package. The Scanner class is used for reading in primitive data types like
		 * int, double, float, etc., and objects of type String. - To read strings, we
		 * use next() - To read sentences, we use nextLine() - To read number values, we
		 * use nextInt() - To read decimal number, we use nextDouble() - To read a
		 * single character, we use next().charAt(0)
		 */

		/*
		 * Write a program to ask user to enter value for sale: yes or no. 
		 * -If there is a no sale -> you are not going shopping 
		 * - If there is a sale, ask the user which items they want to buy and it's price 
		 * Based on the price you have to calculate the price of the item 
		 * after the discount. 
		 * Discount rules: 
		 * - if price is less than $20 -> apply 10% 
		 * - if price is between $20 & $100 -> 20% 
		 * - if price is between $101 & $500 -> 30% 
		 * - otherwise apply 50% discount 
		 * After the discount _ the price of the item reduced from _ to _
		 */

		// See the instructors equivalent code in reviewClass3 > HW.
		
		Scanner input = new Scanner(System.in);

		System.out.println("Is there a sale? Please enter yes or no");
		String sale = input.next();

		double price = 0.00, discount = 0.00, salePrice = 0.00;

		if (sale.equalsIgnoreCase("yes")) {

			System.out.println("Which product do you wish to purchase?");
			String product = input.next();

			System.out.println("Please enter the price of the product");
			price = input.nextDouble();

			if (price < 20) {
				discount = 10;
				salePrice = price - (price * 0.1);

			} else if (price >= 20 && price <= 100) {
				discount = 20;
				salePrice = price - (price * 0.2);

			} else if (price >= 101 && price <= 500) {
				discount = 30;
				salePrice = price - (price * 0.3);

			} else {
				discount = 50;
				salePrice = price - (price * 0.5);
			}

			System.out.println("After a discount of  " + discount + " the price of the item reduced from " + price
					+ " to " + salePrice);
		} else {
			System.out.println("There is no sale, so you are not going shopping");
		}
	}
}