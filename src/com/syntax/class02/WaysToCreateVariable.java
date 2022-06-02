package com.syntax.class02;

public class WaysToCreateVariable {

	public static void main(String[] args) {
		
		// To create a variable we need 2 things: datatype and name
		
		/*
		 * 1st way to create a variable
		 * dataType name = value
		 * declare a variable temperature and we initialized it
		 */
		int temperature = 60;
		
		/*
		 *  2nd way to create a variable is in 2 steps:
		 *   1. Create a variable (dataType and name)
		 *  2.  assign the value
		 */
		int sum;		// Create a variable or declare a variable
		sum = 30;		// Assign the value
		sum = 50; 	// Reassign the value
		
		int num1, num2, num3; 		// Create 3 variables of int type
		num1 = 10;						// assign the value
		num2 = 20;						// assign the value
		num3 = 30;						// assign the value
		
		System.out.println(sum);	// outputs 50
		
	}

}
