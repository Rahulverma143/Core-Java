package operators;

public class incDec {

	public static void main(String[] args) {

		int a = 10;
		int b = a-- - --a + a++ + ++a;
		System.out.println(b);
	}

}

//output 20