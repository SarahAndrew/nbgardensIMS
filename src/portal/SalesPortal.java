package portal;

import java.util.Scanner;

import managers.ProductManagement;

public class SalesPortal extends PortalSupper{

	@Override
	public void menu() {
		Scanner sc = new Scanner(System.in);
		ProductManagement pm = new ProductManagement();
		//as the sales person doesn't do much in the IMS they only have one function
//		System.out.println("What would you like to do?");
//		System.out.println("1   check stock levels for product");
		
		System.out.println("Please enter the product ID");
		int id = sc.nextInt();
		pm.readProduct(id);
		
	}

}
