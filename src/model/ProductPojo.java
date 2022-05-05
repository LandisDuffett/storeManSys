package model;

// private variables
// default constructore
// parametrized constructor
// public getters/setters
// toString
// equals - if required
// hashCode - if required

public class ProductPojo {
	
	private int productId;
	private String productName;
	private String productDescription;
	private int productCost;
	private String productImageUrl;
	
	public ProductPojo() {
		
	}

	public ProductPojo(int productId, String productName, String productDescription, int productCost,
			String productImageUrl) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCost = productCost;
		this.productImageUrl = productImageUrl;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	@Override
	public String toString() {
		return "ProductPojo [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productCost=" + productCost + ", productImageUrl=" + productImageUrl + "]";
	}

	
}
