package com.syntax.class13;

public class HW3CtSentences {

	public static void main(String[] args) {
		
		/*
		 * You have a String a = "Is it Saturday?
		 * Is it raining? Do we have a Java Class
		 * today?"
		 * How would you find out how many
		 * sentences are in that String?
		 */
		
		int count = 0;
		String str = "Is it Saturday? Is it raining? Do we have a Java Class today?";	
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) == '?') {
				count ++;
			}
		}
		System.out.println(count);
	}
}