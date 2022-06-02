package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

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
		 * Let's ask a user where is he from
		 * Based on the country we will define favorite food
		 */
		
		Scanner scan = new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where you are from");
		country = scan.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "mexico":
			favoriteFood = "tacos";
			break;
		case "canada":
			favoriteFood = "poutine";
			break;
		case "turkey":
			favoriteFood = "lahmacun";
			break;
		case "pakistan":
			favoriteFood = "pati chai";
			break;
		case "egypt":
			favoriteFood = "koshary";
			break;
		case "usa":
			favoriteFood = "burgers";
			break;
		default:
			favoriteFood = "unknown";
		}
		
		System.out.println("You are from " + country + " and your favorite food is " + favoriteFood);
	}
}