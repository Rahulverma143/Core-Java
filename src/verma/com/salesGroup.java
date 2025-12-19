package verma.com;

import java.util.Scanner;

public class salesGroup {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n >= 30 && n <= 100) {

			if (n >= 30 && n <= 50) {
				System.out.println("Group D");
			} else if (n >= 51 && n <= 60) {
				System.out.println("Group C");
			} else if (n >= 61 && n <= 80) {
				System.out.println("Group B");
			} else if (n >= 81 && n <= 100) {
				System.out.println("Group A");
			}
		} else {
			System.out.println("Invalid");
		}
	}
}
