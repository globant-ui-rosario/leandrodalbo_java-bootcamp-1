package finalProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import finalProject.model.ShoppingCart;
import finalProject.services.ShoppingCartService;

@RestController
public class ShoppingCartRestController {

	@Autowired
	private ShoppingCartService shoppingCartService;

	@RequestMapping(method = RequestMethod.GET, value = "shoppingCart")
	public ShoppingCart getAshoppingCart() {

		return shoppingCartService.getAshoppingCart();

	}

	@RequestMapping(method = RequestMethod.PUT, value = "shoppingCart/addProduct/{productid}")
	public void addProduct(@PathVariable int productid) {

		shoppingCartService.addProduct(productid);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "shoppingCart/save")
	public void addProduct() {

		shoppingCartService.saveShoppingCart();

	}
}
