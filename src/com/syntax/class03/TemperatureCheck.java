package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		/* Create a Java program and name it Temperature Check. 
		 * Create a variable to store temperature. Your program should check 
		 * if temperature is below 32 then it should print "Water will freeze with
		 * temperature _.", otherwise "Water will NOT freeze with temperature _." 
		 * 
		 */
		
		int temp = 30;
		if (temp < 32) {
			System.out.println("Water will freeze with temperature" + temp);
			System.out.println("It is cold outside");
			System.out.println("Make sure to use a jacket and a scarf");
		} else {
			System.out.println("Water will NOT freeze with temperature" + temp);
			System.out.println("It is not that cold outside then");
		}
			System.out.println("This code is outside of if block");
	}

}