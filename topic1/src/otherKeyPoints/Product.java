package otherKeyPoints;

import java.util.ArrayList;
import java.util.List;

public class Product implements Item {

	private String code;
	private double price;
	private List<Observer> observers;

	public Product(String code, double price) {

		this.code = code;
		this.price = price;
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		this.notifyObservers();
	}

	@Override
	public void showInformation() {

		System.out.println("Item =" + this.getCode() + " price=" + this.getPrice());

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
