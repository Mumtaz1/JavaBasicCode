package com.syntax.groupproject;

public class Ex1Q10SecLargNo {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to find the second
		 * largest number in the array
		 */
		
		int[] array = {3, 4, 7, 2, 6, 5};
		int largest = 0;
		int secondLargest = 0;
		
		for (int i = 0; i < array.length; i ++) {
			if (array[i]  > largest) {
				largest = array[i];
			}
		}
		for (int i = 0; i < array.length; i ++) {
			if (array[i] > secondLargest && array[i] < largest) {
				if (largest != secondLargest) {
					secondLargest = array[i];
				}
			}
		}
		System.out.println("The second largest array is " + secondLargest);
	}
}