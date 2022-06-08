package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName = "Adem";
		String lastName = " Jones";
		String fullName = firstName + lastName; //preferred way of coding
		String fullName2 = firstName.concat(lastName); //never use this b/c it can lead u to nullpointer exception
		System.out.println(fullName2);
		System.out.println(fullName);
		
		String name = " ";
		System.out.println(name.isEmpty()); // this counts spaces and so returns false
		System.out.println(name.isBlank()); // this does not count spaces and so returns true
		
		String str = " ne  ver ";
		System.out.println(str.trim()); //removes spaces before and after a word, not in between word
		
	}
}