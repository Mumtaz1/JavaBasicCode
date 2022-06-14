package com.syntax.class14;

public class Recap {

	public static void main(String[] args) {
		
		String str = "I never forget about recording";
		System.out.println(str.replace("never", "always").replace("I", "Asghar"));
		
		str = "kanjkaf12333ASADNKSJ!@#$";
		System.out.println(str.replaceAll("[0-9]", "")); //kanjkafASADNKSJ!@#$
		
		String str2 = "Batch 13 is Great. Batch 13 is Best. Batch 13 is excellent";
//		String [] arr = str2.split("[.]");
		String [] arr = str2.split(" ");
		System.out.println(arr[0]);  // Batch 13 is Great
		System.out.println(arr[1]); //Batch 13 is Best
		System.out.println(arr[2]); // Batch 13 is excellent
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		str = "We #love# Java";
		String[] arr2=str.split("[#]");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);

	}
}