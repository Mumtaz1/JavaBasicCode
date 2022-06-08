package com.syntax.class13;

public class HW6SwapNoTempVar {

	public static void main(String[] args) {
		
		/*
		 * How would you swap 2 strings without a 
		 * temporary variable?
		 */
		String str1 = "Hello";
		String str2 = "Goodbye";
		
		System.out.println(str1.replace(str1, str2));
		System.out.println(str1.replace(str2, str1));
		
	}
}