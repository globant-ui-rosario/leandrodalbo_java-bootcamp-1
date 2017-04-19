package topic1KeyPoint1;

public class Customer {

	private String name;
	private int creditCardNumber;
	private String email;
	private String password;

	public Customer() {

		name = "";
		creditCardNumber = 0;
		email = "";
		password = "";
	}

	public Customer(String name, int creditCardNumber, String email, String password) {

		this.name = name;
		this.creditCardNumber = creditCardNumber;
		this.email = email;
		this.password = password;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
