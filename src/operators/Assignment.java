package operators;

public class Assignment {

	public static void main(String[] args) {

		int a = 20;

		System.out.println("Initial value of a: " + a);

		a += 5; // a = a + 5
		System.out.println("After a += 5: " + a);

		a -= 5; // a = a - 2
		System.out.println("After a -= 2: " + a);

		a *= 5; // a = a * 5
		System.out.println("After a *= 5: " + a);

		a /= 5; // a = a / 5
		System.out.println("After a /= 5: " + a);

		a %= 5; // a = a % 5
		System.out.println("After a %= 5: " + a);

	}

}
