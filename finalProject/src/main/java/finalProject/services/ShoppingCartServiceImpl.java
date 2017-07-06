package finalProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import finalProject.model.Product;
import finalProject.model.ShoppingCart;
import finalProject.repositories.ProductRepository;
import finalProject.repositories.ShoppingCartRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private Map<Integer, ShoppingCart> shoppingCarts;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartServiceImpl() {

        this.shoppingCarts = new HashMap<>();
    }

    @Override
    public void addProduct(Integer userId, Integer productid) {

        if (getAshoppingCart(userId) != null) {

            Product product = productRepository.findOne(productid);

            if (product != null) {

                getAshoppingCart(userId).getProducts().add(product);

            }

        }
    }

    @Override
    public void saveShoppingCart(Integer userId) {

        if (getAshoppingCart(userId) != null) {

            shoppingCartRepository.save(shoppingCarts.get(userId));
            shoppingCarts.remove(userId);
        }
    }

    @Override
    public ShoppingCart getAshoppingCart(Integer userId) {

        if (userService.isUserOn(userId)) {

            if (shoppingCarts.containsKey(userId)) {

                return shoppingCarts.get(userId);

            } else {

                shoppingCarts.put(userId, new ShoppingCart());
                return shoppingCarts.get(userId);

            }

        }

        return null;
    }

}
