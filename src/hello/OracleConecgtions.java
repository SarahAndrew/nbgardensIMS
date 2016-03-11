package hello;

import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.rowset.*;

import oracle.jdbc.pool.OracleDataSource;

public class OracleConecgtions {
	
/**
 * this method connects to the Oracle database
 * @param url
 * @param user
 * @param pass
 * @return
 */
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	CachedRowSet crs = null;
	
	/**
	 * This function connectes to the database 
	 * @param user
	 * @param pass
	 * @return
	 */
	public Connection getConn (String user, String pass) {
		Connection conn = null;
		try {
			OracleDataSource ds = new OracleDataSource();
			ds.setURL("jdbc:oracle:thin:@localhost:1521/xe");
			conn = ds.getConnection(user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
//	private String department(String user){
//		String deptQ = "SELECT department FROM employee WHERE username = "+user;
//		String dept = null;
//		try {
//			stmt = conn.createStatement();
//			dept = stmt.executeQuery(deptQ).toString();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}		
//		return dept;
//	}
	
	public CachedRowSet query(String query) {
		conn = getConn("SYSTEM","cymryd");
		try {
			crs = new CachedRowSetImpl();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			crs.populate(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConn( conn);
		conn = null;
		return crs;
	}
	
	public void update(String query) {
		conn = getConn("SYSTEM", "cymryd");
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	}
}
