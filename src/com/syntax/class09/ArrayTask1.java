package com.syntax.class09;

public class ArrayTask1 {

	public static void main(String[] args) {
		
		/* Create an array of chars and store grades into
		 * it: A, B, C, D, E, F. Then print a grade B
		 * (use 2 different ways of creating an array).
		 */

		char[] grade =  new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = '5';
		
		System.out.println(grade[1]);
		
		System.out.println("- Another way to write it -");
		
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		/*
		 * System.out.println(grades[0]);
		 * System.out.println(grades[1]);
		 * System.out.println(grades[2]);
		 */
		
		//Note if you want to print all the elements:
		for (int i = 0; i < grades.length; i ++) {
			System.out.print(grades[i] + " ");  
		}
	}
}