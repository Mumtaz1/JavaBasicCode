package com.syntax.class07;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		
		int num = 10;
		// Post increment. First use and then increment
		
		int result = num++;
		
		System.out.println("Value of num = " + num); //11
		System.out.println("Value of result = " + result); //10
		
		
		int num1 = 10;
		//Pre-increment. First increment and then use
		
		int result1 = ++ num1;
		
		System.out.println("Value of num1 = " + num1); //11
		System.out.println("Value of result1 = " + result1); //11

	}
}