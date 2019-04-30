package homeWork_Assignments;
import java.util.Scanner;
public class assignment073_Email02 {
		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		//Input: craig_federighi@apple.com
		  String firstName = email.substring(email.indexOf(0)+1,email.indexOf("_"));
		  firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
		    String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
		    lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
		    String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
		    String tLdomain = email.substring(email.indexOf(".")+1) ;
		    
		    System.out.println("First name: "+firstName+"\nLast name: "+lastName+"\nDomain: "+domain+"\nTop-Level Domain: "+tLdomain);
		    

	}

			}


