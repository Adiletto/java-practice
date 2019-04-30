package homeWork_Assignments;

import java.util.Scanner;

public class Assignment089_Repeat_Separater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		
		String bigstr = "";
		bigstr = word;

		for (int i = 1; i < count; i++) {
			bigstr += separator+word;
		}

		
		System.out.println(bigstr);

	}

}
