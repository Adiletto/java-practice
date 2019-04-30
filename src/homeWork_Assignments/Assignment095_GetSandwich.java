package homeWork_Assignments;
import java.util.Scanner;
public class Assignment095_GetSandwich {

	//public class Main {
		  public static void main(String[] args) {
		     Scanner scan = new Scanner(System.in);
		     String str = scan.next();
		     
		     int count =0;
		     
		     for (int i = 0; i < str.length()-4; i++) {
		       
		       if(str.substring(i, i+5).equals("bread")) {
		         count++;
		       } 
		     }
		     if (count <=1) {
		    	 System.out.println("nothing");
		    	 System.exit(0);
		     }else {
		    	 
		     
	System.out.println(str.substring((str.indexOf("bread")+5), (str.lastIndexOf("bread"))));
	
		     }
}
}