package com.syntax.class08;

import java.util.Scanner;

public class HW3Clock {

	public static void main(String[] args) {

		/*
		 * Using nested loop, create a 24 hour clock that will display 2 digits for an
		 * hour and 2 digits for a minute. Example: 10:00 10:01 etc.
		 */

//		int hour, min;

		for (int hour = 0; hour <= 24; hour++) {
			for (int min = 0; min <= 59; min++) {
				if (hour < 10 && min < 10) {
					System.out.println("0" + hour + ":" + "0" + min); // we are adding a leading 0 if hr or min < 10
				} else if (hour >= 10 && min >= 10) {
					System.out.println(hour + ":" + min);
				}
			}
		}
	}
}