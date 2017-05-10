package finalProject.services;

import org.springframework.stereotype.Service;

import finalProject.model.ShoppingCart;

@Service
public interface ShoppingCartService {

	public ShoppingCart getAshoppingCart();

	public void addProduct(Integer productid);

	public void saveShoppingCart();

}