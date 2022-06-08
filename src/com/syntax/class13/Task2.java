package com.syntax.class13;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create a String and print it in reverse order (Sunday -> yadnuS).
		 */

		String day = "Sunday";
		for (int i=day.length()-1; i >=0; i --) { //we are doing -1 b/c there is no character at index 6 so we need to subtract 1
			System.out.print(day.charAt(i));
		}
	}
}