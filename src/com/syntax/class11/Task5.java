package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array of integer type where you will calculate the sum of even
		 * and odd number for that array
		 * 
		 */

		int[][] arr = { { 10, 15, 10 }, { 20, 50, 20 }, { 30, 30, 30 } };

		int evenSum = 0;
		int oddSum = 0;

		for (int j = 0; j < arr.length; j++) {
			
			for (int i = 0; i < arr[j].length; i++) {
				if (arr[j][i] % 2 == 0) {  // if it divisible by 2 then it is an even number.
					evenSum = evenSum + arr[j][i];
				} else {
					oddSum = oddSum + arr[j][i];
				}
			}
		}
		System.out.println("Odd sum " + oddSum);
		System.out.println("Even sum " + evenSum);
	}
}