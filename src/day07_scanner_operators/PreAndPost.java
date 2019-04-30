package day07_scanner_operators;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int num2 = num++;
		
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);

		int n = 0;
		int n2 = ++n;
		
		System.out.println("n: " + n);
		System.out.println("n2: " + n2);

		int i = 10;
		i++;   //add 1
		++i;   //add 1
		System.out.println("I value: " +i);
		
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println("bananas: " + bananas);
		System.out.println("pears: " + pears);
		System.out.println("apples: " + apples);
		
		
		int friends = 10;
		System.out.println(friends++);    //(show the value first then add 1)
		System.out.println(friends);
		
		
		System.out.println(++friends); //(add 1 first and show the value)
		System.out.println(friends);
		
		int p1 = 10;
		int sum = p1++ +5; // p1+5 and assign to sum    //p = p+1;
		
		System.out.println("sum: "+ sum);
		System.out.println("p1: "+ p1);
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalbatteries = batteries++ + ++oldBatteries;
		System.out.println("batteries: " + batteries); //9
		System.out.println("oldBatteries: " + oldBatteries); //6
		System.out.println("totalBatteries: " + totalbatteries); //14
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
