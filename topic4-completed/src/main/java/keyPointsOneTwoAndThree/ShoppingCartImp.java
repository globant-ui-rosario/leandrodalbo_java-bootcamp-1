package keyPointsOneTwoAndThree;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImp implements ShoppingCart {

	List<Item> items = new ArrayList<Item>();
	private Customer customer;

	public List<Item> getAlistOfItems() {

		return this.items;
	}

	public void addAlistOfItems(List<Item> items) {

		this.items = items;

	}

	public double getTotalAmount() {

		double total = 0;

		for (Item item : items) {
			total += item.getPrice();
		}

		return total;

	}

	public Customer getTheCustomer() {

		return this.customer;

	}

	public void setTheCustomer(Customer customer) {

		this.customer = customer;

	}

	public void addAnItemToTheList(Item item) {

		this.items.add(item);

	}

	public void deleteAnItemFromTheList(Item item) {

		items.remove(item);

	}

	public Item getAnItemFromTheList(Item item) {
		Item itemFound = null;

		for (Item item2 : items) {

			if (item2.getItemId() == item.getItemId()) {
				itemFound = item2;
				break;
			}
		}

		return itemFound;
	}

}
