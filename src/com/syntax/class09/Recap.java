package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello"); 		//5
			
			for (int y = 1; y >=3; y++) {	
				System.out.println("Bye");   	//0
			}
		}
		System.out.println("----------------");		
		/*					 
		 for (int i = 1; i <= 5; i++) {
				System.out.println("Hello"); 
				
				for (int y = 1; y <=3; y--) {		//infinite loop
					System.out.println("Bye");
				}	
			}
			*/	
		System.out.println("----------------");	
		 for (int i = 1; i <= 5; i++) {
				System.out.println("Hello"); 		//5 times
				
				for (int y = 1; y <=3; y++) {		
					System.out.println("Bye");		//3 times. So, it prints Hello, then 3 times bye, repeats 5 times
				}	
			}
		 System.out.println("----------------");	
		 for (int i = 1; i <= 5; i++) {
				System.out.println("Hello" + i); // 5 times and appends 1-5
				
				for (int y = 1; y <=3; y++) {		
					System.out.println("Bye" + y); //5 times. So, it prints Hello1,Bye1, then Hello2, Bye1, 
					// Hello3, Bye1, then Hello4, Bye1, then Hello5, Bye1
					break;
				}	
			}
		 System.out.println("----------------");	
		 for (int i = 1; i <= 5; i++) {
				System.out.println("Hello" + i);  //5 times
				
				for (int y = 1; y <=3; y++) {		
					System.out.println("Bye" + y); //3 times. So, it prints Hello1, Bye1, Bye2, Bye3, then
					//Hello2, Bye1, Bye2, Bye3, then Hello3, Bye1, Bye2, Bye2, Bye3, etc.
					continue;
		//			System.out.println("Bye");
				}	
			}
	}
}