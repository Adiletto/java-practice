package day11_Logical_Nestedif;

public class LogicalBooleanValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			boolean b1 = 50 > 10 && 10 > 100;
			System.out.println("B1: " + b1);
			
				boolean b2 = 'a' == 'a' && 123 > 120;
				System.out.println("B2: " + b2);
			
					boolean b3 = true && 10 >= 10 && 1000 <= 900;
					System.out.println("B3 : " + b3);
			
			boolean b4 = false && false && 10 == 10; // if there is 1 false, everything turns to false
			System.out.println("B4: " + b4);
			
			boolean b5 = false || true && 10 == 10;
			System.out.println("B5: " + b5); //true
			
			boolean b6 = false && true || 10 == 10;
			System.out.println("B6: " + b6); //true
			
			boolean b7 = true && true || 10 == 10;
			System.out.println("B7: " + b7);  //true
			
			boolean b8 = false && (true || 10==10);
			System.out.println("B8: " + b8); //false
			
			boolean topicDone = true;
			boolean isMoreThan3Pm = true;
			boolean everyThingIsClear = true || false;
			
			boolean letsGoForABreak = topicDone && isMoreThan3Pm && everyThingIsClear;
			
			System.out.println("LetsGoForABreak: " + letsGoForABreak);
			
			
			boolean b9 = !(true || false) && true;
			System.out.println("B9: " + b9);
			
			boolean b10 = !true || true && true;
			System.out.println("B10: " + b10);
			
			boolean b11 = true;
			System.out.println(!!b11); //(if there is more then one (! sign), just reverses the previous statement)
	}

}
