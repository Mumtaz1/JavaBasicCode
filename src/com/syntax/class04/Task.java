package com.syntax.class04;

public class Task {

	public static void main(String[] args) {
		/*
		 * Write a program to check
		 * whether a number is positive or negative
		 */
		int num = -5;
		if (num < 0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is positive");
		}
		
		int a = 0;
		if (a > 0 ) {
			System.out.println(a + " is positive");
		} else if (a == 0) {
		// note if you were to type } else if (a = 0) { you would get an error because cannot convert from int to boolean
			System.out.println(a + " is not positive or negative");
		} else {
			System.out.println(a + " is negative");
		}
	}

}
