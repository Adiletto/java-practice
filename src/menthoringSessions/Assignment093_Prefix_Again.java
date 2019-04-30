package menthoringSessions;

import java.util.Scanner;

public class Assignment093_Prefix_Again {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		if (str.length()>1 && str.substring(n+1, str.length()-1).contains(str.substring(0, n))) {
			System.out.println(true);
		} else {
			System.out.println(false);


		}

		
	}

}
