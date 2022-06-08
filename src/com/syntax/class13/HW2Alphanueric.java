package com.syntax.class13;

public class HW2Alphanueric {

	public static void main(String[] args) {
		
		/* 
		 * Create a String that should be 
		 * combination of letters, numbers, and
		 * special characters. 
		 * Find out how many Alphanumeric 
		 * characters are there in the String.
		 */

		String str = "Meet me on 06/08/22 @ 4 PM!";	
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "" ).length());
		
	}
}