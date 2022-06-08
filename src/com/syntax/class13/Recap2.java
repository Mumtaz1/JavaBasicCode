package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {

		String str = "Where is Sameer?";
		System.out.println(str.charAt(3)); // r
//		System.out.println(str.charAt(50));   // IndexOutOfBoundException
		System.out.println(str.charAt(5)); // is a space
		System.out.println(str.indexOf("i")); // 6

		System.out.println(str.indexOf("e", 6)); // starts searching from index 6. So it outputs 12.

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'e') {
				counter++;
				if (counter == 4) {
					System.out.println(i); // print 13
				}
			}
		}
	}
}