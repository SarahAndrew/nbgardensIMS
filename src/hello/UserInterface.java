package hello;

import java.util.Scanner;

public class UserInterface {
	private static String username;
	private static String password;

/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		OracleConecgtions oc = new OracleConecgtions();
		Scanner sc = new Scanner(System.in);
		UserInterface ui = new UserInterface();
		System.out.println("Please enter your username");
		username = sc.next();
		System.out.println("Please enter your password");
		password = sc.next();
		oc.getConn(username,password);
//		ui.login(username, password);
//		if login true
//			menu();
		sc.close();	
	}

//	private boolean login(String user, String pass) {
//		while(false){
//		if(	oc.getConn(user,pass) return conn){
//			return true;
//		}
//		else
//			return false;
//		System.out.println("Hello Wrold");
//		}
//
//		return false;
//	}
	
	

}
