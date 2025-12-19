package constructor;

	class Student {
    int id;
    String name;

 
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

   
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
	
public class CopyConstructor {

	public static void main(String[] args) {
		 Student s1 = new Student(101, "Rahul");  
	        Student s2 = new Student(s1);            

	        s1.display();  
	        s2.display(); 

	}

}
