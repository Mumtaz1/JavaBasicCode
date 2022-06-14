package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo1 {
		
	/*
	 * What is a Method: A Method is a block of code, a group
	 * of Java statements that are grouped together and
	 * we can execute those statements by just 
	 * creating an object of the class that contains
	 * How: that method and by writing the object name.method
	 * name
	 */
	
		void printHello() {
			System.out.println("How are you guys");
		}
		
		boolean returnTrue() {
			return true;
		}
		
		int returnInt() {
			return 10;
		}
		
		//Methods that return something and Methods that don't return something
		public static void main(String[] args) {
			MethodsDemo1 md = new MethodsDemo1();
			md.printHello(); //How are you guys
			
			boolean xs = md.returnTrue();
			int num = md.returnInt();
			System.out.println(num); //10
			System.out.println(md.returnInt());
			
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			
	}
}