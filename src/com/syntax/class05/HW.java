 package com.syntax.class05;

public class HW {

	public static void main(String[] args) {
		
		/* 
		 * Create a Java Program and call it Donor.
		 * In order to be eligible to donate your blood you
		 * have to be 18 years old. Also, once you 
		 * identify age eligibility then we have to see if 
		 * person matches weight requirements. If 
		 * person weight is more than 110 lbs then
		 * s/he is eligible, otherwise we cannot 
		 * accept such a patient.
		 */
		int age = 23;
		int weight = 101;
		if (age >= 18) {
			if (weight >= 110) {
				System.out.println("You are " + age + " years old and are eligible to donate blood");
				System.out.println("You are eligible to be a donor.");
			} else {
				System.out.println("You are " + age + " years old, and " + weight + "  lbs. It is less then 110 lbs.");
				System.out.println("You are not eligible to be a donor");
			}
		} else {
			System.out.println("You are not eligible to be a donor. You ");
		} 
	}
} 
