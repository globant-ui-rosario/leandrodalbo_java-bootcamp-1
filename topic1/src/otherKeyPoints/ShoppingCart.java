package otherKeyPoints;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements otherKeyPoints.Observable {

	private List<Item> items;
	private Customer customer;
	private Pay payment;
	private List<Observer> observers;

	public ShoppingCart() {

		this.items = new ArrayList<Item>();
		this.customer = new Customer();
		this.payment = null;
		this.observers = new ArrayList<Observer>();
	}

	public ShoppingCart(List<Item> items, Customer customer) {
		this.items = items;
		this.customer = customer;
		this.payment = null;
		this.observers = new ArrayList<Observer>();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
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

	public void addItem(Item item) {

		this.items.add(item);
		this.notifyObservers();
	}

	public void deleteItem(Item item) {

		this.items.remove(item);
	}

	public double getTotalAmount() {
		double total = 0;

		for (Item item : items) {
			total += item.getPrice();
		}

		return total;
	}

	public void pay(PaymentTransaction transaction) {

		if (this.payment == null) {

			System.out.println("Select a valid payment method");

		} else {

			this.payment.pay(this, transaction.newTransaction());

		}

	}

	public Item getTheCheapestItem() {

		Item cheapestItem = items.get(0);

		for (Item item : items) {

			if (item.getPrice() < cheapestItem.getPrice()) {

				cheapestItem = item;
			}
		}

		return cheapestItem;

	}

	public Item getTheMostExpensiveItem() {

		Item mostExpensiveItem = items.get(0);

		for (Item item : items) {

			if (item.getPrice() > mostExpensiveItem.getPrice()) {

				mostExpensiveItem = item;
			}
		}

		return mostExpensiveItem;

	}

	public void seeListOfItems() {

		for (Item item : items) {
			item.showInformation();
		}
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {

		for (Observer observer : this.observers) {
			observer.doUpdate();
		}

	}
}
