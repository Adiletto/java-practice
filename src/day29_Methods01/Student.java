package day29_Methods01;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello();
		study();
		study();
		study();
		code();
		code();
		watchMovie();

	}

	public static void study() {
		System.out.println("Student is studying");
	}

//create a method with name sayHello(), that prints "Hello, Friends!"

	public static void sayHello() {
		System.out.println("Hello, Friends!");
		System.out.println("How are you today?");
	}
	//create a method with name code(),
	//"Inside code method"
	//"Student is coding Java"
	
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}
	
	public static void watchMovie() {
		System.out.println("Watch movie, once in the while.");
	}
	
	
	
	
}
