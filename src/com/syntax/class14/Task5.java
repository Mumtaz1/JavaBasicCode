package com.syntax.class14;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		/*
		 * How would you check if String is
		 * a palindrome or not? aba ==> true
		 * Abbc => false
		 */
		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		String givenString = inp.nextLine();
		String str = givenString.replaceAll(" ", "");
		str = str.toLowerCase();
		int count = 0;
		boolean palin = true;
		
		for (int i = str.length() -1; i >= 0; i --) {
			if (str.charAt(i) == str.charAt(count)) {
				count ++;
			}else {
				palin = false;
			}
		}
		System.out.println(palin);
		inp.close();

	}
}