package finalProject.services;

import org.springframework.stereotype.Service;

import finalProject.model.ShoppingCart;

@Service
public interface ShoppingCartService {

	public ShoppingCart getAshoppingCart(Integer userid);

	public void addProduct(Integer userid,Integer productid);

	public void saveShoppingCart(Integer userId);

}