package com.syntax.groupproject;

public class Ex1Q8Fibonacci {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to print the first  10
		 * number of Fibonacci series.
		 * Note, Fibonacci series is a series of 
		 *          numbers in which each number is the 
		 *          sum of the preceding numbers.
		 */
		
		int num = 10; int x1 = 0; int x2 = 1; int nextValue = 0;
		System.out.println("The Fibonacci series are 0 1" + " ");
		for (int i = 0; i <= num; i++) {
			nextValue = x1 + x2;
			System.out.println(nextValue + " ");
			x1 = x2;
			x2 = nextValue;
		}
		System.out.println();
	}
}