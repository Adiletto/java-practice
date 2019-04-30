package homeWork_Assignments;
import java.util.*;
public class Assignment122_ZombieAttack01 {

	//class Main {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	   int day=0;
	   
	   System.out.println("Day "+day+Arrays.toString(inhabitants));
	   day =1;
	   
	   while (true) {
		 
		   int alivePeople = 0;
		   
		   for (int i =0; i < inhabitants.length; i++) {
			   alivePeople += inhabitants[i];
		   }
		   if (alivePeople == 0) {
			   break;
		   }
		   
		   for (int k =0; k < inhabitants.length; k++) {
			   inhabitants[k]/=2;
		   }
		   System.out.println("Day "+day+Arrays.toString(inhabitants));
		   day++;
	   }
	   
	   System.out.println("---- EXTINCT ----");
	  }
	}
	
	

