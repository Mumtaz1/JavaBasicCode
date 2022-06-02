package com.syntax.class06;

import java.util.Scanner;

public class HW1CountryLanguage {

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
		
		/*Ask user to enter their country and capture it.
		 * Once values are captured print which language 
		 * user speaks.
		 */
		
		Scanner scan = new Scanner(System.in);
		String country, language;
		
		System.out.println("Please tell me which country you are from");
		country = scan.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "usa":
			language = "english";
			break;
		case "canada":
			language = "french";
			break;
		case "china":
			language = "standard chinese";
			break;
		case "india":
			language = "hindi";
			break;
		default:
			language = "unknown";
		}
		System.out.println("You are from " + country + " and the language you speak is " + language);
	}
}