package homeWork_Assignments;
import java.util.*;
public class Assignment055_Weekdays {

	

	//public class Main {
	  public static void main(String[] args) {
	    //WRITE YOUR CODE HERE 
	    Scanner keyboard = new Scanner (System.in);
	    System.out.println("Enter number:");
	    int num = keyboard.nextInt();
	    String weekday = "";
	    
	    switch (num){
	      case 1:
	        num = 1;
	        weekday = "Monday";
	        break;
	        case 2:
	          num = 2;
	          weekday = "Tuesday";
	          break;
	          case 3:
	            num =3;
	            weekday = "Wednesday";
	            break;
	            case 4:
	              num = 4;
	              weekday = "Thursday";
	              break;
	              case 5:
	                num = 5;
	                weekday = "Friday";
	                break;
	                case 6:
	                  num = 6;
	                  weekday = "Saturday";
	                  break;
	                  case 7:
	                    num = 7;
	                    weekday = "Sunday";
	                    break;
	                    default:
	                    System.out.println("Invalid number!");
	    }
	    
	    System.out.println(weekday);
	    
	    
	  }
	}

