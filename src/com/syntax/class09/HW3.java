package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		
		/*
		 * Create an array to store double values and then
		 * print all elements using 2 different loops.
		 */
		double[] values = {10.5, 20.4, 30.3, 40.2};
		for (double num : values) {
			System.out.println(num);
		}
		System.out.println();
		
		System.out.println("Another way of performing the above is");
		for (int i = 0; i < values.length; i ++) {
			System.out.println(values[i] + " ");
		}
	}
}