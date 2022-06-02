package com.syntax.class01;

public class DataTypes {

	public static void main(String[] args) {
		
		// To create a variable specify a data type and a name
		
		// Whole numbers:
		byte box1 = 127;
		short box2 = 32767;
		int box3 = 76666; // this will be mostly used
		long box4 = 45678909876543L; // The L can be lower or upper case and means its long
		
		// Decimal values:
		float container1 = 1.99F; // Need to add F at the end to indicate a Float
		double container2 = 89.99;
		
		// To represent 1 character (make sure you put it in single quotes):
		char gender = 'm';
		char dollar = '$';
		
		// To represent true or false (yes or no)"
		boolean hungry = true;
		boolean sleepy = false;
		
		// How to access values from variables?
		System.out.println(container2);
		
		// Access and print values from all variables:
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(container1);
		System.out.println(container2);
		System.out.println(gender);
		System.out.println(dollar);
		System.out.println(hungry);
		System.out.println(sleepy);

	}

}
