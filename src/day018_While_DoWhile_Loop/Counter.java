package day018_While_DoWhile_Loop;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		int num = 1;
		
		while (num <= 10) {
			System.out.print(num+", ");  //since PRINT without LN, it will print on the same line
			num++;
			Thread.sleep(1000); // pause the code execution for a second
		}
		
		System.out.println("\nNum value after loop: "+num);
		
		System.out.println();
		
		//11, 10, 9, 8, 7, --> 1.
		int num2 = 11;
		
		while (num2 > 0) {
			System.out.print(num2+",-> ");
			num2--;
			Thread.sleep(456);
		}
		
		System.out.println("\nNum2: "+num2);
		
	}

}
