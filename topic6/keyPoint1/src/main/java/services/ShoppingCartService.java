package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Customer;
import model.Item;

@Service
public class ShoppingCartService {

	List<Item> items = new ArrayList<Item>();
	private Customer customer;

	public List<Item> getAlistOfItems() {

		return this.items;
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

	public void deleteAnItemFromTheList(int itemId) {

		for (Item item : items) {

			if (item.getItemId() == itemId) {

				items.remove(item);
				break;
			}
		}

	}

	public Item getAnItemFromTheList(int itemId) {
		Item itemFound = null;

		for (Item item : items) {

			if (item.getItemId() == itemId) {
				itemFound = item;
				break;
			}
		}

		return itemFound;
	}

}
