package homeWork_Assignments;
import java.util.*;
public class Assignment119_Arrays_AverageTemp {


	  public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
			int k = 0;
			double total = 0;
			double avgTemp = 0;
			double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
					scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
			
			for (k =0; k < temps.length; k++) {
				total+=temps[k];
			}
		
			avgTemp = total/temps.length;
			
			System.out.println(avgTemp);
			
	  }
	}
	
	
	
	
	
//Example: 
//input: 80 88 88 84 82 78 60 68
//output: 78.5
