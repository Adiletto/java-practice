package day23_Loops_And_Arrays;

public class PrintNumbersWithNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //for (int j =1; j <= 2; j++) {

		for (int i = 1; i <= 10; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();

		}
		
		for (int i = 10; i >=1; i--) {
			for (int k =1; k <=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
		
	}
}