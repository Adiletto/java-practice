package day015_String_Manipulations;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String item = "java";
		String pageTitle = item + " - Google Search";
		
		// test pageTitle starts
		
		if (pageTitle.startsWith(item)) {
			System.out.println("PASS: Page Title check passed");
		}else {
			System.out.println("FAIL: Page Title check failed");
		}
		
		
		if (pageTitle.endsWith(" - Google Search")) {
			System.out.println("PASS: Google search is in title");
		}else {
			System.out.println("FAIL: Google search is in title");
		}
		
		
		
		
	}

}
