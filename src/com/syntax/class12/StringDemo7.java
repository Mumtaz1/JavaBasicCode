package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		
		String str = "I am always confused";
		
		System.out.println(str.indexOf("am"));  //2
		System.out.println(str.indexOf("always")); //5
		System.out.println(str.indexOf('a'));  // to find index of letter a. outputs 2
		System.out.println(str.indexOf(' '));  //1
		System.out.println(str.indexOf('z')); //if something is not present you get -1
	}
}