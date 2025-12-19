package com.A;

public class ScpTest {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 =  "java";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-------------------------------------");

		
		int hs1 = s1.hashCode();
		int hs2 = s2.hashCode();
		
		System.out.println(hs1);
		System.out.println(hs2);
		
		// reference_check 
		if(s1 == s2 ) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both are Different | Not same");
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
