package com.syntax.class11;

public class Task11 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array
		 * This is the same as Task10. Written another way.
		 */
		
	int [] arr = {10, 20, 5, 6, 8, 200};
		
		int maxNumber = arr[0];  //10 for now since its 1st number listed.
		int secondLargest = arr [0];  //10
		for (int num : arr) {
			
			if (num > maxNumber) {
				secondLargest = maxNumber;
				maxNumber = num;
			}
			if (num > secondLargest && secondLargest < maxNumber && num < maxNumber) {
				secondLargest = num;
			}
		}
		System.out.println(maxNumber);
		System.out.println(secondLargest);
	}
}