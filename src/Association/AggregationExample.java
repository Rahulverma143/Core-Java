package Association;
import java.util.ArrayList;
import java.util.List;
class Department {
    private String name;  // Department name
    // Constructor to initialize department
    public Department(String name) {
        this.name = name;
    }
    // Print department info
    @Override
    public String toString() {
        return "Department [name=" + name + "]";
    }   
}
class University {
    private String name; // University name
    private List<Department> departments; // Aggregation: University HAS-A Departments

    // Constructor to initialize university
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>(); // Initialize empty department list
    }
    // Add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }
    // Display university and its departments
    void display() {
        System.out.println(name + " has departments: " + departments);
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Department d1 = new Department("Aeronautics"); 
        Department d2 = new Department("Computer Science");
        University u1 = new University("NIT Jaipur"); 
        u1.addDepartment(d1);
        u1.addDepartment(d2);
        u1.display(); // Display university details
    }
}

