package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		
		/* Switch can work with byte, short, int, char, String
		 * 
		 * Switch has a datatype limitation
		 *
		 * Switch cannot work with double, float, long, boolean
		 */

		double price = 10;
		
/* switch(price) {	 // CE = Compiler error - cannot switch on a value of type double
 * 		
 */
		
		
		boolean hungry = true;
		
//		switch(hungry) { CE = Compiler error - cannot switch on a value of type boolean
		
		/*
		 * Switch has a operators limitation
		 * cannot use logical operators inside switch
		 * cannot use relational operators
		 */
		char choice = 'Y';
		String meaning;
				
//		switch(choice) {
		
/*		case 'Y':] || 'y';  				CE = Compiler error - cannot use ||
				meaning = "yes";
				break; */
		
		/* int day = 5;
		 * 
		 * switch(day) {
		 * case > 5; 
		 * }
		 */
		
		
	}
}