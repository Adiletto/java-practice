package day13_Ternary_Intro;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result;
		int score = 90;
		
		/*if (score > 60) {
			result = "pass";
		}else {
			result = "fail";
		}
		*/
		
	result = (score > 60) ? "pass": "fail";
		System.out.println("Result is "+ result);
		
		
		
	}

}
