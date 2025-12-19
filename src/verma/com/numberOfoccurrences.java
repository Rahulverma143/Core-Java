package verma.com;

import java.util.Scanner;

public class numberOfoccurrences {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter number;");
		int b = sc.nextInt();

		int count = 0;
		while (a != 0) {
			int digit = a % 10;
			if (digit == b) {
				count++;
			}
			a = a / 10;

		}
		System.out.println("Digit " + b + " occurred " + count + " times.");
	}
}