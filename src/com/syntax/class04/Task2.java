package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		
		/* Write a program to store a value whether user has
		 * diploma or not. If user has a diploma, you should say
		 * congratulations, otherwise program should suggest to
		 * get a degree. Then, if the user has a degree the program
		 * should check the GPA score. If GPA score is higher 
		 * or equal to 3.5 > output should say " You  are 
		 * eligible for scholarship", otherwise > "You should have
		 * studied harder".
		 * 
		 */
		boolean diploma = true;
		double gpa;
		
		if (diploma) {
			System.out.println("Congratulations on getting a diploma");
			gpa = 3.6;
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("Please consider getting a diploma");
		}
		
		/* Create a Java Program and store values for mortgage rate
		 * and mortgage price. First, program should check if rate
		 * is higher than 4.5, user will not buy a house, otherwise
		 * user will consider buying. Once user decides to buy a 
		 * house, if price of the house is larger than 50000 then the 
		 * user will take a loan, otherwise user will pay cash.
		 */
		double mortgageRate = 4.3;
		int price = 40990; 
		
		if (mortgageRate > 4.5) {
			System.out.println("User will not buy a house because mortgage rate is higher than 4.5");
			} else {
				System.out.println("User is considering buying a house since mortgage rate is less than 4.5");
				if (price > 50000) {
					System.out.println("User to take out a loan");
			} else {
				System.out.println("User will pay cash");
			}
		}

	}

}
