package app.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Customer;
import model.Item;
import services.ShoppingCartService;

@RestController
public class ShoppingCartController {

	private ShoppingCartService shoppingCartService = new ShoppingCartService();

	@RequestMapping(method = RequestMethod.POST, value = "/customer")
	public void setTheCustomer(@RequestBody Customer customer) {

		shoppingCartService.setTheCustomer(customer);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/customer")
	public Customer getTheCustomer() {
		return shoppingCartService.getTheCustomer();
	}

	@RequestMapping("/items")
	public List<Item> getAlistOfItems() {

		return shoppingCartService.getAlistOfItems();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/items")
	public void addAnItemToTheList(@RequestBody Item item) {

		shoppingCartService.addAnItemToTheList(item);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/items/{itemId}")
	public void deleteAnItemFromTheList(@PathVariable int itemId) {

		shoppingCartService.deleteAnItemFromTheList(itemId);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/items/{itemId}")
	public Item getAnItemFromTheList(@PathVariable int itemId) {

		return shoppingCartService.getAnItemFromTheList(itemId);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/totalAmount")
	public double getTotalAmount() {

		return shoppingCartService.getTotalAmount();

	}

}
