package otherKeyPoints;

public class CreditCard implements Pay {
	@Override
	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber) {

		System.out.println(
				"paying " + (shoppingCart.getTotalAmount() - shoppingCart.getTotalAmount() * 0.1) + " with a credit card..." + "name="
						+ shoppingCart.getCustomer().getName() + " Credit Card Number=" + shoppingCart.getCustomer().getCreditCardNumber());
	
		System.out.println("Payment Transaction " + paymentTransactionNumber);
	}
}
