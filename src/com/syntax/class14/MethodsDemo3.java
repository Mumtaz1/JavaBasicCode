package com.syntax.class14;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3 md = new MethodsDemo3();
		System.out.println(md.isEven(3));
		System.out.println(md.checkString("hello"));
	}
	
	/*
	 * Write a method that take a String and returns
	 * true if number of characters in that string
	 * are even otherwise odd
	 */
	
	boolean checkString(String str) {
		
		if (str.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Write a method that takes an integer
	 * value. If that value is even this method
	 * returns true, otherwise it returns false.
	 */
	
	boolean isEven(int number) {
		
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}	
}