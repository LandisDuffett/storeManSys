package presentation;

import java.util.List;
import java.util.Scanner;

import model.ProductPojo;
import service.ProductService;
import service.ProductServiceImpl;

public class ProductManagementSystem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ProductService productService = new ProductServiceImpl();
		char proceed = 'y';
		
		while(proceed == 'y') {
			System.out.println("*****************************");
			System.out.println("PRODUCT MANAGEMENT SYSTEM");
			System.out.println("*****************************");
			System.out.println("1. List all Products");
			System.out.println("2. Add a new Product");
			System.out.println("3. Delete a Product");
			System.out.println("4. Update a Product");
			System.out.println("5. Exit");
			System.out.println("*****************************");
			System.out.println("Please enter an option:");
			int option = scan.nextInt();
			System.out.println("*****************************");
			switch(option) {
				case 1:
					List<ProductPojo> everyProduct = productService.getAllProducts();
					System.out.println("***************************************************************************************");
					System.out.println("ID\tNAME\tDESCRIPTION\tCOST");
					System.out.println("***************************************************************************************");
					everyProduct.forEach((item)-> System.out.println(item.getProductId() + "\t" + item.getProductName() + "\t" + item.getProductDescription() + "\t" + item.getProductCost()));
					System.out.println("***************************************************************************************");
					System.out.println("Do you want to continue?(y/n)");
					proceed = scan.next().charAt(0);
					break;
				case 2:
					ProductPojo Prod = new ProductPojo();
					System.out.println("***************************************************************************************");
					System.out.println("Enter product name:");
					String prodName = scan.next();
					Prod.setProductName(prodName);
					System.out.println("Enter product description: ");
					scan.nextLine();
					String prodDescr = scan.nextLine();
					Prod.setProductDescription(prodDescr);
					System.out.println("Enter product price:");
					int prodCost = scan.nextInt();
					Prod.setProductCost(prodCost);
					System.out.println("Enter product Image URL:");
					String prodImage = scan.next();
					Prod.setProductImageUrl(prodImage);
					productService.addProduct(Prod);
					System.out.println("***************************************************************************************");
					System.out.println("Do you want to continue?(y/n)");
					proceed = scan.next().charAt(0);
					break;
				case 3:
					List<ProductPojo> allProducts = productService.getAllProducts();
					System.out.println("***************************************************************************************");
					System.out.println("ID\tNAME");
					System.out.println("***************************************************************************************");
					allProducts.forEach((item)-> System.out.println(item.getProductId() + "\t" + item.getProductName()));
					System.out.println("***************************************************************************************");
					System.out.println("Enter the ID of the product you would like to delete: ");
					int delItem = scan.nextInt();
					productService.deleteProduct(delItem);
					System.out.println("***************************************************************************************");
					System.out.println("Do you want to continue?(y/n)");
					proceed = scan.next().charAt(0);
					break;
				case 4:
					List<ProductPojo> omniProducts = productService.getAllProducts();
					System.out.println("***************************************************************************************");
					System.out.println("ID\tNAME");
					System.out.println("***************************************************************************************");
					omniProducts.forEach((item)-> System.out.println(item.getProductId() + "\t" + item.getProductName()));
					System.out.println("***************************************************************************************");
					System.out.println("Enter the ID of the product you would like to edit: ");
					int edItem = scan.nextInt();
					ProductPojo edProd = productService.getAProduct(edItem);
					System.out.println("*****************************");
					System.out.println("1. Edit product name");
					System.out.println("2. Edit product description");
					System.out.println("3. Edit product price");
					System.out.println("4. Edit product Image URL");
					System.out.println("*****************************");
					System.out.println("Please enter an option:");
					int choice = scan.nextInt();
					switch(choice) {
						case 1:
							System.out.println("current name is: " + edProd.getProductName() );
							System.out.println("enter new name: ");
							String newName = scan.next();
							edProd.setProductName(newName);
							productService.updateProduct(edProd);
							break;
						case 2:
							System.out.println("current description is: " + edProd.getProductDescription() );
							System.out.println("enter new description:");
							scan.nextLine();
							String newDescr = scan.nextLine();
							edProd.setProductDescription(newDescr);
							productService.updateProduct(edProd);
							break;
						case 3:
							System.out.println("current price is: " + edProd.getProductCost() );
							System.out.println("enter new price:");
							int newPrice = scan.nextInt();
							edProd.setProductCost(newPrice);
							productService.updateProduct(edProd);
							break;
						case 4:
							System.out.println("current image URL is: " + edProd.getProductImageUrl() );
							System.out.println("enter new image URL:");
							String newURL = scan.next();
							edProd.setProductImageUrl(newURL);
							productService.updateProduct(edProd);
							break;
					}
					System.out.println("****************************************************************************************");
					System.out.println("Do you want to continue?(y/n)");
					proceed = scan.next().charAt(0);
					break;
				case 5:
					System.out.println("***************************************************************************************");
					System.out.println("Thank you for using Product Management System!!");
					System.out.println("***************************************************************************************");
					System.exit(0);
				default:
					
			}
			
		}
		System.out.println("***************************************************************************************");
		System.out.println("Thank you for using Product Management System!!");
		System.out.println("***************************************************************************************");
		System.exit(0);
	}

}
