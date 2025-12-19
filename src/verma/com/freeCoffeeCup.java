package verma.com;

import java.util.Scanner;

public class freeCoffeeCup {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k;
		if (n > 0) {
			k = n / 6;
			n = n + k;
			System.out.println(n);
		}
	}
}
