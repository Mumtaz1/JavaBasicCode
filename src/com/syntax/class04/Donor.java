package com.syntax.class04;

public class Donor {
	
	public static void main(String[] args) {
		
		/* Homework 2. 
		 * Create a Java Program and call it Donor.
		 * In order to be eligible to donate your blood you
		 * have to be 18 years old. Also, once you 
		 * identify age eligibility then we have to see if 
		 * person matches weight requirements. If 
		 * person weight is more than 110 lbs then
		 * s/he is eligible, otherwise we cannot 
		 * accept such a patient.
		 */
		int age = 19;
		int weight = 109;
		if (age < 18) {
			System.out.println("You are too young to donate blood");
		} else {
			System.out.println("You are 18 or older and are eligible to donate blood");
			if (weight < 110) {
				System.out.println("Unfortunately you are underweight, and so you cannot donate blood");
			} else {
				System.out.println("You are eligible to donate blood.");
			}
		}
	}
}
