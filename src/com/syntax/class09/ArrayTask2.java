package com.syntax.class09;

public class ArrayTask2 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of words: Java, Saturday, day, coding, is.
		 * Print the following sentence using elements of array:
		 * "Saturday is Java coding Day".
		 */

		String[] words = {"Java", "Saturday", "day", "coding", "is"};
		// I want to retrieve all elements
		for (int i = 0; i <words.length; i ++) {
			System.out.print(words[i] + " ");
		}
		
		System.out.println();
		
		/* 
		 * Enhanced for loop / advanced for loop / for each loop
		 * CAN BE USED ONLY WHEN WE WORK WITH ARRAY
		 * or COLLECTIONS
		 */
		
		String[] colors = {"pink", "blue", "white", "black"};
		for (String color : colors) {
			
			System.out.print(color + " ");
		}
		
		System.out.println();
		
		int[] numbers = {10, 20, 30, 40};
		for (int num:numbers) {
			System.out.println(num);
		}
		
	}
}