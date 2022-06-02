package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		
		int num = 100;
		
		num = num + 100;		//Reassigning value in num
		System.out.println(num);  //200
		
		num = num + 50;
		System.out.println(num);  //250
		
		num += 100;  //shorthand for num = num + 100
		
		num -= 10;	// shorthand for num = num - 10
		System.out.println(num);		//340
		
		num /= 10;	// shorthand for num = num / 10
		
		num *= 2;		// shorthand for num = num * 2
		System.out.println(num);	//68
		
		num %= 2;
		System.out.println(num);	//0
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		a += b; 	//a = a + b which is 30
		System.out.println(a);   //30
		
		a += b + c;	//so we do b + c = 50, then add a which is 30. So 50 + 30 = 80 (a = a+b+c)
		System.out.println(a);	//80
		
		a *= 10;
		System.out.println(a);   // 800
		
		/*Task1:
		 * Declare a variable and increase it's value by 500 and then
		 * by 200 using shorthand operator.
		 */
		int x = 100;
		x += 500 / 200;
		System.out.println();    //102
		
		/*Task2:
		 * Declare a variable and decrease it's value by 60 using 
		 * shorthand operator.
		 */
		int y = 200;
		y -= 60; 
		System.out.println(y);	//140
		
		/*Task3:
		 * Declare a variable cakePiece = 11 and divide the value
		 * of that variable between 4 people using shorthand operator
		 */
		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);  //2
		
		/*Task4:
		 * Declare a variable cake = 25 between 7 people. Using
		 * shorthand operator find out how many pieces of cake are 
		 * left after it was distributed equally among 7 people
		 */
		int cake = 25;
		cake %= 7;
		System.out.println(cake);    //4
		

	}

}
