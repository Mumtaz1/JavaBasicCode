package com.syntax.groupproject;

public class Ex1Q4OddEven2dArray {

	public static void main(String[] args) {

		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify / print the even numbers only.
		 */

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Even Numbers: ");

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
	}
}