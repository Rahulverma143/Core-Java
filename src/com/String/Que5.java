package com.String;

public class Que5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        

        sb.append(" World");              // Hello World
        System.out.println(sb);

        sb.insert(6, "Java ");            // Hello Java World
        System.out.println(sb);

        sb.replace(0, 5, "Hi");           // Hi Java World
        System.out.println(sb);

        sb.delete(3, 8);                  // Hi World
        System.out.println(sb);

        sb.reverse();                     // dlroW iH
        System.out.println(sb);
    }
}
