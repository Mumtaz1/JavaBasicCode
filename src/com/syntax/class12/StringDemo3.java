package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str = "Batch 13 is Great";
		System.out.println(str.startsWith("Batch")); //true
		System.out.println(str.startsWith("Frozen")); //false
		System.out.println(str.endsWith("t")); //true
		System.out.println(str.endsWith("Great"));  //true
		System.out.println(str.endsWith("great"));  //false
		System.out.println(str.toLowerCase().endsWith("great"));  //true
		
		String name = "HAMID";
		System.out.println(name.toLowerCase()); // hamid
		System.out.println(name); // outputs caps HAMID
		
		System.out.println(str.contains("13"));
		System.out.println(str.contains("is"));
		System.out.println(str.toLowerCase().contains("batch"));

	}
}