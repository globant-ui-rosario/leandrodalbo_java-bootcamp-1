package topic1KeyPoint1;

public class CreditCard implements Pay{
	@Override
	public void pay(Customer customer, double amount){
		
		System.out.println("paying "+amount+" with a credit card..."+"name="+customer.getName()+" Credit Card Number="+customer.getCreditCardNumber());
	}
}
