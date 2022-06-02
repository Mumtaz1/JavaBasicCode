package com.syntax.class05;

import java.util.Scanner;

public class HW1LoanAmount {

	public static void main(String[] args) {
		
		/*
		 * You are a loan specialist and you need to ask the user what is the amount
		 * of the loan they need. If loan is less or equal to 200,000 then you would
		 * lend the money, otherwise you would reject the client.
		 */
		Scanner scan = new Scanner(System.in);	//Create a Scanner object
		
		System.out.println("What is the amount of the loan you need");
		int loan = scan.nextInt();  // capture int
		
		if (loan <= 200000) {
			System.out.println("The bank will lend you the money");
		} else {
			System.out.println("Sorry, but your request has been rejected");
		}
	}

}
