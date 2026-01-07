package com.String;

public class Que2 {

	public static void main(String[] args) {

		String s1 = new String("Java"); // Creates new object in Heap
		String s2 = new String("Java"); // Creates another new object in Heap
		String s3 = new String("JAVA"); // Creates another new object in Heap

		// == method is used for reference comparison
		System.out.println(s1 == s2); // false (different objects)
		System.out.println(s1 == s3); // false (different objects)

		// equals() method is used for content comparison
		System.out.println(s1.equals(s2)); // true (same content)
		System.out.println(s1.equals(s3)); // false (case-sensitive)

	}

}
