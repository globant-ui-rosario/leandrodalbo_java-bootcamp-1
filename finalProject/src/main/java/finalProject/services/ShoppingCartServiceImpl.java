package finalProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import finalProject.model.Product;
import finalProject.model.ShoppingCart;
import finalProject.repositories.ProductRepository;
import finalProject.repositories.ShoppingCartRepository;

@Component
public class ShoppingCartServiceImpl implements ShoppingCartService {

	private ShoppingCart shoppingCart;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ShoppingCartRepository shoppingCartRepository;

	public ShoppingCartServiceImpl() {

		this.shoppingCart = new ShoppingCart();
	}

	@Override
	public void addProduct(Integer productid) {

		Product product = productRepository.findOne(productid);
		if (product != null) {
			this.shoppingCart.getProducts().add(product);
		}
	}

	@Override
	public void saveShoppingCart() {

		shoppingCartRepository.save(this.shoppingCart);

		shoppingCart = new ShoppingCart();

	}

	@Override
	public ShoppingCart getAshoppingCart() {

		return this.shoppingCart;

	}

}
