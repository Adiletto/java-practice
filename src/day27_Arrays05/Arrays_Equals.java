package day27_Arrays05;

import java.util.Arrays;

public class Arrays_Equals {
public static void main(String[] args) {
	
	int [] num1 = {3, 5, 6, 10, 100};
	int [] num2 = {3, 5, 6, 10, 100};

	System.out.println(Arrays.equals(num1, num2));
	
	
	if (Arrays.equals(num1, num2)) {
		System.out.println("They are exactly same");
	} else {
		System.out.println("Mismatch values present");
	}
	
	System.out.println("**** EQUALS WITH STRING ****");
	
	String [] strArr1 = {"one", "two", "three"};
	String [] strArr2 = {"one", "two", "three"};
	
	System.out.println(Arrays.equals(strArr1, strArr2));

	boolean match = Arrays.equals(strArr1, strArr2);
	System.out.println("Match: "+match);
	

}
}
