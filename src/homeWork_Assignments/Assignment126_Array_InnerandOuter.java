package homeWork_Assignments;
import java.util.*;
public class Assignment126_Array_InnerandOuter {

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			int sizeInner = scan.nextInt();
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			for(int i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			for(int j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			//WRITE YOUR CODE HERE
			int count =0;
			for (int first : inner) {
			  for(int second : outer) {
				  if(first == second) {
					  count++;
					  break;
				  }
			  }
			}
			if (count == inner.length) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
			
	  }
	}
	

