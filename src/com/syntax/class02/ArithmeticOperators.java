package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1 = 40;
		int num2 = 20;
		
		int sum, sub, mult, div;
		
		System.out.println(num1/num2); // Outputs 2
		
		sum = num1+num2;
		System.out.println(sum); 			// Outputs 60
		
		sub = num1-num2;
		System.out.println(sub);		// Outputs 20
		
		mult = num1 * num2;
		System.out.println(mult);		// Outputs 800
		
		div = num1 / num2;
		System.out.println(div);		// Outputs 2
		
		double num3 = 9.99;
		double num4 = 3.50;
		// double sum1 = num3 + num4;
		// System.out.println(sum1);
		
		double sum1, sub1, multi1, div1;
		sum1 = num3 + num4;
		
		int a = 10;
		int b = 3;
		int result = a / b;
		System.out.println(result);	// Outputs 3
		
		double c = 10.0;	// double is used more often than float
		double d = 3.0;
		double result2 = c/d;
		System.out.println(result2);	// Outputs 3.3333333333333335
		
		float e = 10.0f;
		float f = 3.0f;
		float result3 = e/f;
		System.out.println(result3);	// Outputs 3.3333333
		
		
		
	}

}
