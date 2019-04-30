package day016_String_Manipulation;

public class extraEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java";
		String result = "";
		
		if (str.length() ==2 ){
			result = str+str+str;
		}else {
			result = str.substring(str.length()-2);
			result = result + result + result;
			//result += result + result;
		}
		System.out.println(result);
		
	}

}
