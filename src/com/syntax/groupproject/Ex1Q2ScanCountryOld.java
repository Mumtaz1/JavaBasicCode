package com.syntax.groupproject;

import java.util.Scanner;

public class Ex1Q2ScanCountryOld {

	public static void main(String[] args) {
		
		/*
		 * Using Scanner create an array of countries. When 
		 * an array is created, retrieve all values from it and
		 * while retrieving those values print the capital of
		 * each country. (Use 2 different loops).
		 */

		// This is not correct
		
		Scanner in = new Scanner(System.in);
		String[] [] arr = new String[4] [4];
		
		for (int i = 0; i < arr.length; i ++) {
			for (int j = 0; j < arr[0].length; j ++) {
				System.out.println("Enter the name of a country");
				arr[i] [j] = in.nextLine();
				
				System.out.println("Enter the capital of the country");
				arr[i] [j] = in.nextLine();
				
				System.out.println("The capital for the country: " + arr[i] [j]);
			}
		}
	}
}