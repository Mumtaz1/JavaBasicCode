package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {

		int time = 1;

		if (time < 12) {
			System.out.println("Morning"); // 1
		}

		System.out.println("----------");

		/*
		 * while (time < 12) { System.out.println("Morning"); // infinite loop
		 */

		while (time < 12) {
			System.out.println(" Good Morning"); // 11
			time++;
		}
		System.out.println("Hello"); //1
		
		/*
		 while (time < 12) {
		 	System.out.println("Morning");    	//infinite loop
		 }
		*/  
	}
}