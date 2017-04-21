package otherKeyPoints;

public interface Pay {

	public void pay(ShoppingCart shoppingCart, int paymentTransactionNumber);

	public double getAmount(ShoppingCart shoppingCart);
}
