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

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}/shoppingCart")
    public ShoppingCart getAshoppingCart(@PathVariable int userId) {

        return shoppingCartService.getAshoppingCart(userId);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{userId}/shoppingCart/addProduct/{productid}")
    public void addProduct(@PathVariable int userId, @PathVariable int productid) {

        shoppingCartService.addProduct(userId, productid);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{userId}/shoppingCart/save")
    public void addProduct(@PathVariable int userId) {

        shoppingCartService.saveShoppingCart(userId);

    }
}
