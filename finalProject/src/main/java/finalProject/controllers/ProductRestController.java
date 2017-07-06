package finalProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import finalProject.model.Product;
import finalProject.services.ProductService;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET, value="/products/{productname}/{category}")
	public List<Product> productByNameOrCategory(@PathVariable String productname, @PathVariable String category) {

		return productService.productsByCategoryOrName(productname, category);

	}

}
