package polymorphism;

class Parent {
	static void show() {
		System.out.println("Parent static method");

	}
}

class Child extends Parent {
	static void show() { // method hiding
		System.out.println("Child static method");

	}
}

public class MethodHiding {
	public static void main(String[] args) {

		Parent p = new Child();
		p.show();
		// Output: Parent static method (depends on reference type)
		Child c = new Child();
		c.show();
		// Output: Child static method

	}

}
