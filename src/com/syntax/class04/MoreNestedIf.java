package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		/* We need to check if repl was completed
		 * If repl was completed we want to see
		 * If you did 15 and more -> did a great job
		 * If you did more than 10 -> did good job
		 * If less than 10 -> try to complete all assignments
		 */
		boolean didRepl = true;
		int assignments;
		
		if (didRepl) {
			System.out.println("How many assignments have you done?");
			assignments = 17;
			if (assignments > 15) {
				System.out.println("You did a great job");
			} else if (assignments > 10) {
				System.out.println("You did a good job");
			} else {
				System.out.println("Please complete all repl assignments");
			}			
		} else {
			System.out.println("You should complete your Repl HW");
		} 
	}
}
