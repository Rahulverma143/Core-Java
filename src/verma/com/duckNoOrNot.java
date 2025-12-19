package verma.com;

import java.util.Scanner;

public class duckNoOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int digit, count = 0;
		while (n != 0) {
			digit = n % 10;
			if (digit == 0) {
				count++;
				break;
			}
			n = n / 10;
		}
		if (count == 1) {
			System.out.println("Duck number");
		} else {
			System.out.println("Not a Duck Number");
		}
	}
}
