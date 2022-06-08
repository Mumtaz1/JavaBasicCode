package com.syntax.class13;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create a String and if the String is not empty perform the following: - if
		 * the String has an odd number of character and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
		
		//str2.length() %2 String has an odd number of characters
		//str2.length() >= 3 has 3 or more characters
		
		String str = new String("Hello");
		String str2 = "Hello"; // This is preferred.
		
		if (!str2.isEmpty()) {
			
			if (str2.length() %2 != 0 && str2.length() >= 3) {
				int middle = str2.length() / 2; //gives the middle of the string
				System.out.println(str2.charAt(middle)); //l (the letter l)
			}
		}
	}
}