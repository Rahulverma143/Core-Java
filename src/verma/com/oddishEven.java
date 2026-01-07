package verma.com;

import java.util.Scanner;

public class oddishEven {

	public static void main(String[] args) {

		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}

		if (sum % 2 == 0) {
			System.out.println("evenish");
		} else {
			System.out.println("oddish");
		}
	}

}
