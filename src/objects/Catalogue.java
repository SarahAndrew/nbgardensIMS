package objects;

public class Catalogue {

	private String productName;
	private int productID;
	private int pageNumber;
	private String description;
	
	
	public Catalogue(String productName, int productID, int pageNumber, String description) {
		this.productName = productName;
		this.productID = productID;
		this.pageNumber = pageNumber;
		this.description = description;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public int getProductID() {
		return productID;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public String getDescription() {
		return description;
	}	
}
