package com.syntax.class03;

public class Task {

	public static void main(String[] args) {
		
		/* Create a Java program to store 2 values for expected and actual
		 * hours. Your program should check:
		 * 1. If expected hours are more than actual then print "You will love the course
		 *     and you will succeed".
		 *  2. Otherwise print "Course will be very hard for you!"   
		 * 
		 */
		int expectedHrs = 40;
		int actualHrs = 30;
		if (expectedHrs > actualHrs) {
			System.out.println("You will love the course and you will succeed");
		} else {	
			System.out.println("Course will be very hard for you!");
		}
	}
}
