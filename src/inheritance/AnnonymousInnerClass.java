package inheritance;

interface I {
	void m1();
}

public class AnnonymousInnerClass {
	public static void main(String[] args) {
		I i1 = new I() {
			public void m1() {
				System.out.println("Hello m1");
			}
		};
		i1.m1();
	}
}
