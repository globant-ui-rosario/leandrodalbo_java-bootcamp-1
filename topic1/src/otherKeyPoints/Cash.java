package otherKeyPoints;

public class Cash implements Pay {

	@Override
	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber) {

		System.out.println("This is really a nice Customer :)\"NOW INFORMATION IS NEEDED\" amount =" + this.getAmount(shoppingCart));

		System.out.println("Payment Transaction " + paymentTransactionNumber);
	}

	@Override
	public double getAmount(ShoppingCart shoppingCart) {

		return shoppingCart.getTotalAmount() - (shoppingCart.getTheMostExpensiveItem().getPrice() * 0.9);

	}
}
