package verma.com;

import java.util.Scanner;

public class sumOfdivisibleBy3 {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			if (d % 3 == 0) {
				sum = sum + d;
			}
			n = n / 10;
		}
		System.out.println(sum);
	}
}
