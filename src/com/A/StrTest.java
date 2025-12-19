package com.A;

public class StrTest {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String ("java");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-------------------------------------");

		
		// reference_check 
		if(s1 == s2 ) {
			System.out.println("Reerence method is same");
		}
		else {
			System.out.println("Reference is not same");
		}
		
		// Content_check
		
		if (s1.equals(s2)) {
			System.out.println("Content same");
		}
		else {
			System.out.println("Content not same");
		}
	}

}
