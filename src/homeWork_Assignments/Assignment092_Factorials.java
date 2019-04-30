package homeWork_Assignments;

import java.util.Scanner;

public class Assignment092_Factorials {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long result = 1;

		for (int i = 1; i <= n; i++) {
			result = result * i;
		}

		System.out.println(result);

	}

}
