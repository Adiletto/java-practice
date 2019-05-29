package day48_Inheritance01;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.name = "Urma";
		emp1.jobTitle = "Senior Developer";
		emp1.gender = 'm';
		emp1.age = 28;
		
		Employee emp2 = new Employee();
		emp2.name = "Bratan";
		emp2.age = 26;
		emp2.age = 'm';
		emp2.jobTitle = "HR";
		
		emp1.work();
		emp2.work();
		
		emp1.eat("chicken kesedia");
		emp2.eat("salad");
		
		emp1.walk();
		emp2.walk();
		
		emp1.sleep(6);
		emp2.sleep(8);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}
}
