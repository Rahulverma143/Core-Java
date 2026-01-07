package com.A;

//	String Create 
// 	Two  way to create string.
// 	1. String Literal   in (String Constant pool) .
//	2. String object create in (Heap) usinh new keyword.

public class Q1 {

	public static void main(String[] args) {
		String s1 = "Rahul"; // String Literal
		s1.concat("verma");
		System.out.println(s1);

		s1 = s1.concat(" Verma");
		System.out.println(s1);
	}

}
