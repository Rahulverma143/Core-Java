package Association;

class Teacher {
	String name;

	Teacher(String name) {
		this.name = name;
	}
}

class Student {
	String name;
	Teacher teacher; // Association: Student knows their Teacher

	Student(String name, Teacher teacher) {
		this.name = name;
		this.teacher = teacher;
	}
}

public class AssociationExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mr. Prasoon Bidua Sir");
		Student s1 = new Student("Rahul Verma", t1); // Student associated with Teacher

		System.out.println(s1.name + " learns from " + s1.teacher.name);
	}
}
