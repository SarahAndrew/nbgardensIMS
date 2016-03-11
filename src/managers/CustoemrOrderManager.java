package managers;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;

import hello.OracleConecgtions;

public class CustoemrOrderManager {
	OracleConecgtions oc = new OracleConecgtions();
	public void searchForCustomerOrder(){
		
	}
	
	public void printCustomerOrder(){
		
	}
	
	public void readCustomerOrder(int id) {
		String queryOrder = "SELECT * FROM customerOrder WHERE customerOrder_ID = " + id;
		
		CachedRowSet crs = oc.query(queryOrder);
		try {
			while (crs.next()) {
				
				
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void readCustomerOrderLines(int id){
		String queryOrder = "SELECT * FROM customerOrderLines WHERE customerOrder_ID = " + id;
		
		CachedRowSet crs = oc.query(queryOrder);
		try {
			while (crs.next()) {
				
				
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
