package topic1KeyPoint1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> products;
	private Customer customer;
	private Pay payment;

	public ShoppingCart() {

		this.products = new ArrayList<Product>();
		this.customer = new Customer();
		this.payment = null;
	}

	public ShoppingCart(List<Product> products, Customer customer) {
		this.products = products;
		this.customer = customer;
		this.payment = null;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Pay getPayment() {
		return payment;
	}

	public void setPayment(Pay payment) {
		this.payment = payment;
	}

	public void addProduct(Product product) {

		this.products.add(product);
	}

	public void deleteProduct(Product product) {

		this.products.remove(product);
	}

	public double getTotalAmount() {
		double total = 0;
			
		for (Product product : products) {
			total += product.getPrice();
		}
	
		return total;
	}

	public void pay() {

		if (this.payment == null) {

			System.out.println("Select a valid payment method");

		} else {

			this.payment.pay(getCustomer(), getTotalAmount());

		}

	}
}
