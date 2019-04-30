package day016_String_Manipulation;

import java.util.Scanner;

public class GetNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a sentence:");
		String str = scan.next();
		str = " I wrote [996] lines of code today";
		
		int start = str.indexOf("[")+1 ;
		int end = str.indexOf("]");	
		
		String codeCount = str.substring(start, end);
		System.out.println("Lines of code: "+codeCount);
		
		System.out.println("Lines of code: "+str.substring(str.indexOf("[")+1, str.indexOf("]")));// same thing with above, just shorter
		
		// check if  codeCount is more that 20
		
		int count = Integer.parseInt(codeCount);
		
		if (count > 20) {
			System.out.println("I wrote more than 20 lines of code today!!!");
		} else {
			System.out.println("NOt enough coding for today");
		}
		
		
		
	}

}
