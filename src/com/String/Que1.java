package com.String;

public class Que1 {

	public static void main(String[] args) {
		
		String s1 = "Java";  // String literal
		String s2 = "Java";  // Same literal, so same object in SCP
		String s3 = "JAVA";  // Different literal, so different object in SCP
		
		// In String Literal equals() method is used for content comparison
		System.out.println(s1.equals(s2));   
		System.out.println(s1.equals(s3));   
		
		// In String Literal == method is used for reference comparison
		System.out.println(s1 == s2);  
		System.out.println(s1 == s3);  
		
		
		System.out.println(s1.equalsIgnoreCase(s3));  // true

	}

}
