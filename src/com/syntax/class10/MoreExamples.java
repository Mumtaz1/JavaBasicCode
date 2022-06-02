package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		
		int [] [] nums = {
				{1, 2, 3, 4, 5},
				{199, 300, 588, 700},
				{1900, 4578, 98787}
		};
		
		System.out.println("All values using enhanced for loop");
		
		/*
		 * Enhanced for loop uses variables to access elements from
		 * an array
		 * Outer for loops -> iterates over 1D array
		 * Inner loop -> iterates over elements of each 1D array
		 */
		
		for (int []  num : nums) {
			for (int n : num ) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		/*
		 * i loop iterates over rows
		 * nums.length gives # of arrays inside 2D array = 3
		 * j loop iterates over columns
		 */
		
		System.out.println("All values using for loop");
		for (int i = 0; i < nums.length; i ++ ) {
			for (int j = 0; j < nums[i].length; j ++) {
				System.out.print(nums[i] [j] + " ");
			}
			System.out.println();		
		}	
	}
}