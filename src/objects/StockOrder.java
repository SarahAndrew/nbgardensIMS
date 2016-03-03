package objects;

import java.util.ArrayList;

public class StockOrder {
	private int stockOrderID;
	private int supplierID;
	private ArrayList<StockOrderLine> StockOrderLines;
	public StockOrder(int stockOrderID, int supplierID, ArrayList<StockOrderLine> stockOrderLines) {
		this.stockOrderID = stockOrderID;
		this.supplierID = supplierID;
		StockOrderLines = stockOrderLines;
	}
	
	
	
}
