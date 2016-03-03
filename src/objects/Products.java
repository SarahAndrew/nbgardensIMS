package objects;

import java.util.ArrayList;

public class Products {
	private int productID;
	private String productName;
	private int qnt;
	private ArrayList<String> locations;
	
	public Products(int productID, String productName, int qnt, ArrayList<String> locations) {
		this.productID = productID;
		this.productName = productName;
		this.qnt = qnt;
		this.locations = locations;
	}
	
	
	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public ArrayList<String> getLocations() {
		return locations;
	}

	public void setLocations(ArrayList<String> locations) {
		this.locations = locations;
	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}
	
	
}
