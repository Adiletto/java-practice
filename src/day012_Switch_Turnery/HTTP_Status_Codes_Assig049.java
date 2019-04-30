package day012_Switch_Turnery;

  import java.util.*;
  
  	public class HTTP_Status_Codes_Assig049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//public class Main {
		  //public static void main(String[] args) {
		    //DO NOT CHANGE
		    
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter status code:");
		    int status = scan.nextInt();
		    //WRITE YOUR CODE HERE 
		    
		    switch (status) {
		    case 200:
		    	System.out.println("OK");
		    	break;
		    case 201:
		    	System.out.println("Created");
		    	break;
		    case 202:
		    	System.out.println("Accepted");
		    	break;
		    case 302:
		    	System.out.println("Moved Permanently");
		    	break;
		    case 303:
		    	System.out.println("See Other");
		    	break;
		    case 307:
		    	System.out.println("Temporary Redirect");
		    	break;
		    case 400:
		    	System.out.println("Bad Direct");
		    	break;
		    case 401:
		    	System.out.println("Unauthorized");
		    	break;
		    case 403:
		    	System.out.println("Forbidden");
		    	break;
		    case 404:
		    	System.out.println("Not Found");
		    	break;
		    case 410:
		    	System.out.println("Gone");
		    	break;
		    case 500:
		    	System.out.println("Internal server Error");
		    	break;
		    case 503:
		    	System.out.println("Service Unavailable");
		    	break;
		    	default:
		    		System.out.println("Invalid status code!");
		    		break;
		    	
		    }
		    
		   
		    /*
		   
		    400, Bad Request
		    401, Unauthorized
		    403, Forbidden
		    404, Not Found
		    410, Gone
		    500, Internal Server Error
		    503, Service Unavailable

		    Given an int variable status, write a switch statement that prints out, on a line by itself, 
		    the appropriate label from the above list based on status. 
		    Otherwise, print warning message: "Invalid status code!".

		    Example:
		    Display message: "Enter status code:"
		    input: 200
		    Display message: "OK"
		*/
		
		
		
		
	}

}
