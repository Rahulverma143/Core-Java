package com.String;

	public class Que4 {
		
	    public static void main(String[] args) {
	    	
	        String str = "Hello World";
	        String str2 = "Java";

	        // 1. length()
	        System.out.println("Length: " + str.length()); // 11

	        // 2. charAt()
	        System.out.println("charAt(0): " + str.charAt(0)); // H

	        // 3. concat()
	        System.out.println("concat: " + str.concat(" " + str2)); // Hello World Java

	        // 4. equals()
	        System.out.println("equals: " + str.equals("Hello World")); // true

	        // 5. equalsIgnoreCase()
	        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase("hello world")); // true

	        // 6. toUpperCase()
	        System.out.println("toUpperCase: " + str.toUpperCase()); // HELLO WORLD

	        // 7. toLowerCase()
	        System.out.println("toLowerCase: " + str.toLowerCase()); // hello world

	        // 8. trim()
	        String space = "  Java  ";
	        System.out.println("trim: '" + space.trim() + "'"); // 'Java'

	        // 9. contains()
	        System.out.println("contains 'World': " + str.contains("World")); // true

	        // 10. startsWith() & endsWith()
	        System.out.println("startsWith 'Hello': " + str.startsWith("Hello")); // true
	        System.out.println("endsWith 'World': " + str.endsWith("World")); // true

	        // 11. indexOf()
	        System.out.println("indexOf 'World': " + str.indexOf("World")); // 6

	        // 12. replace()
	        System.out.println("replace: " + str.replace("World", "Java")); // Hello Java

	        // 13. substring()
	        System.out.println("substring(6): " + str.substring(6)); // World
	        System.out.println("substring(0,5): " + str.substring(0, 5)); // Hello

	        // 14. split()
	        String fruits = "apple,banana,grape";
	        String[] arr = fruits.split(",");
	        System.out.println("split:");
	        for (String s : arr) System.out.println(s); // apple, banana, grape
	        
	        System.out.println(str.length());  // Output: 11
	        System.out.println(str.charAt(0));  // Output: H


	    }
	}
