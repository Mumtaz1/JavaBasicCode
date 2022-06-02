package com.syntax.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		//Relational operators: >, <, >=, <=, ==, !=
		//Result of relational operators is always true or false (boolean)
		
		int num1 = 20;
		int num2 = 22;
		System.out.println(num1>num2); 		//false
		System.out.println(num1 < num2);		//true
		System.out.println(num1 != num2); 	//true
		System.out.println(num1 == num2);	//false 20 is not equal to 22
		System.out.println(num1 =  num2); 	//22 because we reassigned num1 to 22
		System.out.println(num1 == num2);	//true because num1 = 22 and num2 is 22. So 22 = 22, so true
		
		boolean result = 100 > 200;
		System.out.println(result); 	//false
		
		int result1 = 100+200;
		System.out.println(result1);	//300
		
		String result2 = "Emre" + 10;
		System.out.println(result2); 		//Emre10
		
		int num3 = 10;
		int num4 = 11;
		result = num3 == num4; 		// if num3 equals to num4
		System.out.println(result); 		//false because on line 18 we defined result as boolean type
		
		result = num3 != num4; 		// check if num3 NOT equal to num4
		System.out.println(result);		//true
		
		
	}

}
