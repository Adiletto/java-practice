package day23_Loops_And_Arrays;

public class LoopNumbers {

	/*
	 * ========== TASK loop through the numbers from 1 till 50 print each number in
	 * the same line if number is divisible by 5 (n%5==0), skip it if number is
	 * divisible by 20, then exit the loop
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {

			if (i % 20 == 0) {
				break;

			}

			if ((i % 5 == 0)) {
				continue;

			}
			System.out.print(i + ", ");

		}

	}
}