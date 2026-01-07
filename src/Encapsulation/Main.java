package Encapsulation;

class Car {
	String brand;
	int speed;

	void driver() {
		System.out.println(brand + " is driving at " + speed + "km/h");

	}
}

class Train extends Car {
	String brand;
	int speed;

	void driver() {
		System.out.println(brand + " is driving att " + speed + " km/h ");

	}
}

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "BMW";
		c1.speed = 120;
		c1.driver();

		Train t1 = new Train();
		t1.brand = "banda bharata";
		t1.speed = 200;
		t1.driver();

		Car t2 = new Train();
		t2.brand = "volvo";
		t2.speed = 500;
		t2.driver();

	}
}
