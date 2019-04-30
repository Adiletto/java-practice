package homeWork_Assignments;
import java.util.*;
public class Assignment079_StringNoEnd {

	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter a word:");
	    String txt = s.next();
	    //your code here

	 txt= txt.substring(0,txt.length()-1);
	 
	 System.out.println(txt);
	 
	 
	 //System.out.println(txt.substring(txt.length()-1));
	 
	  
	}

}
