package finalProject.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import finalProject.model.Product;
import finalProject.model.User;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	public List<Product> findByProductnameOrCategory(String productname, String category);

}
