package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 6; i++) {
			System.out.print(sum); // 0 1 3 6 10
			sum += i; // sum = sum + i
			// System.out.print(sum); // 1 3 6 10 15
		}
		System.out.println();
		System.out.println(sum); // 15

		/*
		 * Write a program to find sum of all even and all odd numbers from 1 to 70
		 */
		int sum1 = 0;

		for (int i = 1; i <= 70; i ++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.println("Sum of all even numbers = " + sum1);

		int sum2 = 0;
		for (int i = 1; i <= 70; i++) {
			if (i % 2 != 0) {
				sum2 += i;
			}
		}
		System.out.println("Sum of all odd numbers = " + sum2);
		
		// Another way
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 70; i ++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
	}

}