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
		
	}
	
}
