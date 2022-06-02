package com.syntax.groupproject;

import java.util.Scanner;

public class Ex1Q2ScanCountryCap {

	public static void main(String[] args) {
		
		int num = 3;
		Scanner in = new Scanner(System.in);
		String countries[] = new String[num];
		String capitals[] = new String[num];
		for (int i = 0; i < num; i ++) {
			System.out.println("Enter the name of a country: ");
			countries[i] = in.nextLine();
			System.out.println("Enter it's capital: ");
			capitals[i] = in.nextLine();
		System.out.println(" The capital of " + countries[i] + " is " + capitals[i]);
		}
	}
}