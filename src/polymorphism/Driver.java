package polymorphism;

// Polymorphism type 
// Method  overloading ( we declare same method name but different parameters)

class A {
	void m1() {
		System.out.println("m1 method inside the class A");
	}

	void m1(int a) {
		System.out.println("one parametrized method");
	}

	void m1(int a, int b) {
		System.out.println("two parametrized method");
	}
}

public class Driver {

	public static void main(String[] args) {
		A a1 = new A();

		a1.m1(10);
		a1.m1();
		a1.m1(10, 20);

	}

}

/*
 * one parametrized method m1 method inside the class A two parametrized method
 */
