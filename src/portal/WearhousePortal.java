package portal;

import java.util.Scanner;

import managers.CustoemrOrderManager;

public class WearhousePortal extends PortalSupper{
	CustoemrOrderManager com = new CustoemrOrderManager();
	@Override
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1 Read customer order");
		System.out.println("2 Read stock order");
		System.out.println("3 Find stock location");
		
		int option = sc.nextInt();
		if (option==1){
			System.out.println("What is the order ID");
			int id = sc.nextInt();
			com.readCustomerOrder(id);
		}
		if (option==2){
					
		}
		if (option==3){
			
		}
		else{
			System.out.println("That wasn't a valid option");
		}
		
		sc.close();
	}

}
