package com.A;
  
//// String literal   (SCP) String Constant Pool
//// If the same value exists, it reuses the object.
public class Q2 {
//
//	public static void main(String[] args) {
//		String s1 = "java";
//		String s2 = "java";
//		String s3 = "programing";
//		
////	1.	content comparison  -->.equals-->  return (Boolean Value);
////		If the same value exists, it reuses the object.
//		
//		System.out.println(s1.equals(s2));             // True
//		System.out.println(s1.endsWith(s3));           // False
//		System.out.println(s2.endsWith(s3));           // False
//		
//		
//		System.out.println("----------------------------------------------");
////  2. Reference comparison --> (==)  return boolean value (true/False)
//		
//		System.out.println(s1==s2);  // True
//		System.out.println(s1==s3);  // False
//		System.out.println(s2==s3);  // False
//	}
//
//}
//public class Main {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Java";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false (case-sensitive)
        System.out.println(s2.equals(s3)); // false (case-sensitive)
    }
}  
	
//	
//	String s1 = "Hello";
//	String s2 = "Hello";
//	System.out.println(s1.equals(s2)); // true  
//	
//    }
//}