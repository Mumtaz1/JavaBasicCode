package com.syntax.class14;

public class HW2MethodOddOrEven {

	/*
	 * Create a method that will take a number and prints whether the number is even
	 * or odd.
	 */

	void oddOrEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}

	public static void main(String[] args) {

		HW2MethodOddOrEven num = new HW2MethodOddOrEven();
		num.oddOrEven(7);

	}
}