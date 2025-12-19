package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int number = 10;
		String result = (number % 2 == 0) ? "Even": "Odd";
		System.out.println("The Number " + number + " is " + result);
		
		int age = 20;
		String status = (age >= 18) ? "Adult": "Minor";
		System.out.println("Person with age " + age + " is " + status);

	}

}
