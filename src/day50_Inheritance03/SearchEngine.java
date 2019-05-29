package day50_Inheritance03;

public class SearchEngine {

	public int search(String item) {
		System.out.println("Searching for: " + item);
		int resultsCount = item.length();
		return resultsCount;
	}
	
	public void search(String item, String item2) {
		System.out.println("Searching for 2 items: " + item+", "+item2);
		int resultsCount = item.length() + item2.length();
		System.out.println("Total Count: " + resultsCount);
	}
	
	String clickResult() {
		System.out.println("Clicking result");
		return "Search search page";
	}
}
