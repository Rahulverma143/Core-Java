package com.A;

//  String Object creation in (Heap Memory);
// Creates a new object in heap memory, even if the same string exists in the pool.

public class Q3 {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = new String("Programing");

//		Content comparison 
		System.out.println("Content comparison");

		System.out.println(s1.equals(s2)); // True
		System.out.println(s1.endsWith(s3)); // False
		System.out.println(s2.endsWith(s3)); // False

//		Reference comparison  
		System.out.println("----------------------------------------------");
		System.out.println("Reference comparison");

		System.out.println(s1 == s2); // False
		System.out.println(s1 == s3); // False
		System.out.println(s2 == s3); // False

	}

}
