package com.syntax.class13;

public class HW4ReverseWords {

	public static void main(String[] args) {
		
		/*
		 * How would you reverse a String word 
		 * by word? For example
		 * Input:
		 * This is sentence I want to reverse
		 * Output:
		 * sihT si ecnetnes i tnaw ot esrever
		 */
		
		String text = "This is sentence I want to reverse";
		String [] words = text.split(" ");
		String reverseWords = "";
		
		for (String word : words) {
			String rev = "";
			for (int i = word.length() -1; i >= 0; i --) {
				rev += word.charAt(i);
			}
			reverseWords += rev + " ";
			}
			System.out.println(reverseWords);
	}
}