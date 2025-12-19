package verma.com;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		System.out.println("Enter thee number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		int fact = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}

}
