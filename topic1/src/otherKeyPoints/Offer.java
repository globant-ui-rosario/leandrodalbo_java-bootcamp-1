package otherKeyPoints;

import java.util.ArrayList;
import java.util.List;

public class Offer implements Item {

	private String code;
	private double price;
	private List<Item> items;
	private List<Observer> observers;

	public Offer(String code) {

		this.code = code;
		this.price = 0;
		items = new ArrayList<Item>();
		this.observers = new ArrayList<Observer>();
	}

	public void addItem(Item item) {

		items.add(item);
	}

	public void deleteItem(Item item) {

		items.remove(item);

	}

	@Override
	public double getPrice() {
		if (this.price != 0) {

			return this.price;
		} else {
			double price = 0;

			for (Item item : items) {
				price += item.getPrice();
			}

			return price;
		}
	}

	public void setPrice(double price) {
		this.price = price;
		this.notifyObservers();
	}

	@Override
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public void showInformation() {
		System.out.println("Offer " + this.getCode() + " price=" + this.getPrice());
		System.out.println("Items :");
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
