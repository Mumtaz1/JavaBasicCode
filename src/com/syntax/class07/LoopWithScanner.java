package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		
		/*
		 * Using do while loop:
		 * We are going to ask you if you got a job
		 * We will continuously ask if you get a job until you say yes!
		 * Once you say yes > Congratulations!
		 */
		
		Scanner scan = new Scanner(System.in);
		String job;
		
		do {
			System.out.println(("Did you get a job"));
			job =scan.nextLine();
		} while (!job.equalsIgnoreCase("yes"));
		
		System.out.println("Congratulations!");
		
		System.out.println("---------------");
		
		/* Using while loop:
		 * We are going to ask you if you got a job.
		 * We will continuously ask if you get a job until you say yes!
		 * Once you say yes > Congratulations!
		 */
		
		Scanner input = new Scanner(System.in);
		String offer;
		
		System.out.println("Did not get a job");
		offer = input.nextLine();
		
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("Did not get a job");
			offer = input.nextLine();
		}
		System.out.println("Congratulations!");
		
	}
}