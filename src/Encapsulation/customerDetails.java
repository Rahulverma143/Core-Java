package Encapsulation;

public class customerDetails {

	private String name;
	private long phoneNumber;
	private String city;
	private String emailId;

	public customerDetails(String name, long phoneNumber, String city, String emailId) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "customerDetails [name=" + name + ", phoneNumber=" + phoneNumber + ", city=" + city + ", emailId="
				+ emailId + "]";
	}

	public static void main(String[] args) {
		customerDetails id = new customerDetails("Rahul Verma", 6006295290L, "jaipur", "rahulverma17@gamil.com");
		System.out.println(id);
	}

}
