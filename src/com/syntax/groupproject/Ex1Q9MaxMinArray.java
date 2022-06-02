package com.syntax.groupproject;

public class Ex1Q9MaxMinArray {

	public static void main(String[] args) {
		
		/*
		 * Maximum and minimum number in the array
		 */
		
		int[] numbers = {8, 907, 15, 62, 5, 156, 2736};
		int maxNum = 0;
		int minNum = numbers[0];
		
		for (int i = 0; i < numbers.length; i ++ ) {
			if (maxNum < numbers[i]) {
				maxNum = numbers[i];
			}	
		}
		System.out.println("The maximum number in 'numbers' array is " + maxNum);
		
		System.out.println("------------------");
		
		for (int i = 0; i < numbers.length; i ++ ) {
			if (minNum > numbers[i]) {
				minNum = numbers[i];
			}
		}
		System.out.println("The minium number in 'numbers' array is " + minNum);
	}
}