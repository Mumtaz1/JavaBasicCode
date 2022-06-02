package com.syntax.class02;

public class MathOperatorHomework {

	public static void main(String[] args) {
		/* Homework given on Sunday 5/1/22
		 * 1. Write a Java program to add, subtract, multiply
		 *     and divide 2 decimal values. Your program should
		 *     say "The _ of 2 numbers _ and _ is equal
		 *     to _".
		 * 2. Write a program to find the square of the number 
		 *     3.9. Your program should say "The square of the 
		 *     _ is _ ".
		 * 3. Write a program to print the area and the perimeter of
		 *     a rectangle with width = 5 and height = 8. Your
		 *     program should say "The perimeter of a rectangle
		 *     with width _ and height _ is equal to _ and 
		 *     the area is _".
		 */
		// # 1.
		double val1 = 25.30, val2 = 10.70;
		
		double sum, sub, mult, div;
		
		double sum1 = val1 + val2;
		System.out.println("The addition" + " of 2 numbers " + val1 + " and " + val2 + " is equal to " + sum1 );
		double sum2 = val1 - val2;
		System.out.println("The subtraction" + " of 2 numbers " + val1 + " and " + val2 + " is equal to " + sum2 );
		double sum3 = val1 * val2;
		System.out.println("The multiplication" + " of 2 numbers " + val1 + " and " +  val2 + " is equal to " + sum3 );
		double sum4 = val1 / val2;
		System.out.println("The division" + " of 2 numbers " + val1 + " and " + val2 + " is equal to " + sum4 );
		
		// # 2.
		double a = 3.9;
		double square = a * a;
		System.out.println("The square of the " + a + " is " + square);
		
		// # 3.         
		int width = 5, height = 8;
		int perimeter = 2 * (width + height);
		int area = width * height;
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height 
				+ " is equal to " + perimeter + " and the area is " + area);
	}
}