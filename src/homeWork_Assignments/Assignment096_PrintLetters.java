package homeWork_Assignments;

import java.util.Scanner;

public class Assignment096_PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);

		while (start <= end) {
			System.out.print(start);
			start++;
		}

	}
}