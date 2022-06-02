package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		// A nested if statement is an if-else statement within another if or else block
				int age = 26;
				if (age < 18) {
					System.out.println("You are a teenager, please dpn't work");
				} else {
					System.out.println("You are older than 18"); //You are older than 18
					
					if (age < 64) {
						System.out.println("You are eligible to work"); 	//You are eligible to work
					} else {
						System.out.println("Enjoy your life");		
					}	
				}	
		
				boolean vaccine = true;
				int dose =1;
				
				if (vaccine) {
					System.out.println("Let me check how many doses you have");
					if (dose == 1) {
						System.out.println("You need 1 more shot");
					} else {
						System.out.println("You are fully vaccinated");
					}
				}
				
				String month = "May";
				int day = 19;
				
				if (month.equals("May")) {
					System.out.println("Let me check what is today's date");
					
					if (day == 8) {
						System.out.println("Today is Mother's Day");
					}
				} else if (month.equals("June")) {
					System.out.println("Let me check day in June");
					
					if (day == 19) {
					System.out.println("Today is Father's Day");
					}
				}
	}
}
