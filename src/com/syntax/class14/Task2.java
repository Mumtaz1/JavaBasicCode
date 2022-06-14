package com.syntax.class14;

public class Task2 {

	public static void main(String[] args) {
		
		/* 
		 * Create a String that should be 
		 * combination of letters, numbers, and
		 * special characters. 
		 * Find out how many Alphanumeric 
		 * characters are there in the String.
		 */

		String str = "asdasd1322546!@#";	
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "" ).length());

	}
}