package com.syntax.class14;

public class HW5MethodEmail {

	/*
	 * Create a method called createEmail(). 
	 * Based on values of user name, lastName,
	 * and email type, your method should return 
	 * complete email address. 
	 * Example:
	 * createEmail (John, Snow, gmail) 
	 * Output: 
	 * johnsnow@gmail.com
	 */

	void createEmail(String userName, String lastName, String email) {
		System.out.println(userName.toLowerCase() + lastName.toLowerCase() + "@" + email + ".com");
	}

	public static void main(String[] args) {

		HW5MethodEmail email = new HW5MethodEmail();
		email.createEmail("John", "Snow", "gmail");
	}
}