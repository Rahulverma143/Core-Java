package verma.com;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n >= 0) {
			if (n % 2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}
		} else {
			System.out.println("Invalid");
		}

	}
}
