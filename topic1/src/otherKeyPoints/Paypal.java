package otherKeyPoints;

public class Paypal implements Pay {

	@Override
	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber) {
		System.out.println("paying " + this.getAmount(shoppingCart) + " with a Paypal... email=" + shoppingCart.getCustomer().getEmail()
				+ " password=" + shoppingCart.getCustomer().getPassword());

		System.out.println("Payment Transaction " + paymentTransactionNumber);
	}

	@Override
	public double getAmount(ShoppingCart shoppingCart) {

		return shoppingCart.getTotalAmount() - shoppingCart.getTheCheapestItem().getPrice();

	}
}
