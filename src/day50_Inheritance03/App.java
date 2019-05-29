package day50_Inheritance03;

public class App {

	private String name;
	public static int count;

	public App(String name) {
		this.name = name;
		System.out.println("No arg contructor");
	}

	public static void build (String language) {
		System.out.println("Building an app using " + language);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
