package day18_While_DoWhile_Loop;
public class StairCase {
	public static void main(String[] args) {
/*
 ** 
 ***
 ****
 *****
 ******
 */
		String stairs = "*";
		System.out.println(stairs); stairs +="*";
		
		//stairs += stairs + "*";
		stairs +="*";
		
		
		//with a counter VERSION #1
		int num = 1;
		while (num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;	
		}
		
		System.out.println();
		 // 2) checking length(); VERSION #2
		
		stairs = "*";
		while (stairs.length()<=10) {
			System.out.println(stairs);
			stairs += "*";
		}
		
	}

}
