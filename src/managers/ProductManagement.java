package managers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;

import hello.OracleConecgtions;

public class ProductManagement {
	private Connection conn = null;
	private Statement stmt;
	
	private int stockLevel;
	private ArrayList<String> locations;
	private static String username= "SYSTEM";
	private static String password = "cymryd";
	OracleConecgtions oc = new OracleConecgtions();
	
	/**
	 * The next two methods are to check the stock level of a product,
	 * They have the same name but take different vales in so method overloading can be used
	 * The first one returns a 
	 * @param name
	 * @return
	 */
	public int checkStockLevel (String name){
		
		return stockLevel;
	}
	/**
	 * this method tells you the stock level of a product given it's id
	 * @param id
	 * @return
	 */
	public int checkStockLevel(int id){
		
		return stockLevel;
	}
	
	public ArrayList<String> findLocationUsingID(){
		
		return locations;
	}
	
	public void readProduct(int id) {
		String query = "SELECT * FROM products WHERE product_ID = " + id;
		CachedRowSet crs = oc.query(query);
		try {
			while (crs.next()) {
				String prodName = crs.getString("name");
				System.out.println(prodName);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addProduct(int id, String name, int quantity, float price, int discontinued) {
		String query = "INSERT INTO products VALUES (" + id + ", '" + name + "', " + quantity + ", " + price + ", " + discontinued + ")";
		oc.update(query);
	}
	
}
