package finalProject.repositories;

import org.springframework.data.repository.CrudRepository;

import finalProject.model.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Integer> {

}
