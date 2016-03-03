package hello;

import java.util.Scanner;

public class UserInterface {
	


	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		OracleConecgtions oc = new OracleConecgtions();
		int x = 8;
		ui.login(x);
		
		
	}

	private boolean login(int x) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter an interger");
		while(x>7){
			x = sc.nextInt();
			if(x<=7){
				System.out.println("You are logged in");
				return true;
				}
			else
				System.out.println("Try again");
			return false;
		}
		System.out.println("Hello Wrold");
		
		sc.close();
		return false;
	}
	
	

}
