package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * From an array of integer elements find the largest number
		 */
		int tempVal, size;
		int[] values = {5, 20, 100, 3, 6};
		size = values.length;
		
		for (int i = 0; i < size; i ++) {
			for (int j = i + 1; j < size; j ++) {
				if (values [i] > values [j]) {
				tempVal = values[i];
				values[i] = values[j];
				values[j] = tempVal;
				}
			}	
		}
		System.out.println("The largest element is " + values[size -1] );
		}
	}