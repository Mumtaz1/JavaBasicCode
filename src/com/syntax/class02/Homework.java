package com.syntax.class02;

public class Homework {

	public static void main(String[] args) {
		// To create a variable specify a data type and a name
		
				// Whole numbers:
				/*
				 *  box 1 is a variable
				 *  To create a variable we need 2 things: data type and name
				 */
				byte box1 = 127;
				short box2 = 32767;
				int box3 = 76666; // this will be mostly used
				long box4 = 45678909876543L; // The L can be lower or upper case and means its long
				
				// Decimal values:
				float container1 = 1.99F; // Need to add F at the end to indicate a Float
				double container2 = 89.99;
				
				// To represent 1 character (make sure you put it in single quotes):
				char gender = 'm';
				char dollar = '$';
				
				// To represent true or false (yes or no)"
				boolean hungry = true;
				boolean sleepy = false;
				
				// How to access values from variables?
				System.out.println(container2);
				
				// Access and print values from all variables:
				System.out.println(box1);
				System.out.println(box2);
				System.out.println(box3);
				System.out.println(box4);
				System.out.println(container1);
				System.out.println(container2);
				System.out.println(gender);
				System.out.println(dollar);
				System.out.println(hungry);
				System.out.println(sleepy); 		// outputs false
				System.out.println("sleepy"); 	// outputs sleepy
				
				// System.out.println(box5); This line will give error because it should be after line 47.
				int box5 = 900;
				System.out.println(box5);
				
				int year = 2022; // Create a variable and store a value
				System.out.println(year); 	// Will output 2022
				
				year = 2023;						// Note we did not specify data type here because we are re-assigning the value for the year variable
				System.out.println(year); 	// Will output 2023
				
				

			}

		}

