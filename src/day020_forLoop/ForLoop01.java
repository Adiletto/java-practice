package day020_forLoop;

public class ForLoop01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Using for loop print "Love Java!" 10 times
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Love Java!");
		}
		
		System.out.println();
		
		//print num 5 to 15 using a for loop
		
		for (int i = 5; i <= 15; i++) {
			System.out.println("Number: "+i);
		}
		
		System.out.println();
		
		//using for loop print 20 to 10
		
		for (int num = 20; num >= 10; num--) {
			System.out.print(num+" -> ");
			Thread.sleep(456);
		}
	}
	
}
