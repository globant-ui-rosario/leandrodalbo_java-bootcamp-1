package topic1KeyPoint1;

public class TestShoppingCart {

	public static void main(String[] argas) {

		//crating many products
		Product p1=new Product("001", 25);
		Product p2=new Product("002", 50);
		Product p3=new Product("003", 50);
		Product p4=new Product("001", 50);
		
		//create a Customer
		Customer c =new Customer("Leandro",555566677,"lea@mail.com","123321");
		
		//ShoppingCart
		ShoppingCart sc=new ShoppingCart();
		
		sc.setCustomer(c);
		sc.addProduct(p1);
		sc.addProduct(p2);
		sc.addProduct(p3);
		sc.addProduct(p4);
		
		System.out.println("total amount ="+sc.getTotalAmount());
		
		sc.deleteProduct(p1);
		
		System.out.println("total amount ="+sc.getTotalAmount());
		
		//try to pay without setting a valid payment method
		sc.pay();
		
		//Pay with different methods
		sc.setPayment(new CreditCard());
		sc.pay();
		
		sc.setPayment(new Paypal());
		sc.pay();
		

		sc.setPayment(new Cash());
		sc.pay();
		
	}
}
