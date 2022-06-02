package com.syntax.class05;

import java.util.Scanner;

public class HW2ConvertFahrnToCel {

	public static void main(String[] args) {
		
		/* 
		 * Create a Java program that will ask the user to input city and 
		 * temperature. Your program should convert Fahrenheit into
		 * Celsius and print "The temperature in the city _ is _"
		 */
		
		Scanner scan = new Scanner(System.in);	//Create a Scanner object
		
		System.out.println("Please emter the city you reside in ");
		String city = scan.nextLine();  // capture string
		
		System.out.println("Please emter the current temperature in Fahrenheit ");
		double fahrenheit  = scan.nextDouble();
		
		double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
		System.out.println("The temperature in the city " + city + " is "  +  celsius );
	}
}