package finalProject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import finalProject.model.Product;

@Service
public interface ProductService {

	public List<Product> productsByCategoryOrName(String productname, String category);
}
