package portal;

import java.util.Scanner;

import managers.ProductManagement;

public class IMPortal extends PortalSupper{
	private int id;
	
	@Override
	public void menu() {
		Scanner sc = new Scanner(System.in);
		ProductManagement pm = new ProductManagement();
		System.out.println("What would you like to do?");
		System.out.println("1   place stock order");
		System.out.println("2   read a product's infomation");
		int opt = sc.nextInt();
		if(opt ==1){
			System.out.println("That's cool");
			System.out.println("However I haven't written this function yet");
		}
		if(opt ==2){
			System.out.println("Please enter product ID");
			id = sc.nextInt();
			pm.readProduct(id);
		}
		
		sc.close();
//		pm.addProduct(5, "nick clegg statue", 0, 0, 1);
		
	}

}
