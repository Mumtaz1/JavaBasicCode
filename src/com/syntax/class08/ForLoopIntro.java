package com.syntax.class08;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		//Step1: does initialization i.e. i = 1
		//Step 2: checks condition i.e. i <= 5
		//Step 3: does the print
		//Step 4: then does the increment
		
		
		// I want to say GM 5 times
		for (int i = 1; i <= 5; i++) {
			System.out.println("Good morning!");  //print 5 times
		}
		
		System.out.println("------------------------------");
		
		for (int i = 1; i >= 5; i++) {		
			System.out.println("How are you"); //print 0 times
		}
		
		System.out.println("--------------------------------------");
		
/*		for (int i = 1; i <= 5; i--) {		
			System.out.println("Hello");   //will get an infinite loop
		}
*/
	}
}