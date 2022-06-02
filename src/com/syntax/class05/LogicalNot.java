package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo =! true;
		System.out.println(boo); // false

		boolean boo1 =! false;
		System.out.println(boo1); //true
		
		/*
		 * If there is no traffic > I will reach work on time
		 */
		boolean traffic = false;
		if(!traffic ) {			//not operator used here
			System.out.println("I will reach work on time");
		}
		
		String name = "Reza";
		if (!name.equals("Emre"))	//not operator used here
			System.out.println("You are nit Emre, and I need Emre");	
	}
}