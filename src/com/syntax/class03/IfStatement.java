package com.syntax.class03;

public class IfStatement {
	
	public static void main(String[] args) {
		
		/*
		 *  Declare a variable rate.
		 *  If rate is more than 5 -> I am not buying a house
		 */
		double mortgageRate = 4.5;
		if (mortgageRate > 5) {
			System.out.println("I am not buying a house");
		}
			System.out.println("I am buying a house");
			
			/*
			 * Declare 2 variables and check if num1 is bigger than num2
			 */
			int num1 = 99;
			int num2 = 100;
			if (num1 > num2) {
				System.out.println(num1 + " is bigger than " + num2);
			}
			
			/*
			 * Declare temperature. If temp is higher than 75 > I will go for a walk
			 */
			int temp = 89;
			if (temp > 75) {
				System.out.println("I will go for a walk");
			}
			else {
				System.out.println("I am going to study Java");
			}
			
			char gender = 'm';
			char gender1 = 'f';
			
			System.out.println(gender + gender1);
			
			if (gender == 'f') {
				System.out.println("You like shopping");
			}
			else {
				System.out.println("You like watching sports");
			}
			
			String browser = "Chrome";
			if (browser.equals("chrome")) {
				System.out.println("All test cases will be executed on chrome"); 
			}
			else {
				System.out.println("I am not executing any test cases");
				System.out.println("Reason - wrong browser");
			}
				
	}

}
