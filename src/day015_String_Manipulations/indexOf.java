package day015_String_Manipulations;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				      //012345		
		String word1 = "github";
		System.out.println(word1.indexOf('g')); //0  ==> you can use either ("") or ('')
		System.out.println(word1.indexOf("th")); //2
		System.out.println(word1.indexOf("hub")); //3
		
		System.out.println(word1.indexOf("java")); 
		
		
		String url = "www.okta.com"; // looking for the (.).
		int index = url.indexOf(".");
		System.out.println("Position of . : "+index); //looking what is after (.).--> letter "0"
		System.out.println(url.charAt(index+1));
		
		
		
		String title = "Java - Google Search";
		//find position of '-' and check if space 
		// is on right and left sides
		int dash = title.indexOf("-");         //5
		System.out.println(title.indexOf("-")); //5
		
		System.out.println(title.charAt(dash-1));  //" "
		System.out.println(title.charAt(dash+1));  //" "
		
		System.out.println(title.charAt(dash-2));  // "a"
		System.out.println(title.charAt(dash+2));  // "G"
		
		
		String country = "United States og America";      //even though you're looking for a whole word
		int states = country.indexOf("States");           // it will give you only the starting (ondex)position
		System.out.println("Position of states is: "+states);
		
		
		String word2 = "java, c++, python, tomcat, eclipse";
		// check if c++ is in the word2
		
		// 1) using contains
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is NOT there");
		}
		// 2) using index of
		
		if(word2.indexOf("c++")> -1) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is NOT there");
		}
		
		
		//System.out.println(word2.indexOf("c++"));
	}

}
