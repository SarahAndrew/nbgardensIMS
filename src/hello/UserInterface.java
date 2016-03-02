package hello;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		int x = 8;
		login(x);
	}

	private static void login(int x) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter an interger");
		while(x>7){
			x = sc.nextInt();
			if(x<=7){
				System.out.println("You are logged in");
				}
			else
				System.out.println("Try again");
		}
		System.out.println("Hello Wrold");
		sc.close();
	}
	
	

}
