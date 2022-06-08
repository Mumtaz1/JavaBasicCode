package com.syntax.class11;

import java.util.Scanner;

public class Dog1 {

	//Attributes how the object will look like
	
	String name;
	int age;
	double weight; //properties / attribute fields
	String color;
	double height;
	String breed;
	
	// How the object behaves
	void bark() {
		System.out.println("Dog barks");
	}
	void walks() {
		System.out.println("Dog walks");
	}
	void eat() {
		System.out.println("Dogs like to eat bone");
	}
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in); { // ctrl + click on windows 
//		scanner.next();

		Dog1 jimmy = new Dog1();  //creating an object and storing in a variable
		jimmy.name = "Jimmy";
		jimmy.age = 6;
		jimmy.weight = 16;
		jimmy.color = "black";
		jimmy.height = 2.6;
		jimmy.breed = "German";
		jimmy.bark();
		
		}
		// new Dog() how we create an object
}