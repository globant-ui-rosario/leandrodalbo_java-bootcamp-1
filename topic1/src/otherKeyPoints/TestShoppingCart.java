package otherKeyPoints;

public class TestShoppingCart {

	public static void main(String[] argas) {

		// crating many products
		Product p1 = new Product("001", 25);
		Product p2 = new Product("002", 200);
		Product p3 = new Product("003", 100);
		Product p4 = new Product("004", 50);
		
		//create an offer
		Offer offer =new Offer("OF01");
		
		
		// create a Customer
		Customer c = new Customer("Leandro", "555566677", "lea@mail.com", "123321");

		// ShoppingCart
		ShoppingCart sc = new ShoppingCart();
		
		//creating a marketManager
		MarketManger mc=new MarketManger();
		//add observer to the shopping cart
		sc.addObserver(mc);

		sc.setCustomer(c);
		sc.addItem(p4);
		sc.addItem(p3);
		sc.addItem(p2);
		sc.addItem(p1);

		// get the cheapest item
		System.out.println(sc.getTheCheapestItem().getCode() + " " + sc.getTheCheapestItem().getPrice());

		// get the most expensive item
		System.out.println(sc.getTheMostExpensiveItem().getCode() + " " + sc.getTheMostExpensiveItem().getPrice());

		System.out.println("total amount =" + sc.getTotalAmount());

		sc.deleteItem(p1);
		sc.deleteItem(p2);
		System.out.println("total amount =" + sc.getTotalAmount());

		offer.addItem(p1);
		offer.addItem(p2);
		sc.addItem(offer);
		System.out.println("total amount =" + sc.getTotalAmount());
		
		PaymentTransaction transaction = new PaymentTransaction();
		//add observers to the payment transaction
		transaction.addObserver(mc);
		
		// try to pay without setting a valid payment method
		sc.pay(transaction);

		// Pay with different methods
		sc.setPayment(new CreditCard());
		sc.pay(transaction);

		sc.setPayment(new Paypal());
		sc.pay(transaction);

		sc.setPayment(new Cash());
		sc.pay(transaction);

		sc.seeListOfItems();

		offer.addObserver(mc);
		p1.addObserver(mc);
		offer.setPrice(4546);
		p1.setPrice(34);
	}
}
