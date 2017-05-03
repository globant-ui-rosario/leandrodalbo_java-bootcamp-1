package otherKeyPoints;

import java.util.ArrayList;
import java.util.List;

public class PaymentTransaction implements Observable {

	private int number;
	private List<Observer> observers;

	public PaymentTransaction() {
		this.number = 0;
		this.observers = new ArrayList<Observer>();
	}

	public int newTransaction() {

		this.number++;
		this.notifyObservers();
		return this.number;

	}

	public void abortTransaction() {

		this.number--;
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
