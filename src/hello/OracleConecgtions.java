package hello;

import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class OracleConecgtions {
	OracleConections oc = new OracleConections;
	
/**
 * this method connects to the Oracle database
 * @param url
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
			System.out.println("you are connected");
		} catch (SQLException e) {
			System.out.println("this did not work");
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public CachedRowSet query(String query) {
		
		getConn = getConn("SYSTEM","cymryd");
	}
	
	
	public void closeConn(Statement stat, Connection conn) {
		if (stat != null)
			try {
				stat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	}
}
