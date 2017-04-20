package otherKeyPoints;

public class Cash implements Pay {

	@Override
	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber) {

		System.out.println("This is really a nice Customer :)\"NOW INFORMATION IS NEEDED\" amount ="
				+ (shoppingCart.getTotalAmount() - (shoppingCart.getTheMostExpensiveItem().getPrice() * 0.9)));

		System.out.println("Payment Transaction " + paymentTransactionNumber);
	}

}
