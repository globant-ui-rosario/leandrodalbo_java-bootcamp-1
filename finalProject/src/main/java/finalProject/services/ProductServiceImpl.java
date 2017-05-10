package finalProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import finalProject.model.Product;
import finalProject.repositories.ProductRepository;

@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> productsByCategoryOrName(String productname, String category) {

		return productRepository.findByProductnameOrCategory(productname, category);

	}

}
