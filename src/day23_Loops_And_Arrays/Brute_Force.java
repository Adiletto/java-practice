package day23_Loops_And_Arrays;


import java.util.Scanner;

public class Brute_Force {

	public static void main(String[] args) {

		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 5;

		Scanner keyboard = new Scanner(System.in);

		do {
			if (attempts-- == 0) {
				System.out.println("You have exceed number of attempts!");
				System.out.println("This user has been deactivated for 30 mins");
			return;
			}
			System.out.println("Please enter username:");
			username = keyboard.next();
			if (!username.equals(expectedUserName)) {
				System.out.println("Wrong username");
				System.out.println("Attempts left: "+attempts);
				continue;
			}
			System.out.println("Please enter password:");
			password = keyboard.next();
			if (password.equals(expectedPassword)) {
				System.out.println("Wrong Password!");
				System.out.println("Attempts left: "+attempts);
				continue;
			}
		} while (!username.equals(expectedUserName) || !password.equals(expectedPassword));
		
		System.out.println("Login Successfull");
		
		
	}

}
