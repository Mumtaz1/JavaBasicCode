package com.syntax.class04;

public class HWLargestNumber {

	public static void main(String[] args) {

		/*
		 * Homework 3. Write a program to find largest number among three numbers using
		 * nested if provided by a user (numbers must be distinct)
		 */
		double num1 = 2.2, num2 = 3.5, num3 = 1.0;
		if (num1 >= num2 && num1 >= num3)
			System.out.println(num1 + " is the largest number.");

		else if (num2 >= num1 && num2 >= num3)
			System.out.println(num2 + " is the largest number.");

		else
			System.out.println(num3 + " is the largest number.");
//	} 
/*			System.out.println("---------------------------------");
			// Or write it as
		 
			int n1 = 45;
			int n2 = 44;
			int n3 = 23;

			if(n1>=n2) {
				if (n1 >= n3) {
					System.out.println(n1 + " is the largest number");
				} else {
					System.out.println(n3 + " is the largest number");
			} else {
				if (n2 >= n3) { // otherwise n2 > n1 } { 
					System.out.println(num2 + " is the largest number");
				} else { // n3 > n2
				System.out.println(n3 + " is the largest number");		
				}																					*/
		}
}