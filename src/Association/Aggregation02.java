package Association;

// Class representing a Book
class Book {
    String title;  // Attribute to store the book's title
    String author; // Added attribute to store the author's name

    // Constructor to initialize the book
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayBookInfo() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

// Class representing a Library
class Library {
    Book book; // Aggregation: Library HAS-A Book (Library can exist without a Book)

    // Constructor to initialize the library with a book
    Library(Book book) {
        this.book = book;
    }

    // Method to display library contents
    void displayLibraryContents() {
        System.out.print("Library contains: ");
        book.displayBookInfo();
    }
}

public class Aggregation02 {
    public static void main(String[] args) {
        // Creating a Book object
        Book b1 = new Book("Java Basics", "Rahul Verma");
        Book b2 = new Book("Python Essentials", "Rahul verma");

        // Creating Library objects and associating books
        Library l1 = new Library(b1);
        Library l2 = new Library(b2);

        // Displaying library contents
        l1.displayLibraryContents();
        l2.displayLibraryContents();

        // Demonstrating that Library and Book are independent (aggregation)
        System.out.println("Even if library is removed, book can exist independently.");
    }
}
