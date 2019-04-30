package officeHours06_apr24;

public class StringUniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    //012345678
		String str = "jjavabook"; //vbk
		
		//outer loop will take one char at a time
		for (int i = 0; i < str.length(); i++){
			//read one char from str and store to temp
			char temp = str.charAt(i);   // j
			//set count as o each time
			int count = 0;
			//inner loop will help compare with other chars
			for (int j= 0; j < str.length(); j++) {
				//System.out.println(str.charAt(j));
				if (temp == str.charAt(j) && (i != j)) {
					//System.out.println(temp + " is duplicated");
					//if it is a match, increase count by 1
					count++;
					break;
				}
			}
			//outside inner loop check if count is still 0
			//if count is 0 then temp is unique 
			if (count == 0) {
				System.out.println(temp);
			}
		}		
		
		
		
	}

}
