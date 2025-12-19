package com.String;

public class Que3 {

	public static void main(String[] args) {
		
		 StringBuffer s1 = new StringBuffer("Java");
		 StringBuffer s2 = new StringBuffer("Java");
		 StringBuffer s3 = new StringBuffer("JAVA");
		 
		// In StringBuffer:
	    // == checks reference (memory location)
	    // equals() is NOT overridden → behaves like ==
		 
		 // equals() and == method both is used for reference comparison
		 
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equals(s3));
		 
		 
		 System.out.println(s1 == s2);
		 System.out.println(s1 == s3);
		 
		 
		   // To compare content, convert to String
		 System.out.println(s1.toString().equals(s2.toString()));  // true
		 System.out.println(s1.toString().equalsIgnoreCase(s3.toString()));  // true
	}

}
