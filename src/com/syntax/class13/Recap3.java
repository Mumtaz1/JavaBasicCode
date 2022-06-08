package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {
		
		
		String str = "I am Confused";
		
		//from a String get the part which starts from the symbol # and ends at the symbol #
		System.out.println(str.substring(5));  //ignores letters b4 index 5 - so outputs Confused
		System.out.println(str.substring(2)); //am Confused
		System.out.println(str.substring(2, 4)); //am - note the space after 4 is ignored.
		System.out.println(str.substring(0, 1)); //outputs I
		str = "Asghar is Great";
		System.out.println(str.substring(0,6)); //Asghar

	}
}