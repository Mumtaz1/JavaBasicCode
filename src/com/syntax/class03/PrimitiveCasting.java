package com.syntax.class03;

public class PrimitiveCasting {

	//Type main then press ctrl + space to auto complete the main method below
	public static void main(String[] args) {
		
		int i = 100;
		double d = 100; 	//widening
		
		System.out.println(i);		//100
		System.out.println(d);	//100.0
		
		long l = 1000;
		System.out.println(l); 	//1000
		
		//byte b = 130; - error: Type mismatch: cannot convert from int to byte
		// int x = 99.99; - error: Type mismatch: cannot convert from double to int
		int x = (int) 99.99; 	//99 - here we are narrowing. 
		System.out.println(x);
		
		//byte b = 130; get an error. So type the below
		byte b = (byte) 130; 
		System.out.println(b); 	//-126
		
		//float f = 10.99f; // Error: Type Mismatch cannot convert from double to float
		double dd = 9.99;
		
		double price = 100;
		
	}
}
