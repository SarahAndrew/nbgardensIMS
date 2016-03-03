package objects;

public class CustomerOrderLine {
	private int productID;
	private int qnt;
	private String personalisation;
	private float price;
	
	public CustomerOrderLine(int productID, int qnt, String personalisation, float price) {
		this.productID = productID;
		this.qnt = qnt;
		this.personalisation = personalisation;
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public void setPersonalisation(String personalisation) {
		this.personalisation = personalisation;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
