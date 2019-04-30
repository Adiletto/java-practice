package homeWork_Assignments;
import java.util.*;
public class Assignment106_Array_SplitSentence {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	
	    String [] adik = sentence.split(" ");
	    //System.out.println(adik);
	    //System.out.println(Arrays.toString(adik));
	    
	    
	    for (String str: adik) {
	    	System.out.println(str);
	    }
	    
	    
//	    //sentence -> "Java is fun"
//	    Print
//	    Java
//	    is
//	    fun
	    
	    
}
}