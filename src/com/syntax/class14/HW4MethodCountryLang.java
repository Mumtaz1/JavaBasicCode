package com.syntax.class14;

public class HW4MethodCountryLang {

	/*
	 * Create a method that will say Hello in different language based on the
	 * country that is passed when method is executed.
	 */

	void language(String location) {
		if (location.equalsIgnoreCase("USA")) {
			System.out.println("Hello");
		} else if (location.equalsIgnoreCase("Saudi Arabia")) {
			System.out.println("Asalaam Alaikum");
		} else if (location.equalsIgnoreCase("Spain")) {
			System.out.println("hola");
		} else if (location.equalsIgnoreCase("France")) {
			System.out.println("Bonjour");
		} else {
			System.out.println("Unknown country");
		}

	}

	public static void main(String[] args) {

		HW4MethodCountryLang country = new HW4MethodCountryLang();
		country.language("Saudi Arabia");
		country.language("Japan");

	}
}