package com.syntax.class14;

public class Task4 {

	public static void main(String[] args) {
	
		//This is instructors code for HW4ReverseWords in class13
		
		/*
		 * How would you reverse a String word 
		 * by word? For example
		 * Input:
		 * This is sentence I want to reverse
		 * Output:
		 * sihT si ecnetnes i tnaw ot esrever
		 */
		
		String str = "This is sentence I want to reverse";
		String[] arr = str.split(" " );
		
		for (String s : arr) {
			System.out.print(new StringBuilder(s).reverse() + " ");
		}
		//new StringBuilder (s) object of StringBuilder is created
		System.out.println();
		System.out.println(new StringBuilder(str).reverse());
	}
}