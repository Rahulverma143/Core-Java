package verma.com;

import java.util.Scanner;

public class largestdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number:");
		int n = sc.nextInt();

		int largestd = 0;

		while (n != 0) {
			int digit = n % 10;
			if (digit > largestd) {
				largestd = digit;
			}
			n = n / 10;
		}

		System.out.println("The largest digit is: " + largestd);
	}
}
