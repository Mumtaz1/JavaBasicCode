package com.syntax.class11;

public class Task8 {

	public static void main(String[] args) {

		/* Write a java program to print the first 10
		 * numbers of Fibonacci series.
		 * Fibonacci numbers start from 0. The next is 1.
		 * So, sum of 1 + 1 = 1, 1 + 1 = 2 etc 
		 * So 0 1 1 2 3 5 8 13 21
		 * Basically add the previous number.
	    */
		int previousNumber = 0;
		int currentNumber = 1;
		int nextNumber = 0;
		int numbersToPrint = 10;
		
		System.out.print(0 + " ");
		System.out.print(1 + " ");
		
		for (int i = 0; i < numbersToPrint -2; i ++) { //we subtracted 2 because in line 19=20 we already printed 2 numbers
			nextNumber = previousNumber + currentNumber;
			System.out.print(nextNumber + " ");
			previousNumber = currentNumber;
			currentNumber = nextNumber;
		}
	}
}