package Encapsulation;

public class customerId {

	private String name;
	private Long phoneNumber;
	private String city;
	private String email;

	// using setter and getter (encapsulation)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNumber;
	}

	public void setPhoneno(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		customerId id = new customerId();
		id.setName("Rahul verma");
		id.setPhoneno(9797208386L);
		id.setcity("Jaipur");
		id.setEmail("rahulveram@gamil.com");

		System.out.println("Name: " + id.getName());
		System.out.println("Phone Number: " + id.getPhoneNo());
		System.out.println("City: " + id.getCity());
		System.out.println("Email: " + id.getEmail());

	}

}
