package inheritance;

 // inner method access 
class Outer {
	void m1() {
		System.out.println("m1 method inside the class outer ");
	}
	class Inner{
		void m2 () {
			System.out.println("m2 method inside the class Inner");
		}
	}
}
public class OuterInner {

	public static void main(String[] args) {
		
		
		Outer.Inner oi1 = new Outer().new Inner();
		oi1.m2();
		Outer o1 = new Outer();
		o1.m1();
	}

}
