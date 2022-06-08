package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		
		String str = "Batch 13 is great but I say this to every batch. I was kidding";
//		System.out.println(str.length());
		int len = str.length();
		System.out.println(str.toUpperCase());
		str = str.toUpperCase();  //re-assigns str to upper case.
		System.out.println(str);
		str = " ";
		System.out.println(str.isEmpty());  // true 
		
		String str2 = " Tara          ";
		System.out.println(str2.trim());
		str = "Batch 13 is great but I say this to every batch. I was kidding";
		System.out.println(str.contains("z"));
		System.out.println(str.startsWith("Batch")); // true
		System.out.println(str.endsWith("ing")); // true
		
	}
}