package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String str = "sfkafdb18247t8725KSNDASD!@#$((%^^";
		
		System.out.println(str.replaceAll("[0-9]", "#"));  // replaces all 0-9 with #. So, sfkafdb#####t####KSNDASD!@#$((%^^
		System.out.println(str.replaceAll("[a-z]", "#"));  // replaces all a-z with #. So #######18247#8725KSNDASD!@#$((%^^
		System.out.println(str.replaceAll("[A-Z]", "#")); // replaces all A-Z with #. So sfkafdb18247t8725#######!@#$((%^^
		System.out.println(str.replaceAll("[A-Za-z]", "#")); //replaces all A-Z, a-z. So #######18247#8725#######!@#$((%^^
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#")); //replaces all A-Z, a-z, 0-9. So ########################!@#$((%^^
		System.out.println(str.replaceAll("[^a-z]", "_")); //the ^a-z means dont replace a-z. So sfkafdb_____t____________________
		
		System.out.println(str.replaceAll("[^A-Z]", "*")); //*****************KSNDASD*********
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*")); // sfkafdb18247t8725KSNDASD*********
		
		str = "abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]", "*"));  //******ghijkl
		
		str = "sfkafdb18247t8725KSNDASD!@#$((%^^";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", " ")); // sfkafdb18247t8725KSNDASD  
		System.out.println(str.replaceAll("[^A-z]", "")); // sfkafdbtKSNDASD^^
	}
}