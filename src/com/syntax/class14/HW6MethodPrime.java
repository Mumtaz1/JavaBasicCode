package com.syntax.class14;

public class HW6MethodPrime {

	/*
	 * Write a method to return whether given number is
	 * prime or not. 
	 * Note, a prime number is a number greater than 1 
	 * that has no positive divisors other than 1
	 * and itself.
	 */

	boolean number(int num) {
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
			return isPrime;
		} else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}
	}

	public static void main(String[] args) {

		HW6MethodPrime n = new HW6MethodPrime();
		System.out.println(n.number(8));
		System.out.println(n.number(7));
	}
}