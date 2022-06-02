package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char choice = 'Y';
		String meaning;
	
		//Variable and matching cases MUST BE of the SAME type
		//Switch does not allow to have duplicate cases.
		
		switch(choice) {
			
		case 'Y':
			meaning = "Yes";
			break;
		case 'M':
			meaning = "Maybe";
			break;
		case 'N':
			meaning = "No";
			break;
		default:
			meaning = "Unknown";
		}
		System.out.println(meaning);
	}
}