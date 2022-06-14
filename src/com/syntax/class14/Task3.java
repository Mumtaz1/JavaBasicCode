package com.syntax.class14;

public class Task3 {

	public static void main(String[] args) {
	
		// This is the same as my HW3CtSentences in class13
		
		/*
		 * You have a String a = "Is it Saturday?
		 * Is it raining? Do we have a Java Class
		 * today?"
		 * How would you find out how many
		 * sentences are in that String?
		 */
		
		int count = 0;
		String str = "Is it Saturday? Is it raining? Do we have a Java Class today?";	
		System.out.println(str.split("[?]").length);
		//Note if line 18 had period and exclamation point then type the below
		//System.out.println(str.split("[?.!]").length);
	}
}