package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of integers and calculate the sum of all 
		 * elements in an array
		 */
		int[] numbers = {10, 20, 30, 40};
		int sum = 0;
		int sum1 = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println(sum);
		
		System.out.println();
		
		System.out.println("Another way of performing the above is:");
		
		for (int i = 0; i <numbers.length; i ++) {
			sum1 += numbers[i];
		}
		System.out.println(sum1);
	}
}