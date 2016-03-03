package hello;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class OracleConecgtions {
	
	
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
	
/**
 * I am not sure what this does at the moment
 * @param e
 * @param url
 * @param user
 * @param pass
 * @return
 */
	public <E> ResultSet selectEntity(E e, String url, String user, String pass) {
		ResultSet rs = null;
		Connection conn = null;
		Statement stat = null;
		try {
			conn = getConn (user, pass);
			stat = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stat.executeQuery("SELECT * FROM " + e.getClass().getName().toLowerCase().substring(e.getClass().getName().lastIndexOf('.') + 1) + " e");
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			closeConn (stat, conn);
		} return rs;
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
