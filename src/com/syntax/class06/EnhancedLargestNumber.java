package com.syntax.class06;

public class EnhancedLargestNumber {

	public static void main(String[] args) {
		
		/* 
		 * Write a program to find largest number among three number using nested if
		 *  else if provided by a user (numbers must be distinct)
		 */
		int num1 = 200;
		int num2 = 200;
		int num3 = 20;
		
		/* Compiler can initialize variables to it's default values
		 * int -> 0
		 * double -> 0.00
		 * float -> 0.0
		 * boolean -> false
		 * String -> null
		 */
		
		int largest = 0;
		
		if (num1 > num2 && num2 > num3) {
			largest = num1;
		
		} else if (num3 > num1 && num3 > num2) {
			largest = num3;
		
		}else if (num2 > num1 && num2 > num3) { 
			largest = num2;
		
		} else {
			System.out.println("All numbers are equal");
		}	
		if (largest !=0) {
			System.out.println("The largest number is " + largest);
		}	
		/* The variable largest may not have not initialized
		 * We get this error because on line 23 we just declared the variable largest but 
		 * nothing was assigned to it. So, if all statements are false and code goes to
		 *  line 38, then there is no value in largest. 
		 * System.out.println("The largest number is " + largest); 
		 * To rectify it change line 23 from int largest; to int largest = 0; */
	}
}