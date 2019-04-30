package day011_Logical_Nestedif;

import java.util.Scanner;

public class LogInTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username, password;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username ");
		username = scan.next();
		
		System.out.println("Enter password ");
		password = scan.next();
		
		String validUsername = "cybertek@gmail.com"; 
		String validPassword = "WoodenSpoon123";
			// username = "cybertek@gmail.com"
			//password = "aber324"
		
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Succesfull, Welcome!");
			
		} else if (!username.equalsIgnoreCase(validUsername) && !password.contentEquals(validPassword)) {
			System.out.println("Invalid username and invalid password");
			
		} else if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Password");
			
		}else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		}
		
		
		
		
		
	}

}
