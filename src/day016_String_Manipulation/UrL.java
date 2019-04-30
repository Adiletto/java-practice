package day016_String_Manipulation;

import java.util.Scanner;

public class UrL {

	public static void main(String[] args) {
	

		
		//String url = "www.amazon.com";
		
		
		//starts with "www"
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url:");
		  String url = scan.next();
	
		 if (url.startsWith("www.")) {
			 System.out.println("www. is present");
			 //System.out.println(url.substring(4,10));
		 } else {
			 System.out.println("Invalid url format");
			 return;
		 }
		
		//if contains the ending dot right b4 the extension
		//find out the length of the url
		//do -4 and using charAt get the character
		
		
		int dotIndex = url.length() - 4;  //first approach
		//url.lastIndexOf("."); //second approach
		
		if (url.charAt(dotIndex) == '.' ){
				System.out.println(". is there b4 extension");
		}else {
			System.out.println(". might be misplaced");
		}
	/*	
		System.out.println();
		
		if (url.charAt(url.length()-4 ) == '.') {
			
		}
	*/
		
		//assign String domain and String extension.
				// then print out: "Domain: amazon"  "extension:com"
			
		String domain = url.substring(4, dotIndex);
		System.out.println("Domain is: "+domain);
		
		
		String extension = url.substring(dotIndex+1, url.length());
		System.out.println("Extension: "+extension);
	}

}
