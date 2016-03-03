package objects;

public class StockOrderLine {
	private int productID;
	private int quantityExp;
	private int quantityRec;
	private float price;
	public StockOrderLine(int productID, int quantityExp, int quantityRec, float price) {
		this.productID = productID;
		this.quantityExp = quantityExp;
		this.quantityRec = quantityRec;
		this.price = price;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getQuantityRec() {
		return quantityRec;
	}
	public void setQuantityRec(int quantityRec) {
		this.quantityRec = quantityRec;
	}
	public void setQuantityExp(int quantityExp) {
		this.quantityExp = quantityExp;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
