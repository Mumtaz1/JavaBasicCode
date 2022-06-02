package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create an array to store char values and then print those
		 * in reverse order.
		 */
		
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		for (int i = grades.length -1; i >= 0; i--)
		System.out.print( grades[i] + " ");   
	}
}
// Note you cannot do enhanced for loop when doing reverse order.