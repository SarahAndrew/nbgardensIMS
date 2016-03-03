package hello;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class Test {

	
	public static void main(String[] args) {
		getConn("SYSTEM", "cymryd");
	

	}
	
	public static Connection getConn(String user, String pass) {
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
}
