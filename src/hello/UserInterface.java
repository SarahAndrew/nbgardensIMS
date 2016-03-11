package hello;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import managers.ProductManagement;
import portal.AccountManagementPortal;
import portal.IMPortal;
import portal.SalesPortal;
import portal.WearhousePortal;

public class UserInterface {
	private static String username;
	private static String password;
	private Statement stmt;

	ProductManagement pm = new ProductManagement();
	OracleConecgtions oc = new OracleConecgtions();

/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		String department;
		UserInterface ui = new UserInterface();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your username");
		username = sc.next();
		System.out.println("Please enter your password");
		password = sc.next();
		
		department =ui.login(username,password);
		
		String running = "yes";
		while(running =="yes"){
			if(department=="Sales"){
				SalesPortal s = new SalesPortal();
				s.menu();
			}
			if(department=="Warehouse"){
				WearhousePortal w = new WearhousePortal();
				w.menu();
			}
			if(department=="Accounts"){
				AccountManagementPortal a = new AccountManagementPortal();
				a.menu();
			}
			if(department=="Inventory Management"){
				IMPortal im = new IMPortal();
				im.menu();
			}
			else{
				System.out.println("you have a strange department");
			}
			System.out.println("Would you like to do something else? yes or no");
			running = sc.nextLine();
		}
		
		System.out.println("Thank you for using the system");
		sc.close();
	}
	
	/**
	 * this function checks if the user has a valid login and returns their department
	 * so that they can be redirected to an appropriant portal 
	 * @param username
	 * @param password
	 * @return
	 */
	private String login(String username,String password){
		Connection conn =null;
		while(conn==null){
			conn=oc.getConn(username,password);	
		}
		System.out.println("you are logged in");
		String deptQ = "SELECT department_id FROM employee WHERE username = "+ username;
		String dept = null;
		try {
			stmt = conn.createStatement();
			dept = stmt.executeQuery(deptQ).toString();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		System.out.println(dept);
		return dept;
	}

}
