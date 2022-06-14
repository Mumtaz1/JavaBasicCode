package com.syntax.class14;

public class HW1MethodLarger {

	/*
	 * Create a Method that will take 2 parameters as numbers and prints which
	 * number is larger.
	 */

	void largest(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is greater than " + num1);
		}
	}

	public static void main(String[] args) {

		HW1MethodLarger numbers = new HW1MethodLarger();
		numbers.largest(7, 22);

	}

}