package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Using Scanner create an array of integer values. 
		 * After the array is created, calculate the sum of all 
		 * stored elements in that array.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize = scanner.nextInt(); // takes input from keyboard and stores in arraySize
		System.out.println("The size of the array is " + arraySize);
		int [] integerArray = new int[arraySize]; // creating an array of size that will entered by user
		//we cannot use enhanced for loop since we can't insert or modify a value. We can only retrieve a value.
		System.out.println("Please enter " + arraySize + " elements");
		
		for (int i  = 0; i < integerArray.length; i ++) {
			integerArray[i] = scanner.nextInt(); // so 1st time whatever value is entered by user and it will be stored in index 0
		}
		
		System.out.println(Arrays.toString(integerArray));  //prints out elements of the array.
		
		int sum = 0;
		for (int element : integerArray) {  // enhanced for loop where we access elements 1 by 1 
			sum = sum + element;   // take the elements from the array 1 by 1 and add them to the sum variable.
		}
		System.out.println("The sum of all the elements is " + sum);
		
	}
}