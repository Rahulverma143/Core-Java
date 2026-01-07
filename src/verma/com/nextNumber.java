package verma.com;

import java.util.Scanner;

public class nextNumber {

	public static void main(String[] args) {

		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(++n);
	}
}
