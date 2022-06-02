package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name = "Oleg";
		String lastName = "Smith";
		
		long phone = 1234567890L;
		
		// Phone number in this format: xxx-xxx-xxxx
		String phoneNumber = "123-456-7890";
		
		String address = "123 Washington St";
		
		int age = 30;
		String city = "Miami";
		
		// Shortcut for print  is 
		// Type syso + ctrl + space -> hit enter
		
		/*
		 *  We can use + to work
		 */
		System.out.println(name + " " + lastName);	// Oleg Smith
		
		// Output Oleg lives in Miami
		System.out.println(name+" lives in "+city);
		
		// Output Oleg is 30 years p;d
		System.out.println(name+ " is "+ age+ " years old " );
		
		/*
		 *  Rules for identifiers
		 *  1. no space
		 *  2. no keywords
		 *  3. cannot start with numbers (but numbers can be used after the letter)
		 *  4. cannot have special characters (except _, $)
		 */
		
		// String break = "Hello";
		// int 1number = 10;
				
		int number1 = 10;
		
		// int num% = 20; get error
		double $price = 3.99;
		float f_= 2.09f;
		
		/*
		 *  Naming Conventions:
		 *  follow camel casing
		 *  variable names should start with lowercase and then follow camel casing
		 *  class names should start with uppercase
		 */
		String mycity = "Tysons";
		
		
	}

}
