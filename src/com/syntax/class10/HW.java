package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		
		/*
		 * Create an array to store double values and then
		 * print all elements using 2 different loops.
		 */
		double[] num = {2.99, 3.99, 4.99, 5};
		for (double x : num) {
			System.out.println(x + " ");
		}
		System.out.println();
		
		System.out.println("Another way of performing the above is");
		for (int i = 0; i < num.length; i ++) {
			System.out.print(num[i] + " ");
		}
		
		/*
		 * Create an array of integers and calculate the sum of all 
		 * elements in an array
		 */
		int[] numbers = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for (int i = 0; i <numbers.length; i ++) {
			sum += numbers[i];
		}
		System.out.println("Sum of all elements = " + sum);
		
		System.out.println("Another way of performing the above is:");
		//Enhanced for loop
		
		sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		System.out.println("Sum of all elements = " + sum);	
	}
}