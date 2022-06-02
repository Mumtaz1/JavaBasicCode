package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		String[] disney = {"Elsa", "Shrek", "Goofy", "Mulan", "Tom&Jerry"};
			System.out.println(disney[1]);   // Elsa
			System.out.println("All elements using regular for loop");
			
			//to get all elements from array
			for (int i=0; i < disney.length; i++) {
	//			System.out.print(disney[i] + " ");
				if (disney[i].equalsIgnoreCase("Shrek")) {
					System.out.println(disney[i] + " is my favortite character");
				} else {
					System.out.println(disney[i]);
				}
			}
			System.out.println("All elements using regular for loop");
			//Enhanced for loop
			
			for(String character : disney ) {
				if (character.equalsIgnoreCase("Mulan")) {
	//				System.out.println(character + " is my favorite character");
					continue; // Mulan is skipped and goes back to line 17
				}else {
				System.out.println(character + " ");
			}
			
		}
	}
}