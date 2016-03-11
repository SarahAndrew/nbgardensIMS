package hello;

import java.util.Scanner;

import managers.ProductManagement;

public class UserInterface {
	private static String username= "SYSTEM";
	private static String password = "cymryd";
	

/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		ProductManagement pm = new ProductManagement();
		OracleConecgtions oc = new OracleConecgtions();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your username");
		username = sc.next();
		System.out.println("Please enter your password");
		password = sc.next();
		oc.getConn(username,password);
		

		
		sc.close();
	}

	private String department(String user,String pass){
		
		return "x";
		
	}
	

}
