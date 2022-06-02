package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {

		int day = 3;
		String name;
		
		//If is a condition based statement
		
		if (day == 1) {
			name = "Monday";
		} else if (day == 2) {
			name = "Tuesday";
		} else if (day == 3) {
			name = "Wednesday";
		} else if (day == 4) {
			name = "Thursday";
		} else if (day == 5) {
			name = "Friday";
		} else if (day == 6) {
			name = "Saturday";
		} else if (day == 7) {
			name = "Sunday";
		} else {						// always is the last block
			name = "Invalid";
		}
		System.out.println(name);

		// Below code using switches.
		// Switch is a value based statement
		
		// Note if you don't use break statement then it goes to the next case, and the next 
		// case until it reaches default and then prints out Invalid. So you need break

		switch (day) {
		case 1:
			name = ("Monday");
			break;
		case 2:
			name = ("Tuesday");
			break;
		case 3:
			name = ("Wednesday");
			break;
		case 4:
			name = ("Thursday");
			break;
		case 5:
			name = ("Friday");
			break;
		case 6:
			name = ("Saturday");
			break;
		case 7:
			name = ("Sunday");
			break;
		default: 						//default can be anywhere in the order of cases. But usually s/b the last one.
			name = "Invalid";
			break;						//This break is optional because it is at the end of the switch block
		}
		System.out.println(name);
	}
}