package com.syntax.class08;

public class TaskForLoops {

	public static void main(String[] args) {

		// Print numbers from1 to 100 in 1 line with space

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println(" ---------------------------");

		// Print numbers from 100 to 1
		for (int a = 100; a >= 1; a--) {
			System.out.print(a + " ");
		}

		System.out.println("***********");
		// Print even numbers from 20 to 1 ( 2 ways)

		for (int b = 20; b >= 1; b -= 2) {
			System.out.print(b + " ");
		}
		System.out.println("----------------");

		// 2nd way to print even number from 20 to 1

		for (int c = 20; c >= 1; c--) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
		System.out.println("----------------");

		// Print odd numbers between 20 and 50 ( 2 ways)
		for (int i = 21; i <= 50; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println(" ------------------------ ");

		for (int i = 21; i < 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		// Note in the above pieces of code we can use the same variable name in
		// different for statements because they are inside the for loop.

	}
}
