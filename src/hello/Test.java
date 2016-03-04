package hello;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class Test {

	
	public static void main(String[] args) {
		Test test = new Test();
		test.getConn("SYSTEM", "cymryd");
		
		test.selectEntity();
	}
	
	public Connection getConn(String user, String pass) {
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
	
	public <E> ResultSet selectEntity(E e, String user, String pass) {
		ResultSet rs = null;
		Connection conn = null;
		Statement stat = null;
		try {
			conn = getConn (user, pass);
			stat = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, 
					ResultSet.CONCUR_READ_ONLY);
			rs = stat.executeQuery("SELECT * FROM " + 
					e.getClass().getName().toLowerCase().substring(e.getClass().getName().lastIndexOf('.') + 1) + " e");
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			OracleConecgtions.closeConn (stat, conn);
		} return rs;
	}
	
}
