package homeWork_Assignments;
	import java.util.Scanner;
public class Assignment054_Calendar {
	
	//class Main {
	  public static void main(String[] args) {
	    //WRITE YOUR CODE HERE
		  
		  //int num;
		  String  month= ""; //January, February, March, April, May;
	    Scanner scan = new Scanner (System.in);
	    System.out.println("Enter month number");
	     int num = scan.nextInt();
	    
	    switch (num){
	      case 1: 
	        num = 1;
	        month = "January";
	        break;
	      case 2:
	    	  num = 2;
	    	  month = "February";
	    	  break;
	      case 3:
	    	  num = 3;
	    	  month = "March";
	    	  break;
	      case 4: 
	    	  num = 4;
	    	  month = "April";
	    	  break;
	      case 5:
	    	  num = 5;
	    	  month = "May";
	    	  break;
	      case 6:
	    	  num = 6;
	    	  month = "June";
	    	  break;
	      case 7:
	    	  num = 7;
	    	  month = "July";
	    	  break;
	      case 8:
	    	  num = 8;
	    	  month = "August";
	    	  break;
	      case 9:
	    	  num = 9;
	    	  month = "September";
	    	  break;
	      case 10:
	    	  num = 10;
	    	  month = "October";
	    	  break;
	      case 11:
	    	  num = 11;
	    	  month = "November";
	    	  break;
	      case 12:
	    	  num = 12;
	    	  month = "December";
	    	  break;
	    	  default:
	    		  System.out.println("Is that new month?");
	    }
	    System.out.println(month);
	  }
	}


