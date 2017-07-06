package otherKeyPoints;

public class Customer {

	private String name;
	private String creditCardNumber;
	private String email;
	private String password;

	public Customer() {

		name = "";
		creditCardNumber = "";
		email = "";
		password = "";
	}

	public Customer(String name, String creditCardNumber, String email, String password) {

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

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
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
