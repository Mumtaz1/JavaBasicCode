package com.syntax.groupproject;

public class Ex1Q3Sum2DArray {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array of integer values.
		 * Print the sum of all numbers.
		 */
	
		int[] [] values = {   {10, 20, 30, 40}, {11, 22, 33, 44}, {50, 60, 70, 80}, {51, 61, 71, 81} };
		
		int sum = 0;
		
		for (int i = 0; i < values.length; i ++) {
			for (int j = 0; j < values[i].length; j++) {
				sum += values[i][j];
			}
		}
		System.out.println("The sum of entered values is " + sum);
		}
}