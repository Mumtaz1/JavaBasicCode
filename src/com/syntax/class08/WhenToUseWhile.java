package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		
		/*
		 * Declare a secret number;
		 * You want to ask user to guess your secret number
		 * You should keep asking to guess until user gets your secret number
		 * Once user gets the secret number -> you got it!
		 */
		
		int secretNum= 7;
		int guessedNum;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Please guess my secret number");
			guessedNum = scan.nextInt();
		
		} while (guessedNum != secretNum);
		
		System.out.println("You got it");
	}
}