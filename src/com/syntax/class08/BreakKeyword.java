package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
	
		// break - breaks block of code. Break needs to be inside a condition.
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");	
			if (i == 2) {
				break;
			}
		}

		boolean summer = true;
		int temp = 95;
		
		while (summer) {
			
			System.out.println("it is hot");
			if (temp < 70) {
				System.out.println("It is not hot anymore");
				break;
			}
			temp -= 10;	//decreases temp by 10
		}
		
	}
}