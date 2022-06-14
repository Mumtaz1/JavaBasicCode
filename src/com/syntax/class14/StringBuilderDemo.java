package com.syntax.class14;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String s = new String("hahahaha");
		System.out.println(s.toUpperCase());
		StringBuilder st = new StringBuilder("jajajaj");
		System.out.println(st.reverse());
		
		/*
		 * String and StringBuilder both are classes that we can use
		 * to store and manipulate characters. 
		 * But String is immutable and StringBuilder is mutable.
		 * When we make a lot of changes to a String it creates
		 * multiple copies inside your memory and because of
		 * this reason because for every change a new variable
		 * is created.
		 */

	}
}