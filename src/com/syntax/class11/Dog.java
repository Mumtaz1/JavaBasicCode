package com.syntax.class11;

public class Dog {

	/*
	 * Create a Dog class and create 3 different objects of it: Husky, Bulldog,
	 * Labrador with specific attributes and behaviors.
	 */

	// Attributes how the object will look like

	String name;
	int age;
	String color;
	double height;
	String breed;

	// How the object behaves
	void bark() {
		System.out.println("bark");
	}

	void walks() {
		System.out.println("walks");
	}

	void eat() {
		System.out.println("likes to eat bone");
	}

	public static void main(String[] args) {

		Dog Husky = new Dog(); // creating an object and storing in a variable
		Husky.name = "Bailey";
		Husky.age = 7;
		Husky.color = "black";
		Husky.height = 3.5;
		Husky.breed = "Husky";

		Dog Bulldog = new Dog(); // creating an object and storing in a variable
		Bulldog.name = "Butch";
		Bulldog.age = 5;
		Bulldog.color = "brown";
		Bulldog.height = 5.5;
		Bulldog.breed = "Bulldog";

		Dog Labrador = new Dog(); // creating an object and storing in a variable
		Labrador.name = "Fluffy";
		Labrador.age = 6;
		Labrador.color = "white";
		Labrador.height = 2.6;
		Labrador.breed = "Labrador";
		System.out.println("My dog's name is " + Labrador.name);
		
	}
}