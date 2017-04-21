package otherKeyPoints;

public class CreditCard implements Pay {
	@Override
	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber) {

		System.out.println("paying " + this.getAmount(shoppingCart) + " with a credit card..." + "name="
				+ shoppingCart.getCustomer().getName() + " Credit Card Number=" + shoppingCart.getCustomer().getCreditCardNumber());

		System.out.println("Payment Transaction " + paymentTransactionNumber);
	}

	@Override
	public double getAmount(ShoppingCart shoppingCart) {

		return (shoppingCart.getTotalAmount() - shoppingCart.getTotalAmount() * 0.1);

	}
}
