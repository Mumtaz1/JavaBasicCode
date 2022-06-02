package com.syntax.groupproject;

public class Ex1Q6Swap2Nos {

	public static void main(String[] args) {
		
		/*
		 * Write a program to swap 2 numbers without a 
		 * temporary variable.
		 */
		
		int a = 10;
		int b = 15;
		a = a + b;	 // value is 10 + 15 = 25
		b = a - b; 	// value is 25 - 15 = 10, we swapped b from 15 to 10
		a = a - b; 	// value is 25 - 10 = 15, we swapped a from 10 to 15
		
		System.out.println("a =" + a);
		System.out.println("b = " + b);
	}
}