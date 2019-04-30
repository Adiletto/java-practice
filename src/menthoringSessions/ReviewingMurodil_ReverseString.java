package menthoringSessions;

public class ReviewingMurodil_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String today = "tuesday";
		
		//print tues
		//print day
		
		String t = today.substring(0, 4);
		String d = today.substring(4);
		
		System.out.println(t+'\n'+d);
		
		//targeting "e"
		System.out.println(today.substring(2,3)); //e
		System.out.println(today.substring(4,5)); //d
		System.out.println(today.charAt(4));
		
		int i =4;
		System.out.println(today.charAt(i));
		
		for ( i =0; i < today.length(); i++) {
			//System.out.println(today.charAt(i));
			System.out.print(today.substring(i, i+1));
		}
		System.out.println();
		//          0123456
		 //today = "tuesday";
		
		for (int j = today.length()-1; j>=0; j--) {
			System.out.print(today.charAt(j)+"");
			
		}
		System.out.println();
		
		for (int s = today.length()-1; s>=0; s--) {
			System.out.print(today.substring(s, s+1)+" ");
		}
		
		System.out.println();
		
		//assign to variable
		//             876543210
		String word = "eclipse";
		String reversed = "";
		
		for (int r = word.length()-1; r >=0; r--) {
			//System.out.print(word.charAt(r));
			//read character and add to reversed
			reversed += word.charAt(r);
		}
		System.out.println(reversed+" ");
		
		//CHECK IF IT PALINDROME
		//civic
		//mom
		//dad
		//racecar
		
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		
		
		
		
	}

}
