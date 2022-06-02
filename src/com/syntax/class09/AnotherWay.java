package com.syntax.class09;

public class AnotherWay {

	public static void main(String[] args) {
		
		String[] fruits = {"mango", "apple", "kiwi", "pear", "watermelo", "melon"};
			System.out.println(fruits[2]);  //kiwi
//			fruits[4] = "peach"; RE = run time error - ArrayIndexOutOfBoundsException
			
			System.out.println("My favorite fruit is " + fruits[0]);  // My favorite fruit is mango
			
			//I want to find a size of an array
			int size = fruits.length;
			System.out.println(size);  //6
			
	}
}