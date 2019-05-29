package day11_Logical_Nestedif;
	import java.util.*;
		public class homeWork_Assig045_BurgerOrChicken {

	//class Main {
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    String in = s.next();
	    
	    //your code here
	    float chiKbuR=10.0f;
        float S=2.0f;

         if(in.equalsIgnoreCase("burger") || in.equalsIgnoreCase("chicken")) {
                 System.out.println("output: "+chiKbuR);
         } else if (in.equalsIgnoreCase("soda")) {
                 System.out.println("output: "+ S);


         }
	
	
}
}
		