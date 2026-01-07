package Association;

// Class representing a Magazine
class Magazine {
	String name;

	// Constructor to initialize the magazine
	Magazine(String name) {
		this.name = name;
	}
}

// Class representing a Bookstore
class Bookstore {
	Magazine magazine; // Aggregation: Bookstore HAS-A Magazine

	// Constructor to initialize the bookstore with a magazine
	Bookstore(Magazine magazine) {
		this.magazine = magazine;
	}
}

public class AggregationQ1 {
	public static void main(String[] args) {
		// Creating a Magazine object
		Magazine m = new Magazine("Tech Today");

		// Creating a Bookstore object and associating it with the magazine
		Bookstore store = new Bookstore(m);

		// Displaying the contents of the bookstore
		System.out.println("Bookstore contains: " + store.magazine.name);
	}
}
