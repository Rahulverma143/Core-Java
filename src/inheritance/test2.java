package inheritance;


class Employee{
	public void getEmployeename() {
		System.out.println("Rahul verma");
	}
	public void getEmployeeId() {
		System.out.println("12");
	}
}
class PermanentEmployee extends Employee {
	public void salaryOnMonthy() {
		System.out.println("20000");
	}
}
class ContractEmployee extends Employee{
	public void salaryOnHourly() {
		System.out.println("2Hours");
	}
}


public class test2 {

	public static void main(String[] args) {
		ContractEmployee c1 = new ContractEmployee();
		c1.salaryOnHourly();
		c1.getEmployeename();
		c1.getEmployeeId();
		
		PermanentEmployee e1 = new PermanentEmployee();
		e1.salaryOnMonthy();
		e1.getEmployeeId();
		e1.getEmployeename();

	}

}
