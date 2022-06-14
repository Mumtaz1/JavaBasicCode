package com.syntax.class14;

public class HW3MethodPalindrome {
	
	/*
	 * Create a method that will print whether 
	 * given String is palindrome or not.
	 */
	
	void isPalindrome(String str) {
		String rev = "";
		for (int i = str.length() -1; i >= 0; i --) {
			rev += str.charAt(i);
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
	}

	public static void main(String[] args) {
		
		HW3MethodPalindrome word = new HW3MethodPalindrome();
		word.isPalindrome("racecar");
		word.isPalindrome("abbc");
	
	}    
}