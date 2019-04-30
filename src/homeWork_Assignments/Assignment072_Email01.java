package homeWork_Assignments;
import java.util.*;
public class Assignment072_Email01 {
	public static void main(String[] args) {
		
		//import java.util.Scanner;

		//public class Main {
		  //public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    
		
		if (email.contains("_")) {
			String firstName = email.substring(email.indexOf(0)+1, email.indexOf("_"));
			String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
			System.out.println(lastName+"_"+firstName+"@gmail.com");
		}else {
			System.out.println(email);
		}
		
		
		
		
		
		
		
		
		
	}

}
