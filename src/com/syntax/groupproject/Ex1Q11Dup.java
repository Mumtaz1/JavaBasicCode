package com.syntax.groupproject;

public class Ex1Q11Dup {

	public static void main(String[] args) {
		
		/*
		 * Write a program to print out duplicate
		 * elements from an Array of Strings
		 */
		String[] names = {"Jack", "Jill", "Thomas", "Fred", "Jill", "Penny", "Thomas"};
		
		for(int i = 0; i < names.length; i ++ ) {
			for (int x = i+1; x < names.length; x ++) {
				if ((names[i].equals(names[x]))) {
					System.out.println(names[x] + " ");
				}
			}
		}
	}
}