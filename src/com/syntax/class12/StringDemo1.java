package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
		String name = new String("Oleg"); // Proper way of creating an object from a class
		
		String name2 = "Oleg";  // same as line 10 - String name = new String("Oleg");
		// All the classes in Java can be treated as a datatypes.
		//If a class is present inside the same package or if a class belongs to java.lang package
//		name.length();
		System.out.println(name.length());  //4
		name2 = "Zameer ";
		System.out.println(name2.length());  //7
		
		String captain = "NAVEED";
		System.out.println(captain.toLowerCase());
		
	}
}