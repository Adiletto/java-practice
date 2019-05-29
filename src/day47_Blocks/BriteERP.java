package day47_Blocks;

import java.time.LocalDateTime;

public class BriteERP {

	static { //this will run automatically
		System.out.println("Launch Browser");
		System.out.println("Naviagte to: " + TestData.url);
		System.out.println();
	}

	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}

	public static void enterPassword() {
		System.out.println("Enter password: " + TestData.password);
	}

	public static void verifyLogin() {
		System.out.println("Expected name: Viktoria Lugovska");
		System.out.println("Actual Name displayed: Viktoria Lugovska");
		System.out.println("Login Successful - " + LocalDateTime.now());

	}

}
