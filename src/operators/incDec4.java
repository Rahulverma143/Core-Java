package operators;

public class incDec4 {

	int a = 10;
	static int b = 20;   // copy // common for all object
	public static void main(String[] args) {
		incDec4 d1 = new incDec4();
		incDec4 d2 = new incDec4();
		
		System.out.println(d1.a++);
		System.out.println(d1.b++);
		System.out.println(d2.a++);
		System.out.println(d2.b++);

	}

}
// output 
//10
//20
//10
//21