package otherKeyPoints;

public class Paypal implements Pay {

	@Override
	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber) {
		System.out.println(
				"paying " + (shoppingCart.getTotalAmount() - shoppingCart.getTheCheapestItem().getPrice()) + " with a Paypal... email="
						+ shoppingCart.getCustomer().getEmail() + " password=" + shoppingCart.getCustomer().getPassword());

		System.out.println("Payment Transaction " + paymentTransactionNumber);
	}

}
