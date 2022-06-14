package com.syntax.class14;

public class HW7MethodGrade {
	
	/*
	 * Create class Student that will have a 
	 * method getGrade. YourMethod should
	 * accept the score of a student and
	 * return a grade:
	 * Score > 90 - A
	 * Score > 80 - B
	 * Score > 70 - C
	 * Score > 50 - D
	 * Anything else - F
	 */

	char grades(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score < 90 && score >= 80) {
			return 'B';
		} else if (score <80 && score >= 70) {
			return 'C';
		} else if (score < 70 && score >= 50) {
			return 'D';
		} else {
			return 'F';
		}
	}
		
	public static void main(String[] args) {
		
		HW7MethodGrade grade = new HW7MethodGrade();
		System.out.println(grade.grades(97));
	}
}