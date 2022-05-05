package dao;

import java.util.List;

import model.ProductPojo;

public interface ProductDao {

	ProductPojo addProduct(ProductPojo productPojo); // Create
	
	ProductPojo updateProduct(ProductPojo productPojo); // Update
	
	void deleteProduct(int productId); // Delete
	
	List<ProductPojo> getAllProducts(); // Read
	
	ProductPojo getAProduct(int productId); // Read
	
}
