package com.syntax.class02;

public class VariableValues {

	public static void main(String[] args) {
		byte one = 127;
		one = 110;
		short small = 32767;
		small = 500;
		int popular = 76666; // this will be mostly used
		popular = 54321;
		long big = 45678909876543L; // The L can be lower or upper case and means its long
		big = 1234567890123L;
		
		// Decimal values:
		float mybox1 = 1.99F; // Need to add F at the end to indicate a Float
		mybox1 = 1.05F;
		double mybox2 = 89.99;
		mybox2 = 55.55;
		
		// To represent 1 character (make sure you put it in single quotes):
		char size = 'l';
		size = 'm';
		
		char star = '*';
		
		// To represent true or false (yes or no)"
		boolean happy = false;
		happy = true;
		boolean busy = false;
		busy = true;
		
		// Access and print values from all variables:
		System.out.println(one);
		System.out.println(small);
		System.out.println(popular);
		System.out.println(big);
		System.out.println(mybox1);
		System.out.println(mybox2);
		System.out.println(size);
		System.out.println(star);
		System.out.println(happy);
		System.out.println(busy); 		
		System.out.println("sleepy"); 	
		
	}

}

