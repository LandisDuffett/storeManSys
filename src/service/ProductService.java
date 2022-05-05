package service;

import java.util.List;

import model.ProductPojo;

public interface ProductService {

	ProductPojo addProduct(ProductPojo productPojo); // Create
	
	ProductPojo updateProduct(ProductPojo productPojo); // Update
	
	void deleteProduct(int productId); // Delete
	
	List<ProductPojo> getAllProducts(); // Read
	
	ProductPojo getAProduct(int productId); // Read
	
}
