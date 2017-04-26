package topic1KeyPoint1;

public class Paypal implements Pay{

	@Override
	public void pay(Customer customer, double amount) {
		System.out.println("paying "+amount+" with a Paypal... email="+customer.getEmail()+" password"+customer.getPassword());
	}

}
