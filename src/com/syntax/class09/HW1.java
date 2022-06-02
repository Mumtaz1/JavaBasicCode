package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of cars and store 6 elements into it.
		 * Using 2 different loops print all values from the array.
		 */
		String[] cars = {"BMW", "Audi", "Toyota", "Mercedez", "Porsche", "Honda"};
		for (String car : cars) {
			
			System.out.println(car + " ");
		}
		System.out.println( );
		
		System.out.println("Another way of performing the above is:");
		for (int i = 0; i <cars.length; i ++) {
			System.out.println(cars[i] + " ");
		}
	}
}