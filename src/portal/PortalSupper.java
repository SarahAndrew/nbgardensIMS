package portal;

import java.util.Scanner;

public abstract class PortalSupper{
	private Scanner sc;

	public abstract void menu();
	
	public void logout(){
		sc = new Scanner(System.in);
		System.out.println("Would you like to logout?");
		System.out.println("y or n");
		String answer = sc.nextLine(); 
		try {
			while (answer != "y" && answer!= "n"){//this catches if the user enters an invalid string
				System.out.println("That was not a valid input, please enter y or n");
				answer = sc.nextLine();
			}
			if (answer == "y"){
				System.exit(1);
			}
			if(answer=="n"){
				menu();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
