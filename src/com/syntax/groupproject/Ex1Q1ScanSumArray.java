package com.syntax.groupproject;

import java.util.Scanner;

public class Ex1Q1ScanSumArray {

	public static void main(String[] args) {
		
		/*
		 * Using Scanner create an array of integer values.
		 * After the array is created, calculate the sum of 
		 * all stored elements in that array
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type 4 values you want to store in the array");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		
		int sum = 0;
		
		int[] values = {num1, num2, num3, num4};
		for (int i = 0; i < values.length; i ++) {
			sum = sum + values[i];
		}
		System.out.println("The sum of all these stored elements is " + sum);
	}
}