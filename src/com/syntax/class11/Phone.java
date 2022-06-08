package com.syntax.class11;

public class Phone {

	/*
	 * Create a Class "Phone". 
	 * Create 3 objects of it: iPhone, Pixel, Samsung with
	 * specific attributes and behaviors.
	 */
	// Attributes how the object will look like

		String modelName;
		String modelNumber;
		int capacity;

		// How the object behaves
		void powerOn() {
			System.out.println("Welcome to iPhone 11");
		}
		
		void rings() {
			System.out.println("rings");
		}

		void powerOff() {
			System.out.println("Goodbye");
		}

		public static void main(String[] args) {

			Phone iPhone = new Phone(); // creating an object and storing in a variable
			iPhone.modelName = "iPhone11";
			iPhone.modelNumber = "MW123ABC";
			iPhone.capacity = 128;
			iPhone.powerOn();
			System.out.println("Please enter your Passcode");

			Phone Pixel = new Phone(); // creating an object and storing in a variable
			Pixel.modelName = "Pixel";
			Pixel.modelNumber = "ABC456XYZ";
			Pixel.capacity = 128;
//			Pixel.rings();

			Phone Samsung = new Phone(); // creating an object and storing in a variable
			Samsung.modelName = "Samsung";
			Samsung.modelNumber = "LMN24689";
			Samsung.capacity = 256;
//			Samsung.powerOff();

		}
}