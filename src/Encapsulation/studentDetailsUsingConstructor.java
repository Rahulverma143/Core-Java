 package Encapsulation;

public class studentDetailsUsingConstructor {

	private long phoneNumber;
	private String emailId;
	private String collegeName;
	private long rollNo;

	public studentDetailsUsingConstructor(long phoneNumber, String emailId, String collegeName, long rollNo) {
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.collegeName = collegeName;
		this.rollNo = rollNo;
	}

	public void displayDetails() {
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("Email ID     : " + emailId);
		System.out.println("College Name : " + collegeName);
		System.out.println("Roll Number  : " + rollNo);
	}

	public static void main(String[] args) {

		studentDetailsUsingConstructor s1 = new studentDetailsUsingConstructor(6006295290L, "rahulverma17@gmail.com",
				"Engineering College Bikaner", 2021310513L);

		s1.displayDetails();
	}
}
