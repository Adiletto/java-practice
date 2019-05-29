package day46_Static_Keyword;

public class CampusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Campus campus1 = new Campus("McLean");
		Campus campus2 = new Campus("Chicago");
		Campus campus3 = new Campus("New Jersey");
		Campus.campusInfo();
		Campus.campusInfo();
		Campus.campusInfo();
		
		System.out.println(Campus.country);
	}

}
