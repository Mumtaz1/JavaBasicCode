package com.syntax.groupproject;

import java.util.Scanner;

public class Ex1Q7PrimeOrNot {

	public static void main(String[] args) {
		
		/*
		 * Write a program to check whether a given number
		 * is a prime or not
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose a number to check if it's a prime number or not: ");
		int number = input.nextInt();
		
		boolean isPrime = true;
		
		for (int i = 2; i < number; i ++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("Number " + number + " is a prime number" );
		} else {
			System.out.println("Number " + number + " is not a prime number" );
		}
	}
}