package com.syntax.class12;

import java.util.Scanner;

public class HW3BoyOrGirl {

	public static void main(String[] args) {

//See instructors code in class13 - Task3
		
		/*
		 * Write a program that reads two people's first names and if they are expecting
		 * boy or girl. Based on the input suggest a name for a baby: Example Output:
		 * Mom's first name? Mary Dad's first name? Daniel Boy or Girl? boy Suggested
		 * baby name: DANRY
		 * 
		 * Example Output: Mom's first name? Mary Dad's first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Mom to be please enter your first name only:  ");
		String nameMom = in.nextLine();

		System.out.println("Dad to be please enter your first name only: ");
		String nameDad = in.nextLine();
		
		System.out.println("Are you expecting a boy or a girl?  ");
		String gender = in.nextLine();

		if (gender.equalsIgnoreCase("Boy")) {
			//So the substring(0,2) means get char starting at index 0 and ending at index 2 from Mom's name = Mary that would be Ma
			// and substring(3,5) means get char starting at index 3 and ending at index 5 from Dad's name = Daniel that wouuld be iel
			// so the baby girl's name is a concatenation of Ma + iel = Maiel.
			System.out.println("Suggested baby name: " + nameMom.toUpperCase().substring(0,2) + nameDad.toUpperCase().substring(3,5) ) ;
		} else if (gender.equalsIgnoreCase("Girl")) {
			System.out.println("Suggested baby name: " + nameMom.toUpperCase().substring(0,2) + nameDad.toUpperCase().substring(3,6));
		} else {
			System.out.println("Unknown name for the baby");
		}
		in.close();
	}
}